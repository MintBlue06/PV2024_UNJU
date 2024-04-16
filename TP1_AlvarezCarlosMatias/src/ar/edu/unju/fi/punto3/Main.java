package ar.edu.unju.fi.punto3;
//ingresa un numero y lo multiplica por 3 si es par
//y por 2 si no lo es
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		//main.ingresarNumero();
		main.multiplicarNumero();
	}
	public int ingresarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = scanner.nextInt();
        return numero;
        //scanner.close();
    }
	public void multiplicarNumero() {
		int producto, numero=ingresarNumero();
        boolean par = (numero % 2) == 0;

        if(par) {
            System.out.println("El numero " + numero + " es par");
            producto = numero*3;
            System.out.println(numero + "*3 = " + producto);
        } else {
        	System.out.println("El numero " + numero + " es impar");
            producto = numero*2;
            System.out.println(numero + "*2 = " + producto);
        	}
    }
}
