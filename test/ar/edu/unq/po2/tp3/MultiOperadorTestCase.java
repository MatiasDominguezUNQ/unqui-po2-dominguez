package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiOperadorTestCase {
	
	private MultiOperador multiOperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		multiOperador = new MultiOperador();
		
		multiOperador.agregarEntero(100);
		multiOperador.agregarEntero(1);
		multiOperador.agregarEntero(2);
		multiOperador.agregarEntero(3);
		
	}
	
	@Test
	void testSumarEnteros() {
		
		int number = multiOperador.sumarEnteros();
		assertEquals(number, 106);
	}
	
	@Test
	void testRestarEnteros() {
		
		int number = multiOperador.restarEnteros();
		assertEquals(number, 94);
	}
	
	@Test
	void testMultiplicarEnteros() {
		
		int number = multiOperador.multiplicarEnteros();
		assertEquals(number, 600);
	}
}
