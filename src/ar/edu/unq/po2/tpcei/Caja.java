package ar.edu.unq.po2.tpcei;

public class Caja implements Agencia {
	
	private double montoAPagar ; 
		
	public Caja() {
		super();
		this.montoAPagar = 0;
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}

	@Override
	public void registrarPago(Factura factura) {
		double montoPagar = factura.registrar();
		this.setMontoAPagar(this.getMontoAPagar() + montoPagar);
	}	
}
