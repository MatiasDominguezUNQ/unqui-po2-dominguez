package ar.edu.unq.po2.tpcei;

public class Servicio implements Factura,Agencia {
	private double costoUnidad;
	private double cantidadUnidad;
	
	
	
	public Servicio(double costoUnidad, double cantidadUnidad) {
		super();
		this.costoUnidad = costoUnidad;
		this.cantidadUnidad = cantidadUnidad;
	}

	public double getCostoUnidad() {
		return costoUnidad;
	}

	public void setCostoUnidad(double costoUnidad) {
		this.costoUnidad = costoUnidad;
	}

	public double getCantidadUnidad() {
		return cantidadUnidad;
	}

	public void setCantidadUnidad(double cantidadUnidad) {
		this.cantidadUnidad = cantidadUnidad;
	}

	@Override
	public double registrar() {
		
		return this.getCantidadUnidad() * this.getCostoUnidad() ;
	}

	@Override
	public void registrarPago(Factura factura) {
		
	}
}