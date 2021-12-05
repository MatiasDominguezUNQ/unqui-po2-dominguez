package ar.edu.unq.po2.tpstatestrategy;

public class MaquinaVideojuegos {
	private EstadoMaquina estado;
	
	public MaquinaVideojuegos() {
		this.estado = new MaquinaApagada();
	}
	
	public void presionarBotonEncendido() {
		estado.presionarBotonEncendido(this);
	}
	
	public void insertarFicha() {
		estado.insertarFicha(this);
	}
	
	public void terminarJuego() {
		this.estado = new MaquinaApagada();
	}

	public void setEstado(EstadoMaquina estado) {
		this.estado = estado;
	}

	public EstadoMaquina getEstado() {
		return estado;
	}
	
}
