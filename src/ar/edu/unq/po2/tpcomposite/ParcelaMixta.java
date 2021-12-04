package ar.edu.unq.po2.tpcomposite;

import java.util.List;

	//Patron: Composite
	//Rol: leaf
public class ParcelaMixta extends Parcela{
	private List<IGanancia> regiones;
	@Override
	public int getGananciaAnual() {
		int gananciaAnual = 0;
		for (IGanancia region : regiones) {
			gananciaAnual += (region.getGananciaAnual() / 4);
		}
		return gananciaAnual;
	}
	
	@Override
	public void agregarRegion(IGanancia cultivo) {
		if (this.regiones.size() < 4) {
			this.regiones.add(cultivo);
		}
	}
	
	@Override
	public void sacarRegion(IGanancia cultivo) {
		this.regiones.remove(cultivo);
	}

}
