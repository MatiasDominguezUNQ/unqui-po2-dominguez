package ar.edu.unq.po2.tpstatestrategy;

public class JuegoComenzadoDosJugadores extends EstadoMaquina {

	@Override
	public void presionarBotonEncendido(MaquinaVideojuegos maquina) {
		maquina.terminarJuego();

	}

	@Override
	public void insertarFicha(MaquinaVideojuegos maquina) {

	}

}
