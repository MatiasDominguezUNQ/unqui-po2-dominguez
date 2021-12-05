package ar.edu.unq.po2.tpstatestrategy;

public class EsperandoFichas extends EstadoMaquina {

	@Override
	public void presionarBotonEncendido(MaquinaVideojuegos maquina) {

	}

	@Override
	public void insertarFicha(MaquinaVideojuegos maquina) {
		maquina.setEstado(new EsperandoUnJugador());

	}

}
