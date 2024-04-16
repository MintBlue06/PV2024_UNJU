package ar.edu.unju.fi.punto9.main;
//ingresa datos de producto y muestra sus datos
//itera 3 veces
import java.util.Scanner;

import ar.edu.unju.fi.punto9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.crearProductoYMostrarDatos();
	}
	
	public void crearProductoYMostrarDatos() {
		int iteracion = 3;
		while(iteracion > 0) {
			Producto producto = new Producto();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingrese nombre: ");
			String nombre = scanner.next();
			producto.setNombre(nombre);
			System.out.println("Ingrese codigo: ");
			String codigo = scanner.next();
			producto.setCodigo(codigo);
			System.out.println("Ingrese precio: ");
			float precio = scanner.nextFloat();
			producto.setPrecio(precio);
			System.out.println("Ingrese descuento: ");
			float descuento = scanner.nextFloat();
			producto.setDescuento(descuento);
			System.out.println("Datos de producto: " + producto.toString());
			producto.calcularDescuento();
			System.out.println("Datos de producto: " + producto.toString());
			System.out.println("********");
			iteracion--;
		}
	}

}
