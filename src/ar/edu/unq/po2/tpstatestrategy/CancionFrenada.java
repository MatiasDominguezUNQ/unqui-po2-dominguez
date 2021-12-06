package ar.edu.unq.po2.tpstatestrategy;

public class CancionFrenada extends EstadoCancion {

	@Override
	public void play(Song cancion) {
		cancion.setEstado(new CancionReproduciendose());

	}

	@Override
	public void pause(Song cancion) {

	}

	@Override
	public void stop(Song cancion) {

	}

}
