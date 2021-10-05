package ar.edu.unq.po2.tpcei;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(int stock, double precio) {
		super(stock, precio);
	}
	
	@Override
	public double registrar() {
		this.reducirStock();
		return this.getPrecio()- ((this.getPrecio() * 10) / 100) ;
		
	}	
}