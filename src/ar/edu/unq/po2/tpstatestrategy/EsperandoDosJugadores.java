package ar.edu.unq.po2.tpstatestrategy;

public class EsperandoDosJugadores extends EstadoMaquina {

	@Override
	public void presionarBotonEncendido(MaquinaVideojuegos maquina) {
		maquina.setEstado(new JuegoComenzadoDosJugadores());

	}

	@Override
	public void insertarFicha(MaquinaVideojuegos maquina) {

	}

}
