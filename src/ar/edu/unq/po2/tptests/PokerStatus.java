package ar.edu.unq.po2.tptests;



import java.util.List;


public class PokerStatus {
	
	public Jugada verificar(List<Carta> cartas) {		
		if(this.esPoker(cartas)) {
			return new Jugada("Poker");
		}
		else if(this.esTrio(cartas)) { 
			return new Jugada("Trio");
		}
		else if(this.esColor(cartas)) {
			return new Jugada("Color");
		}
		else return new Jugada("Nada");
	}
	
	public int valorMano(List<Carta> cartas) {
		int sumado = 0;
		for (int i = 0 ; i<cartas.size() ; i++) {
			sumado += cartas.get(i).getValor();
		}
		return sumado; 
	}
	
	public boolean esPoker( List<Carta> mano) {
		int valorAChequear = mano.get(0).getValor();
		int cantidadIguales = 0;
		for (int i = 0 ; i<mano.size() ; i++) {
			if (mano.get(i).getValor() == valorAChequear) cantidadIguales++;
		}
		if (cantidadIguales < 4) {
			valorAChequear = mano.get(1).getValor();
			cantidadIguales = 0;
			for (int i = 0 ; i<mano.size() ; i++) {
				if (mano.get(i).getValor() == valorAChequear) cantidadIguales++;
			}
		}
		return (cantidadIguales == 4);
	}
	
	public boolean esTrio(List <Carta> mano) {
		int valorAChequear = mano.get(0).getValor();
		int cantidadIguales = 0;
		for (int i = 0 ; i<mano.size() ; i++) {
			if (mano.get(i).getValor() == valorAChequear) cantidadIguales++;
		}		
		if (cantidadIguales < 3) {
			valorAChequear = mano.get(1).getValor();
			cantidadIguales = 0;
			for (int i = 0 ; i<mano.size() ; i++) {
				if (mano.get(i).getValor() == valorAChequear) cantidadIguales++;
			}
		}		
		if (cantidadIguales < 3) {
			valorAChequear = mano.get(2).getValor();
			cantidadIguales = 0;
			for (int i = 0 ; i<mano.size() ; i++) {
				if (mano.get(i).getValor() == valorAChequear) cantidadIguales++;
			}
		}
		return (cantidadIguales == 3);
	}
	
	public boolean esColor(List<Carta> mano) {
		String paloAChequear = mano.get(0).getPalo();
		//System.out.print(cartaAChequear);
		int cantidadIguales = 0;
		for (int i = 0 ; i<mano.size() ; i++) {
			if (mano.get(i).getPalo() == paloAChequear) cantidadIguales++;
		}
		return (cantidadIguales == 5);
	}
	
	public List<Carta> empate(List<Carta>jugada1,List<Carta>jugada2){		
		if(this.valorMano(jugada1) >this.valorMano(jugada2)) return jugada1 ;
		else return jugada2;
	}
	
	public boolean esEmpate(List<Carta>jugada1,List<Carta>jugada2){		
		return (this.verificar(jugada1) == this.verificar(jugada2));
	}
}