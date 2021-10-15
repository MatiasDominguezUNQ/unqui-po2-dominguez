package ar.edu.unq.po2.tpsolid;

public abstract class Solicitud {
	 int monto;
	 int plazo;
	 Cliente cliente;
	
	public Solicitud(int monto, int plazo, Cliente cliente) {
		this.monto = monto;
		this.plazo = plazo;
		this.cliente = cliente;
	}
	
	public abstract boolean cumpleRequisitos();
	
	public int montoMensual() {
		int resultado;
		resultado = monto / plazo;
		return resultado;
	}
	
}
