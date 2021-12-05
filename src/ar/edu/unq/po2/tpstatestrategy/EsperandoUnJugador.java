package ar.edu.unq.po2.tpstatestrategy;

public class EsperandoUnJugador extends EstadoMaquina {

	@Override
	public void presionarBotonEncendido(MaquinaVideojuegos maquina) {
		maquina.setEstado(new JuegoComenzadoUnJugador());

	}

	@Override
	public void insertarFicha(MaquinaVideojuegos maquina) {
		maquina.setEstado(new EsperandoDosJugadores());

	}

}
