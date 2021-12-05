package ar.edu.unq.po2.tpstatestrategy;

import java.util.Arrays;
import java.util.List;

public class EncriptacionVocales implements TipoEncriptado{
	List<String> vocales = Arrays.asList("a","e","i","o","u");
			
	@Override
	public String encriptar(String texto) {
		String textoEncriptado = "";
		
		for(int i = 0; i < texto.length(); i++) {
			if (this.esVocal(texto.charAt(i))) {
				textoEncriptado += this.encriptarLetra(texto.charAt(i));
			}
			else {
				textoEncriptado += texto.charAt(i);
			}
		}
		
		return textoEncriptado;

	}

	private boolean esVocal(char letra) {
		return this.vocales.contains(String.valueOf(letra));
	}

	private String encriptarLetra(char vocal) {
		int valorVocal = this.vocales.indexOf(String.valueOf(vocal));
		if (valorVocal == 4) {
			return this.vocales.get(0);
		}
		return this.vocales.get(valorVocal + 1);
	}

	@Override
	public String desencriptar(String texto) {
		String textoEncriptado = "";
		
		for(int i = 0; i < texto.length(); i++) {
			if (this.esVocal(texto.charAt(i))) {
				textoEncriptado += this.desencriptarLetra(texto.charAt(i));
			}
			else {
				textoEncriptado += texto.charAt(i);
			}
		}
		
		return textoEncriptado;
	}

	private String desencriptarLetra(char vocal) {
		int valorVocal = this.vocales.indexOf(String.valueOf(vocal));
		if (valorVocal == 0) {
			return this.vocales.get(4);
		}
		return this.vocales.get(valorVocal - 1);
	}

}
