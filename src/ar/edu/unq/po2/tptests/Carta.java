package ar.edu.unq.po2.tptests;

public class Carta {
	private String valor ;
	private String palo ;
	
	public int getValor() {
		String numero = "" ;
		if(valor=="A") numero = "14";
		if(valor=="K") numero = "13";
		if(valor=="Q") numero = "12";
		if(valor=="J") numero = "11";
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
	public boolean mismoPalo(Carta carta1,Carta carta2) {
		
		return (carta1.getPalo()==carta2.getPalo());
	}
	
	public boolean esMayorValor(Carta carta1,Carta carta2) {
		return (carta1.getValor() > carta2.getValor());
	}
	public Carta cartaMayor(Carta carta1,Carta carta2) {
		
		if (this.esMayorValor(carta1, carta2)) return carta1 ;
		else return carta2 ;
	}
}
