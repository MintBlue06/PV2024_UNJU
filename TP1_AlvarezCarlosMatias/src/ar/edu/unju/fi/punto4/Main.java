package ar.edu.unju.fi.punto4;
//produce factorial de un numero
import java.util.Scanner;

public class Main {
	private static int numero;
    private static int factorial=1;
    
	public static void main(String[] args) {
		Main main = new Main();
		main.ingresarNumero();
		main.conseguirFactorial(numero);
		System.out.println("Factorial de " + numero + ": "+ factorial);
	}
	public void ingresarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextInt();
        scanner.close();
        //return numero;
    }
	public int conseguirFactorial(int numero) {
        //int factorial = 1;
        int i = numero;
        if(i == 0 || i == 1) {
        	return 1;
        }
		while(numero > 0 && numero <= 10 && i != 1) {
        	while (i > 1) {
                    factorial *= i;
                    i--;
            }
    		//numero = 11;
        }
		//System.out.println("Factorial de " + numero + ": "+ factorial);
		return factorial;
    }
}
