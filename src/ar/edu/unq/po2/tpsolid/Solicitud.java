package ar.edu.unq.po2.tpsolid;

public abstract class Solicitud {
	 private int monto;
	 private int plazo;
	 private Cliente cliente;
	
	public Solicitud(int monto, int plazo, Cliente cliente) {
		this.monto = monto;
		this.plazo = plazo;
		this.cliente = cliente;
	}
	
	public abstract boolean esAceptable();
	
	public int montoMensual() {
		int resultado;
		resultado = this.getMonto() / this.getPlazo();
		return resultado;
	}

	public int getMonto() {
		return monto;
	}

	public int getPlazo() {
		return plazo;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
