package ar.edu.unq.po2.tpsolid;

public class SolicitudCreditoHipotecario extends Solicitud {
	private Propiedad propiedad;
	public SolicitudCreditoHipotecario(int monto, int plazo, Cliente cliente, Propiedad propiedad) {
		super(monto, plazo, cliente);
		this.propiedad = propiedad;
	}

	@Override
	public boolean esAceptable() {
		
		return (this.getCliente().getSueldoNetoMensual() >= (this.montoMensual() * 50 / 100) && 
				propiedad.getValorFiscal() >= (this.getMonto() * 70 / 100) &&
				this.getCliente().getEdad() + (this.getPlazo() / 12) < 65);
	}

}
