package ar.edu.unju.fi.punto6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private float dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		//super();
	}
	public Persona(float dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		//super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	public Persona(float dni, String nombre, LocalDate fechaNacimiento) {
		//super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}
	
	public int averiguarEdad() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.getFechaNacimiento(), hoy);
		int edad = periodo.getYears();
		return edad;
	}
	/*public boolean comprobarAdultez(int edad) {
		String mensajeResultado = "Mayor";
		if(edad < 18) {
			mensajeResultado = "Menor";
			return false;
		}
		return true;
	}*/
	public boolean comprobarAdultez() {
		//String mensajeResultado = "Mayor";
		if(averiguarEdad() < 18) {
			//mensajeResultado = "Menor";
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		String mensajeResultado = "Mayor";
		if(comprobarAdultez() == false) {
			mensajeResultado = "Menor";
		}
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", provincia="
				+ provincia + ", averiguarEdad()=" + averiguarEdad() + ", comprobarAdultez()=" + comprobarAdultez()
				+ "La persona es " + mensajeResultado + " de Edad" + "]";
	}
	public float getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setDni(float dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
