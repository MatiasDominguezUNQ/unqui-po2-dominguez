package ar.edu.unq.po2.tp4;

public class Ingreso {
	private String mes;
	private String concepto;
	private double montoPercibido;
	
	public double montoImponible() {
		return this.getMontoPercibido();
	}

	public double getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoPercibido(double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}

	public Ingreso(String mes, String concepto, double montoPercibido) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	
	
}