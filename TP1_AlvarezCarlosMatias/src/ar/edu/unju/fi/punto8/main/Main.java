package ar.edu.unju.fi.punto8.main;
//toma un numero por consola y calcula una sumatoria y productoria
import java.util.Scanner;

import ar.edu.unju.fi.punto8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.ingresarNumeroYCalcular();
	}
	public void ingresarNumeroYCalcular() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		int numero = scanner.nextInt();
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		scanner.close();
		int sumatoria = calculadora.calcularSumatoria(numero);
		System.out.println("Resultado de sumatoria: " + sumatoria);
		int productoria = calculadora.calcularProductoria(numero);
		System.out.println("Resultado de sumatoria: " + productoria);
	}
}
