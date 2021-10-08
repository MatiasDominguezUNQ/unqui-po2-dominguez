package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {

	ArrayList<Ingreso> ingresos = new ArrayList<Ingreso>();

	public ArrayList<Ingreso> getIngresos() {
		return ingresos;
	}

	public void setIngresos(ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}

	public double getMontoImponible() {
		double sumaParcial = 0;
		for (Ingreso ingreso : this.getIngresos()) {
			sumaParcial += ingreso.montoImponible();
		}
		return sumaParcial;
	}
	
	public double getTotalPercibido() {
		double sumaParcial = 0;
		for (Ingreso ingreso : this.getIngresos()) {
			sumaParcial += ingreso.getMontoPercibido();
		}
		return sumaParcial;
	}
	
	public double getImpuestoAPagar() {
		return ((this.getMontoImponible() * 2) / 100 );
		
	}
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}

	public int getCantidadDeIngresos() {
		return ingresos.size();
	}
}