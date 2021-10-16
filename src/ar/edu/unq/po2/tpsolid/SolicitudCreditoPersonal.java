package ar.edu.unq.po2.tpsolid;

public class SolicitudCreditoPersonal extends Solicitud {

	public SolicitudCreditoPersonal(int monto, int plazo, Cliente cliente) {
		super(monto, plazo, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esAceptable() {
		
		return (getCliente().sueldoNetoAnual() >= 15000 && getCliente().getSueldoNetoMensual() >= (this.montoMensual() * 70 / 100));
	}
	
	@Override
	public int montoMensual() {
		int resultado;
		resultado = this.getMonto() / this.getPlazo();
		return resultado;
	}

}
