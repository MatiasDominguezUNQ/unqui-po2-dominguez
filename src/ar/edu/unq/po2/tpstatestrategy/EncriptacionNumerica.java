package ar.edu.unq.po2.tpstatestrategy;

import java.util.Arrays;
import java.util.List;

public class EncriptacionNumerica implements TipoEncriptado{
	List<String> abecedario = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");

	@Override
	public String encriptar(String texto) {
		String textoEncriptado = "";
		for(int i = 0; i < texto.length(); i++) {
			textoEncriptado += this.encriptarLetra(texto.charAt(i));
		}

		return textoEncriptado;
	}

	private int encriptarLetra(char letra) {
		return this.abecedario.indexOf(String.valueOf(letra)) + 1;
	}

	@Override
	public String desencriptar(String texto) {
		String textoEncriptado = "";
		for(int i = 0; i < texto.length(); i++) {
			textoEncriptado += this.desencriptarLetra(texto.charAt(i));
		}

		return textoEncriptado;
	}

	private String desencriptarLetra(char letra) {
		
		return this.abecedario.get(Integer.parseInt(String.valueOf(letra)) - 1);
	}

}
