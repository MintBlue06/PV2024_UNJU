package ar.edu.unju.fi.punto6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.punto6.model.Persona;
//ingresa datos por consola y crea un objeto empleado
//usando constructor por defecto, prametrizado 
//e inicializado en atributo provincia
public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.ingresarDatosDefecto();
		main.ingresarDatosParametro();
		main.ingresarDatosInicializado();
	}
	public Persona ingresarDatosDefecto() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero de DNI: ");
		float dni = scanner.nextFloat();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese fecha de nacimiento en formato (dia/mes/año): ");
		String cadenaFechaNacimiento = scanner.next();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(cadenaFechaNacimiento, dtf);
		System.out.println("Ingrese provincia: ");
		String provincia = scanner.next();
		Persona persona = new Persona();
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fechaNacimiento);
		persona.setProvincia(provincia);
		System.out.println(persona.toString());
		//scanner.close();
		return persona;
	}
	public Persona ingresarDatosParametro() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero de DNI: ");
		float dni = scanner.nextFloat();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese fecha de nacimiento en formato (dia/mes/año): ");
		String cadenaFechaNacimiento = scanner.next();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(cadenaFechaNacimiento, dtf);
		System.out.println("Ingrese provincia: ");
		String provincia = scanner.next();
		Persona persona = new Persona(dni, nombre, fechaNacimiento, provincia);
		System.out.println(persona.toString());
		//scanner.close();
		return persona;
	}
	public Persona ingresarDatosInicializado() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero de DNI: ");
		float dni = scanner.nextFloat();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese fecha de nacimiento en formato (dia/mes/año): ");
		String cadenaFechaNacimiento = scanner.next();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(cadenaFechaNacimiento, dtf);
		System.out.println("Ingrese provincia: ");
		String provincia = scanner.next();
		Persona persona = new Persona(dni, nombre, fechaNacimiento);
		persona.setProvincia(provincia);
		System.out.println(persona.toString());
		//scanner.close();
		return persona;
	}
}
