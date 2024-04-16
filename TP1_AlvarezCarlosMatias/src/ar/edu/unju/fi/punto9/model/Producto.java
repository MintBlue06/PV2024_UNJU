package ar.edu.unju.fi.punto9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private float precio;
	private float descuento;
	
	public Producto() {
	}
	public float calcularDescuento() {
		float precioConDescuento = this.getPrecio()-(this.getDescuento()*this.getPrecio());
		System.out.println("Precio con descuento: " + precioConDescuento);
		return precioConDescuento;
	}
	@Override
	public String toString() {
		float precioConDescuento=calcularDescuento();
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", descuento=" + descuento
				+ " Precio con descuento= " + precioConDescuento + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		if(descuento<0 || descuento>50) {
			System.out.println("Descuento maximo de 50 y minimo de 0");
		} else {
			this.descuento = descuento/100;
		}
	}
}