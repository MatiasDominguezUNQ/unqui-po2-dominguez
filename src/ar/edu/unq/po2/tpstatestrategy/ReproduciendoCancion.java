package ar.edu.unq.po2.tpstatestrategy;

public class ReproduciendoCancion extends EstadoReproductor {

	@Override
	public void play(Reproductor reproductor) {
		System.out.print("Ya hay una cancion reproduciendose");

	}

	@Override
	public void pause(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().pause();

	}

	@Override
	public void stop(Reproductor reproductor) {
		reproductor.getCancionSeleccionada().stop();
		reproductor.setEstado(new SeleccionDeCanciones());

	}

}
