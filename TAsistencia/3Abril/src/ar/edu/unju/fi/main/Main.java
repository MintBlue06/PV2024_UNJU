package ar.edu.unju.fi.main;
//crea alumno, materia y nota respectiva
import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {
	private static Alumno alumno;
	private static Materia materia;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.crearAlumno();
		main.crearMateria();
		main.crearRegistroNota(alumno, materia);
	}
	public Alumno crearAlumno() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero de Legajo: ");
		Integer numeroLegajo= scanner.nextInt();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese apellido: ");
		String apellido = scanner.next();
		alumno = new Alumno(numeroLegajo, nombre, apellido);
		System.out.println(alumno.toString());
		//scanner.close();
		return alumno;
	}
	public Materia crearMateria() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese codigo: ");
		String codigo = scanner.next();
		System.out.println("Ingrese nombre: ");
		//String nombre = scanner.nextLine();
		String nombre = scanner.next();
		//scanner.close();
		materia = new Materia(codigo, nombre);
		System.out.println(materia.toString());
		return materia;
	}
	public RegistroNota crearRegistroNota(Alumno alumno, Materia materia) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese codigo: ");
		String codigo = scanner.next();
		System.out.println("Ingrese nota: ");
		Float nota = scanner.nextFloat();
		scanner.close();
		RegistroNota registroNota = new RegistroNota(codigo, alumno, materia, nota);
		System.out.println(registroNota.toString());
		return registroNota;
	}
}
