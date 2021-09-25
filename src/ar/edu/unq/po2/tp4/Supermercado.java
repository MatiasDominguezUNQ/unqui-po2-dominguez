package ar.edu.unq.po2.tp4;

import java.util.ArrayList;  

public class Supermercado {
	private String nombre ;
	private String direccion ;
	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	
	public static void main(String[] args) {
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public ArrayList<Producto> getProductos() {
		return productos;
	}


	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}


	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		
	}
	
	public int getCantidadDeProductos() {
		return this.getProductos().size();
	}
	
	public double getPrecioTotal() {
		double sumaParcial = 0;
		for (Producto producto : this.getProductos()) {
			sumaParcial += producto.calcularPrecio();
		}
		return sumaParcial;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
}