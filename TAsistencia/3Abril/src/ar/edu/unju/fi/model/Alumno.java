package ar.edu.unju.fi.model;

public class Alumno {
	
	private Integer numeroLegajo; //libreta universitaria
	private String nombre;
	private String apellido;
	
	public Alumno() {}
	public Alumno(Integer legajo, String nombre, String apellido) {
		super();
		this.numeroLegajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "(Alumno [numeroLegajo: " + numeroLegajo + ", nombre: " + nombre + ", apellido: " + apellido + "])";
	}
	public Integer getLegajo() {
		return numeroLegajo;
	}
	public void setLegajo(Integer legajo) {
		this.numeroLegajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
