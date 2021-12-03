package ar.edu.unq.po2.tptests;

public class Carta {
	private String valor ;
	private String palo ;
	
	public int getValor() {
		String numero = "" ;
		if(valor=="A") {
			numero = "14";
		}
		else if(valor=="K") {
			numero = "13";
		}
		else if(valor=="Q") {
			numero = "12";
		}
		else if(valor=="J") {
			numero = "11";
		}
		else numero = valor;
		return Integer.parseInt(numero);
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public Carta(String valor, String palo) {
		
		this.valor = valor;
		this.palo = palo ;
	}
	public boolean esMismoPaloQue(Carta carta) {
		
		return (this.getPalo()==carta.getPalo());
	}
	
	public boolean esMayorValorQue(Carta carta) {
		return (this.getValor() > carta.getValor());
	}
	public Carta cartaMayor(Carta carta1,Carta carta2) {
		
		if (carta1.esMayorValorQue(carta2)) return carta1;
		else return carta2 ;
	}
}
