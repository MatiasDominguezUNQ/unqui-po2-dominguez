package ar.edu.unq.po2.tptemplateadapter;

import java.util.ArrayList;
import java.util.List;
	//AbstractClass
public abstract class CuentaBancaria {
	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(int monto) {
		this.saldo = monto;
	}
	
	//Operacion Concreta
	public void agregarMovimientos(String movimiento) {
		this.movimientos.add(movimiento);
	}
	//Template method
	public void extraer(int monto) {
		if (this.puedeExtraer(monto)) {
			this.setSaldo(this.getSaldo()-monto);
			this.agregarMovimientos("Extraccion");
		}
	}
	//Operacion Primitiva
	protected abstract boolean puedeExtraer(int monto);

}
