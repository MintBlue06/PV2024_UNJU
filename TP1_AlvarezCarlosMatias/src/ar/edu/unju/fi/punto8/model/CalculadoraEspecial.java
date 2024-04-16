package ar.edu.unju.fi.punto8.model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial() {
	}
	public int calcularSumatoria(int n) {
		int sumatoria = 0;
		if(n < 1) {
			System.out.println("El numero debe ser mayor a 0");
		} else {
			for(int k=1; k<=n; k++) {
				sumatoria = ((k*(k-1))/2)^2+sumatoria;
			}
		}
		return sumatoria;
	}
	public int calcularProductoria(int n) {
		int productoria = 1;
		if(n < 1) {
			System.out.println("El numero debe ser mayor a 0");
		} else {
			for(int k=1; k<=n; k++) {
				productoria = (k*(k+4))*productoria;
			}
		}
		return productoria;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
}
