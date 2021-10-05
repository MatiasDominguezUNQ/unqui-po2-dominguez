package ar.edu.unq.po2.tpcei;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CajaTest {
	
	private Caja caja;
	private Producto producto1;
	private ProductoCooperativa producto2;
	private Impuesto impuesto;
	private Servicio servicio; 
	
	@BeforeEach 
	private void setUp() {
		caja = new Caja();
		producto1 = new Producto(5,500);
		producto2 = new ProductoCooperativa(10,9000);
		impuesto = new Impuesto(50);
		servicio = new Servicio(5,1000);
	}
	
	@Test
	public void stockComun() {
		caja.registrarPago(producto1);
		assertEquals(4, producto1.getStock());
		assertEquals(500,caja.getMontoAPagar());
	}
	
	@Test
	public void stockTradicional() {
		caja.registrarPago(producto2);
		assertEquals(9, producto2.getStock());
		assertEquals(8100,caja.getMontoAPagar());
	}
	
	
	@Test
	public void impuesto() {
		caja.registrarPago(impuesto);
		assertEquals(50,caja.getMontoAPagar());
	}
	
	@Test
	public void servicio() {
		caja.registrarPago(servicio);
		assertEquals(5000,caja.getMontoAPagar());
	}
	
	@Test
	public void todosProductos() {
		caja.registrarPago(servicio);
		caja.registrarPago(producto1);
		caja.registrarPago(impuesto);
		caja.registrarPago(producto2);
		assertEquals(13650,caja.getMontoAPagar());
	}
}