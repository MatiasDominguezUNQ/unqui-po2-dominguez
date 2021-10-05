package ar.edu.unq.po2.tpcei;

public class Producto implements Factura {
	
	private int stock;
	private double precio;
	
	

	public Producto(int stock, double precio) {
		super();
		this.stock = stock;
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrecio() {
		return precio;
	}
	

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void reducirStock() {
		
		this.setStock(this.getStock() - 1);
	}
	
	public double precio() {
		return this.getPrecio();
	}


	@Override
	public double registrar() {
		this.reducirStock();
		return this.getPrecio();
		
	}	
}