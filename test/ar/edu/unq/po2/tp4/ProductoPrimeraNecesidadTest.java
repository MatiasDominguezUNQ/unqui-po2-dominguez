package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 100, 8);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(100, leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioDescuento() {
		assertEquals(92, leche.calcularPrecio());
	}
	
	
}
