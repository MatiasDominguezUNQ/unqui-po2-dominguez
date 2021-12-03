package ar.edu.unq.po2.tpobserver;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
	private List<Partido> partidos;
	private List<IPartidoListener> listeners;
	
	public Aplicacion() {
		this.partidos = new ArrayList<Partido>();
		this.listeners = new ArrayList<IPartidoListener>();
	}
	
	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
		this.notificarNuevoPartido(partido);
	}
	
	private void notificarNuevoPartido(Partido partido) {
		for(IPartidoListener listener : this.listeners) {
			this.notificarSiEsDeInteres(listener, partido);
		}	
	}

	private void notificarSiEsDeInteres(IPartidoListener listener, Partido partido) {
		if(partido.cumpleCon(listener.intereses())) {
			listener.recibirPartido(partido);
		}
		
	}

	public void agregarListener(IPartidoListener listener) {
		this.listeners.add(listener);
	}

	public List<Partido> getPartidos() {

		return this.partidos;
	}
}
