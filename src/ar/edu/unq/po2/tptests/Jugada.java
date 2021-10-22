package ar.edu.unq.po2.tptests;

import java.util.List;

public class Jugada {	
	String tipoJugada;	

	public Jugada(String tipoJugada) {		
		this.tipoJugada = tipoJugada;
	}

	public String getTipoJugada() {
		return tipoJugada;
	}

	public void setTipoJugada(String tipoJugada) {
		this.tipoJugada = tipoJugada;
	}

	public void jugadaGanador(List<Carta>jugada1,List<Carta>jugada2) {
		PokerStatus controlador = new PokerStatus();		
		List<Carta> manoGanadora = null;	
		if(controlador.esEmpate(jugada1, jugada2)) manoGanadora = controlador.empate(jugada1, jugada2);
		if(controlador.verificar(jugada1).getTipoJugada() == "Poker") manoGanadora = jugada1;
		if(controlador.verificar(jugada2).getTipoJugada() == "Poker") manoGanadora = jugada2;
		if(controlador.verificar(jugada1).getTipoJugada() == "Color") manoGanadora = jugada1;
		if(controlador.verificar(jugada2).getTipoJugada() == "Color") manoGanadora = jugada2;
		System.out.print("MANO GANADORA :");
		for (int i = 0; i < manoGanadora.size(); i++) {			
			System.out.print(manoGanadora.get(i).getValor()+manoGanadora.get(i).getPalo()+ " ");			
		}
		System.out.print("\n");
		System.out.print("TIPO JUGADA :");
		System.out.print(controlador.verificar(manoGanadora).getTipoJugada());		
	}	
}