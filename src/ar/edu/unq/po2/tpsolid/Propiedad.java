package ar.edu.unq.po2.tpsolid;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private int valorFiscal;
	
	public Propiedad(String descripcion, String direccion, int valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public int getValorFiscal() {
		return this.valorFiscal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}
}
