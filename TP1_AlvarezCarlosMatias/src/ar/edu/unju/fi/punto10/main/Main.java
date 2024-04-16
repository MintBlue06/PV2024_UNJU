package ar.edu.unju.fi.punto10.main;
//ingresa datos de una pizza y muestra sus datos
//itera 3 veces
import java.util.Scanner;

import ar.edu.unju.fi.punto10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.crearPizzaYMostrarDatos();

	}
	public void crearPizzaYMostrarDatos() {
		int iteracion = 3;
		while(iteracion > 0) {
			Scanner scanner = new Scanner(System.in);
			Pizza pizza = new Pizza();
			System.out.println("Ingrese diametro: ");
			byte diametro = scanner.nextByte();
			pizza.setDiametro(diametro);
			System.out.println("Ingrese true si tiene ingredientes especiales: ");
			boolean ingredienteEspecial = scanner.nextBoolean();
			pizza.setIngredienteEspecial(ingredienteEspecial);
			System.out.println("Diametro = " + diametro);
			System.out.println("Ingrediente especial = " + ingredienteEspecial);
			double precio = pizza.calcularPrecio();
			System.out.println("Precio = " + precio);
			double area = pizza.calcularArea();
			System.out.println("Area = " + area);
			System.out.println("********");
			iteracion--;
		}
	}
}
