package ar.edu.unq.po2.tpsolid;

public class SolicitudCreditoHipotecario extends Solicitud {
	private Propiedad propiedad;
	public SolicitudCreditoHipotecario(int monto, int plazo, Cliente cliente, Propiedad propiedad) {
		super(monto, plazo, cliente);
		this.propiedad = propiedad;
	}

	@Override
	public boolean cumpleRequisitos() {
		
		return (cliente.getSueldoNetoMensual() >= (this.montoMensual() * 50 / 100) && 
				propiedad.getValorFiscal() >= (monto * 70 / 100) &&
				cliente.getEdad() + (plazo / 12) < 65);
	}

}
