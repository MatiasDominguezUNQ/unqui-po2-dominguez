package ar.edu.unq.po2.tpcomposite;

	//Patron: Composite
	//Rol: leaf
public class ParcelaDeUnCultivo extends Parcela {
	
	private IGanancia cultivo;
	
	@Override
	public int getGananciaAnual() {
		
		return this.cultivo.getGananciaAnual();
	}

}
