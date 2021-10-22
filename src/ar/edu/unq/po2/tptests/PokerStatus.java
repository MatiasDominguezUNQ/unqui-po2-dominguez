package ar.edu.unq.po2.tptests;



import java.util.List;


public class PokerStatus {
	
	public Jugada verificar(List<Carta> cartas) {		
		if(this.esPoker(cartas))return new Jugada("Poker") ;
		if(this.esTrio(cartas))return new Jugada("Trio") ;
		if(this.esColor(cartas))return new Jugada("Color") ;
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
		int cantidadIguales;
		int valorAChequear;
		List<Carta> cartas = mano;
		valorAChequear = cartas.get(0).getValor();
		cantidadIguales = 0;
		for (int i = 0 ; i<cartas.size() ; i++) {
			if (cartas.get(i).getValor() == valorAChequear) cantidadIguales++;
		}
		if (cantidadIguales < 4) {
			valorAChequear = cartas.get(1).getValor();
			cantidadIguales = 0;
			for (int i = 0 ; i<cartas.size() ; i++) {
				if (cartas.get(i).getValor() == valorAChequear) cantidadIguales++;
			}
		}
		return (cantidadIguales == 4);
	}
	
	public boolean esTrio(List <Carta> mano) {
		int cantidadIguales;
		int valorAChequear;
		List<Carta> cartas = mano;
		valorAChequear = cartas.get(0).getValor();
		cantidadIguales = 0;
		for (int i = 0 ; i<cartas.size() ; i++) {
			if (cartas.get(i).getValor() == valorAChequear) cantidadIguales++;
		}		
		if (cantidadIguales < 3) {
			valorAChequear = cartas.get(1).getValor();
			cantidadIguales = 0;
			for (int i = 0 ; i<cartas.size() ; i++) {
				if (cartas.get(i).getValor() == valorAChequear) cantidadIguales++;
			}
		}		
		if (cantidadIguales < 3) {
			valorAChequear = cartas.get(2).getValor();
			cantidadIguales = 0;
			for (int i = 0 ; i<cartas.size() ; i++) {
				if (cartas.get(i).getValor() == valorAChequear) cantidadIguales++;
			}
		}
		return (cantidadIguales == 3);
	}
	
	public boolean esColor(List<Carta> mano) {
		int cantidadIguales;
		String paloAChequear;
		List<Carta> cartas = mano;
		paloAChequear = cartas.get(0).getPalo();
		//System.out.print(cartaAChequear);
		cantidadIguales = 0;
		for (int i = 0 ; i<cartas.size() ; i++) {
			if (cartas.get(i).getPalo() == paloAChequear) cantidadIguales++;
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