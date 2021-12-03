package ar.edu.unq.po2.tptests;

import java.util.List;

public class Jugada {	
	private String tipoJugada;	

	public Jugada(String tipoJugada) {		
		this.tipoJugada = tipoJugada;
	}

	public String getTipoJugada() {
		return tipoJugada;
	}

	public void setTipoJugada(String tipoJugada) {
		this.tipoJugada = tipoJugada;
	}

	public List<Carta> jugadaGanador(List<Carta>mano1,List<Carta>mano2) {
		PokerStatus controlador = new PokerStatus();
		Jugada jugada1 = controlador.verificar(mano1);
		Jugada jugada2 = controlador.verificar(mano2);
		if(controlador.esEmpate(mano1, mano2)) return controlador.empate(mano1, mano2);
		if(((jugada1.getTipoJugada() == "Poker") || 
			((jugada1.getTipoJugada() == "Color") && (jugada2.getTipoJugada() == "Trio"))  ||
			((jugada1.getTipoJugada() == "Trio")  && (jugada2.getTipoJugada() == "Nada")))) {
			return mano1;
		} 
		else {
			return mano2;		
		}
	}
}