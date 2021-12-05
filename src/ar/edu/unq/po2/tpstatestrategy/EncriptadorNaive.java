package ar.edu.unq.po2.tpstatestrategy;

public class EncriptadorNaive {
	private TipoEncriptado tipo;
	
	public void cambiarEncriptacion(TipoEncriptado encriptacion) {
		this.tipo = encriptacion;
	}

	public String encriptar(String texto) {
		return tipo.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return tipo.desencriptar(texto);
	}
}
