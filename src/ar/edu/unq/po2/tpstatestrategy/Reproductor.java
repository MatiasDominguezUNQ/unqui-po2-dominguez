package ar.edu.unq.po2.tpstatestrategy;

public class Reproductor {
	private EstadoReproductor estado = new SeleccionDeCanciones();
	private Song cancionSeleccionada = new Song();
	
	public Reproductor(Song cancion) {
		this.cancionSeleccionada = cancion;
	}
	
	public void play() {
		this.estado.play(this);
	}
	
	public void pause() {
		this.estado.pause(this);
	}
	
	public void stop() {
		this.estado.stop(this);
	}

	public EstadoReproductor getEstado() {
		return estado;
	}

	public void setEstado(EstadoReproductor estado) {
		this.estado = estado;
	}

	public Song getCancionSeleccionada() {
		return cancionSeleccionada;
	}

	public void setCancionSeleccionada(Song cancionSeleccionada) {
		this.cancionSeleccionada = cancionSeleccionada;
	}

}
