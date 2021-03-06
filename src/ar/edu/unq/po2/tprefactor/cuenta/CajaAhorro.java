package ar.edu.unq.po2.tprefactor.cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	public boolean condicionParaExtraccionDe(Integer monto) {
		return this.saldo >= monto;
	}
}