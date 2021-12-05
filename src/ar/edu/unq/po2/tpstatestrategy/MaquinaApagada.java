package ar.edu.unq.po2.tpstatestrategy;

public class MaquinaApagada extends EstadoMaquina{


	@Override
	public void presionarBotonEncendido(MaquinaVideojuegos maquina) {
		maquina.setEstado(new EsperandoFichas());
		
	}

	@Override
	public void insertarFicha(MaquinaVideojuegos maquina) {
		
	}

}
