package ar.edu.unq.po2.tpcei;

public class ProductoEmpresaTradicional extends Producto {

	public ProductoEmpresaTradicional(int stock, double precio) {
		super(stock, precio);
	}

	@Override
	public double registrar() {
		this.reducirStock();
		return this.getPrecio();
		
	}
}
