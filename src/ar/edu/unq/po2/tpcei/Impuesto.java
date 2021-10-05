package ar.edu.unq.po2.tpcei;

public class Impuesto implements Factura  {
	private double tasa; 
	
	public Impuesto(double precio) {
		super();
		this.tasa = precio;
	}

	public double getPrecio() {
		return tasa;
	}

	public void setPrecio(double precio) {
		this.tasa = precio;
	}

	@Override
	public double registrar() {
		return this.getPrecio();
		
	}
}