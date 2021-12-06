package ar.edu.unq.po2.tpstatestrategy;

public class SeleccionDeCanciones extends EstadoReproductor {

	@Override
	public void play(Reproductor reproductor) {
		reproductor.setEstado(new ReproduciendoCancion());
		reproductor.getCancionSeleccionada().play();

	}

	@Override
	public void pause(Reproductor reproductor) {
		System.out.print("No hay cancion para pausar");
	}

	@Override
	public void stop(Reproductor reproductor) {
		//nada
	}

}
