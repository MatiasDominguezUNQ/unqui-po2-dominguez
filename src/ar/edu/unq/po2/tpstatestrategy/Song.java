package ar.edu.unq.po2.tpstatestrategy;

public class Song {
	private EstadoCancion estado = new CancionFrenada();
	
	public void play() {
		this.estado.play(this);
	}
	
	public void pause() {
		this.estado.pause(this);
	}
	
	public void stop() {
		this.estado.stop(this);
	}

	public EstadoCancion getEstado() {
		return estado;
	}

	public void setEstado(EstadoCancion estado) {
		this.estado = estado;
	}
	
	
}
