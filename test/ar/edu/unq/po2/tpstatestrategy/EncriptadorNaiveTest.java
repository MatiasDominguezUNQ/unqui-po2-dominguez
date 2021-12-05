package ar.edu.unq.po2.tpstatestrategy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncriptadorNaiveTest {
	private TipoEncriptado encriptadorVocales;
	private TipoEncriptado encriptadorNumerico;
	private EncriptadorNaive encriptador;
	private String string1;
	private String string2;
	private String string3;
	
	@BeforeEach
	public void setUp() throws Exception {
		encriptadorVocales = new EncriptacionVocales();
		encriptadorNumerico = new EncriptacionNumerica();
		encriptador = new EncriptadorNaive();
		string1 = "abc";
		string2 = "estrategia";
	}
	
	@Test
	public void testEncriptacionDeVocales() {
		encriptador.cambiarEncriptacion(encriptadorVocales);
		string3 = encriptador.encriptar(string2);
		assertEquals(string3, "istretigoe");
		assertEquals(encriptador.desencriptar(string3), "estrategia");
	}
	
	@Test
	public void testEncriptacionNumerica() {
		encriptador.cambiarEncriptacion(encriptadorNumerico);
		string3 = encriptador.encriptar(string1);
		assertEquals(string3, "123");
		assertEquals(encriptador.desencriptar(string3), "abc");
	}

}
