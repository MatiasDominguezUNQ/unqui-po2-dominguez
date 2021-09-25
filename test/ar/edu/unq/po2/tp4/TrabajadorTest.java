package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TrabajadorTest {

	private Trabajador juan;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private Ingreso ingreso3;
	
	
	@BeforeEach
	public void setUp() {
		
		ingreso1 = new Ingreso("Enero","Soporte", 5000);
		ingreso2 = new Ingreso("Marzo","Soporte", 10000);
		ingreso3 = new IngresoPorHorasExtras("Enero","Soporte", 5000,5);
		juan = new Trabajador();
	}
	
		@Test
	//Calcular monto total percibido
	public void montoPercibido() {
		//juan.agregarIngreso(ingreso1);
		juan.agregarIngreso(ingreso1);
		juan.agregarIngreso(ingreso2);
		juan.agregarIngreso(ingreso3);
		assertEquals(20000, juan.getTotalPercibido());
	}
	
	// Test cantidad de ingresos dentro del trabajador
	@Test
	public void testCantidadDeIngresos() {
		assertEquals(0, juan.getCantidadDeIngresos());
		juan.agregarIngreso(ingreso1);
		juan.agregarIngreso(ingreso2);
		juan.agregarIngreso(ingreso3);
		
		assertEquals(3, juan.getCantidadDeIngresos());
	}
	
	//Test monto total monto imponible 
	@Test
	
	public void montoImponible() {
		
		juan.agregarIngreso(ingreso1);
		juan.agregarIngreso(ingreso2);
		juan.agregarIngreso(ingreso3);
		assertEquals(15000, juan.getMontoImponible());
	}
	
	//Calcula el impuesto a pagar por el trabajador
	@Test
	public void impuestoAPagar() {
		juan.agregarIngreso(ingreso1);
		juan.agregarIngreso(ingreso2);
		juan.agregarIngreso(ingreso3);
		assertEquals(300,juan.getImpuestoAPagar());
	}
	
	
	
}