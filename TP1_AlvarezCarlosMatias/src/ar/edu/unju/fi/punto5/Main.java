package ar.edu.unju.fi.punto5;
//toma un numero por consola y 
//saca su tabla de multiplicar hasta el 10
import java.util.Scanner;

public class Main {
	public static byte numero;
	
	public static void main(String[] args) {
		Main main = new Main();
		main.ingresarNumero();
		main.multiplicarNumero(numero);
	}
	public void ingresarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextByte();
        scanner.close();
    }
	public void multiplicarNumero(byte numero) {
        if(numero>=0 && numero<=10) {
        	for(int i=0; i<11; i++) {
    			int producto = numero*i;
    			System.out.println(numero + "*" + i + " = " + producto);
    		}
        } else {
        	System.out.println("Ingrese un numero entre 1 y 9");
        }
    }
}
