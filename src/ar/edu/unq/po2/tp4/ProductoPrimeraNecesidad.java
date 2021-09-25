package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuento ;

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio);
		this.descuento = descuento;
	}
	

	@Override
	 public double  calcularPrecio() {
		
			return this.getPrecio()-((this.getPrecio()* this.getDescuento()) / 100) ;
	}
	
	
}