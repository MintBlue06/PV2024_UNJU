package ar.edu.unju.fi.punto7.model;

public class Empleado {
	
	private short legajo;
	private String nombre;
	private float salario;
	
	public static final float SALARIO_MINIMO = 210000;
	public static final float AUMENTO_MERITO = 20000;
	
	public Empleado(short legajo, String nombre, float salario) {
		this.legajo = legajo;
		this.nombre = nombre;
		if(salario <= SALARIO_MINIMO) {
			this.salario = SALARIO_MINIMO;
		} else {
			this.salario = salario;
		}
	}

	public Empleado() {}

	public void aumentarSalario() {
		System.out.println("Salario aumentado");
		this.salario = this.getSalario() + AUMENTO_MERITO;
	}
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: " + nombre);
		System.out.println("Legajo: " + legajo);
		System.out.println("Salario $: " + salario);
	}

	public short getLegajo() {
		return legajo;
	}
	public void setLegajo(short legajo) {
		if(legajo >= 0) {
			this.legajo = legajo;
		} else {
			System.out.println("El legajo no puede ser menor a 0");
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		} else {
			System.out.println("El nombre no puede estar vacio");
		}
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		if(salario <= SALARIO_MINIMO) {
			this.salario = SALARIO_MINIMO;
		} else {
			this.salario = salario;
		}
	}
}
