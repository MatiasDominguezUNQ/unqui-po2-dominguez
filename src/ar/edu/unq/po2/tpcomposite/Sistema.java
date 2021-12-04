package ar.edu.unq.po2.tpcomposite;

import java.util.List;

//Patron: Composite
//Rol: Client

public class Sistema {

	private List<IGanancia> parcelas;

	public Sistema(List<IGanancia> parcelas) {
		super();
		this.parcelas = parcelas;
	}
	
	public double getGananciaTotal() {
		int gananciaTotal = 0;
		for(IGanancia parcela : this.parcelas) {
			gananciaTotal += parcela.getGananciaAnual();
		}
		return gananciaTotal;
	}

}
