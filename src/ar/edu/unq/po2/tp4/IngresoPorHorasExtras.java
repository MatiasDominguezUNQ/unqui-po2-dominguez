package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {
	

	private int horasExtras ;
	
	public double montoImponible() {
		return 0;
		
	}

	public IngresoPorHorasExtras(String mes, String concepto, double montoPercibido,int horas) {
		super(mes, concepto, montoPercibido);
		horasExtras = horas;
	}
}