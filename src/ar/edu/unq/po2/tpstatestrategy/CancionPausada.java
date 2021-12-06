package ar.edu.unq.po2.tpstatestrategy;

public class CancionPausada extends EstadoCancion {

	@Override
	public void play(Song cancion) {
		//error

	}

	@Override
	public void pause(Song cancion) {
		cancion.setEstado(new CancionReproduciendose());

	}

	@Override
	public void stop(Song cancion) {
		cancion.setEstado(new CancionFrenada());

	}

}
