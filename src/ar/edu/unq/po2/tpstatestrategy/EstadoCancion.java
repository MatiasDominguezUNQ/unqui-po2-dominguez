package ar.edu.unq.po2.tpstatestrategy;

public abstract class EstadoCancion {
	
	public abstract void play(Song cancion);

	public abstract void pause(Song cancion);

	public abstract void stop(Song cancion);

}
