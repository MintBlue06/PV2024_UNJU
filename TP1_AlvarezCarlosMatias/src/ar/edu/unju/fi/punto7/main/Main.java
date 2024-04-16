package ar.edu.unju.fi.punto7.main;
//ingresa por consola datos de un empleado
//lo imprime y luego le aumenta el sueldo en 20000
import java.util.Scanner;

import ar.edu.unju.fi.punto7.model.Empleado;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		//main.crearEmpleado();
		main.aumentarSalario();
	}
	public Empleado crearEmpleado() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero de Legajo: ");
		short legajo = scanner.nextShort();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese salario: ");
		float salario = scanner.nextFloat();
		Empleado empleado = new Empleado();
		empleado.setLegajo(legajo);
		empleado.setNombre(nombre);
		empleado.setSalario(salario);
		empleado.mostrarDatos();
		scanner.close();
		return empleado;
	}
	public Empleado aumentarSalario() {
		Empleado empleado=crearEmpleado();
		empleado.aumentarSalario();
		empleado.mostrarDatos();
		return empleado;
	}
}
