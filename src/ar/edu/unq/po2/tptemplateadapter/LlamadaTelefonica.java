package ar.edu.unq.po2.tptemplateadapter;

public abstract class LlamadaTelefonica {
	private int tiempo;
	private int horaDelDia;

	public LlamadaTelefonica(int tiempo, int horaDelDia){
		this.tiempo=tiempo;
		this.horaDelDia=horaDelDia;
	}
	
	public int getTiempo(){
		return this.tiempo;
	}
	
	public int getHoraDelDia(){
		return this.horaDelDia;
	}
	
	//Operacion primitiva
	public abstract boolean esHoraPico();
	
	//Template method
	public float costoFinal(){
		if(this.esHoraPico()){
			return this.costoNeto()*1.2f*this.getTiempo();
		}else{
			return this.costoNeto()*this.getTiempo();
		}
	}
	//Operacion concreta
	public float costoNeto(){
		return this.getTiempo()*1;
	}
}