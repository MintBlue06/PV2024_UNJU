package ar.edu.unju.fi.punto10.model;

public class Pizza {
	private byte diametro;
	private int precio;
	private double area;
	private boolean ingredienteEspecial;
	
	public static final int INGREDIENTE_ESPECIAL20 = 500;
	public static final int INGREDIENTE_ESPECIAL30 = 750;
	public static final int INGREDIENTE_ESPECIAL40 = 1000;
	
	public float calcularPrecio() {
		int aumentar = 0;
		if(this.isIngredienteEspecial() == true) {
			aumentar = 1;
		}
		switch(this.getDiametro()) {
			case 20: precio = 4500 + INGREDIENTE_ESPECIAL20*aumentar;
			break;
			case 30: precio = 4800 + INGREDIENTE_ESPECIAL30*aumentar;
			break;
			case 40: precio = 5500 + INGREDIENTE_ESPECIAL40*aumentar;
			break;
		}
		return precio;
	}
	public double calcularArea() {
		area = Math.PI*((this.getDiametro()^2)/4);
		setArea(area);
		return area;
	}
	
	public byte getDiametro() {
		return diametro;
	}
	public void setDiametro(byte diametro) {
		if(diametro==20 || diametro==30 || diametro==40) {
			this.diametro = diametro;
		} else {
			System.out.println("Valores permitidos: 20, 30 y 40");
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredienteEspecial() {
		return ingredienteEspecial;
	}
	public void setIngredienteEspecial(boolean ingredienteEspecial) {
		this.ingredienteEspecial = ingredienteEspecial;
	}
}
