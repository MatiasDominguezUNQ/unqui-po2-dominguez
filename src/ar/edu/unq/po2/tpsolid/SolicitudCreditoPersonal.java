package ar.edu.unq.po2.tpsolid;

public class SolicitudCreditoPersonal extends Solicitud {

	public SolicitudCreditoPersonal(int monto, int plazo, Cliente cliente) {
		super(monto, plazo, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumpleRequisitos() {
		
		return (cliente.sueldoNetoAnual() >= 15000 && cliente.getSueldoNetoMensual() >= (this.montoMensual() * 70 / 100));
	}

}
