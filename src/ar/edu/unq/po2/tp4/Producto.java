package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre ;
	private double precio ;
	
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double  calcularPrecio() {
		return this.getPrecio();
	}
	
	public static void main(String[] args) {
		
	}

	public void aumentarPrecio(double precio) {
		this.setPrecio(precio + this.getPrecio());
		
	}
	
}