package ejemploArrayList.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ejemploArrayList.model.Chofer;
import ejemploArrayList.model.Taxi;

public class Main {
	private static Scanner scanner;
	private static List<Chofer> choferes;
	private static List<Taxi> taxis;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int opcion = 0;
		
		precargarChoferes();
		taxis = new ArrayList<>();
		do {
			System.out.println("===============");
			System.out.println("1: Agregar taxi");
			System.out.println("2: Mostrar choferes");
			System.out.println("3: Mostrar taxis");
			System.out.println("4: Eliminar taxi");
			System.out.println("5: Modificar taxi");
			System.out.println("6: Limpiar lista de taxis");
			System.out.println("7: Ordenar lista de taxis");
			System.out.println("8: Salir");
			System.out.println("===============");
			System.out.println("Ingrese opcion: ");
			opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch(opcion) {
				case 1: agregarTaxi();
					break;
				case 2: mostrarChoferes();
					break;
				case 3: mostrarTaxis();
					break;
				case 4: eliminarTaxi();
					break;
				case 5: modificarTaxi();
					break;
				case 6: ;
					break;
				case 7: ;
					break;
				case 8: System.out.println("Fin del programa");
					break;
				default: System.out.println("Ingrese una opcion valida");
					break;
			}
		} while(opcion != 8);
	}
	public static void agregarTaxi() {
		Taxi taxi = new Taxi();
		System.out.println("Ingrese matricula de taxi: ");
		taxi.setMatricula(scanner.next());
		System.out.println("Ingrese numero de codigo del chofer: ");
		int codigoChofer = scanner.nextInt();
		Chofer chofer = buscarChoferPorCodigo(codigoChofer);
		if(chofer == null) {
			System.out.println("No existe el chofer");
		} else {
			taxi.setChofer(chofer);
			taxis.add(taxi);
			System.out.println("Taxi agregado");
		}
	}
	public static Chofer buscarChoferPorCodigo(int codigo) {
		Chofer choferEncontrado = null;
		for(Chofer chofer: choferes) {
			if(chofer.getCodigo() == codigo) {
				choferEncontrado = chofer;
				break;
			}
		}
		return choferEncontrado;
	}
	public static void precargarChoferes() {
		if(choferes == null) {
			choferes = new ArrayList<>();
		}
		choferes.add(new Chofer(10,"Maria"));
		choferes.add(new Chofer(20,"Esteban"));
		choferes.add(new Chofer(30,"Alberto"));
		choferes.add(new Chofer(40,"Carolina"));
		choferes.add(new Chofer(50,"Julian"));
	}
	public static void mostrarChoferes() {
		System.out.println("----- Lista de choferes -----");
		choferes.forEach(chofer -> System.out.println(chofer));
	}
	public static void mostrarTaxis() {
		System.out.println("----- Lista de taxis -----");
		taxis.forEach(taxis -> System.out.println(taxis));
	}
	public static void eliminarTaxi() {
		System.out.println("Ingrese matricula del taxi a eliminar: ");
		String matricula = scanner.next();
		Iterator<Taxi> iterator = taxis.iterator();
		if(!taxis.isEmpty()) {
			while(iterator.hasNext()) {
				Taxi taxi = iterator.next();
				if(taxi.getMatricula().equals(matricula)) {
					iterator.remove();
					System.out.println("Taxi eliminado");
				}
			}
		}
	}
	public static void modificarTaxi() {
		System.out.println("Ingrese matricula del taxi a modificar: ");
		String matricula = scanner.next();
		for(Taxi taxi: taxis) {
			if(taxi.getMatricula().equals(matricula)) {
				System.out.println("Ingrese numero de codigo de chofer: ");
				int codigo = scanner.nextInt();
				Chofer chofer = buscarChoferPorCodigo(codigo);
				System.out.println("Ingrese nuevo numero de codigo de chofer: ");
				int codigoNuevo = scanner.nextInt();
				chofer.setCodigo(codigoNuevo);
				taxi.setChofer(chofer);
				System.out.println("Taxi modificado");
			}
		}
	}
	public static void ordenarTaxis() {
		//System.out.println();
		taxis.sort(Comparator.comparing(Taxi::getMatricula).reversed());
		taxis.forEach(taxis -> System.out.println(taxis));
		}

}
