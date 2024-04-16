package ejemploArrayList.model;

public class Chofer {
	private int codigo;
	private String nombre;
	
	public Chofer() {}
	public Chofer(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Chofer [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
}
