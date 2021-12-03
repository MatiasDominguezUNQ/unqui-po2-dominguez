package ar.edu.unq.po2.tpobserver;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Arrays;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PublicacionesTest {
	private Sistema sistema;
	private Articulo articulo1;
	private Articulo articulo2;
	private ISubscriptor subscriptor;
	private List<String> autores1;
	private List<String> autores2;
	private List<String> filiaciones1;
	private List<String> filiaciones2;
	private List<String> palabrasClave1;
	private List<String> palabrasClave2;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		this.sistema = new Sistema();
		this.autores1 =  Arrays.asList("Juan Perez");
		this.autores2 =  Arrays.asList("Pedro Lopez");
		this.filiaciones1 = Arrays.asList("Universidad");
		this.filiaciones2 = Arrays.asList("Laboratorio");
		this.palabrasClave1 = Arrays.asList("Educacion", "Institucion");
		this.palabrasClave2 = Arrays.asList("Educacion", "Institucion");
		this.articulo1 = new Articulo("articulo1", autores1, filiaciones1, "Informativo", "Bs. As.", palabrasClave1);
		this.articulo2 = new Articulo("articulo2", autores2, filiaciones2, "Cientifico", "Mendoza", palabrasClave2);
		this.subscriptor = mock(ISubscriptor.class);

	}

	@Test
	void subscriptorRecibeNotificacionTest() {
		this.sistema.agregarSubscriptor(subscriptor);
		when(subscriptor.criterio()).thenReturn("Informativo");
		this.sistema.agregarArticulo(articulo1);
		this.sistema.agregarArticulo(articulo2);
		
		assertEquals(sistema.getArticulos().size(), 2);
		verify(subscriptor).recibirNotificación(articulo1);
	}
	
	@Test
	void subscriptorNoRecibeNotificacionTest() {
		this.sistema.agregarSubscriptor(subscriptor);
		when(subscriptor.criterio()).thenReturn("Revista");
		this.sistema.agregarArticulo(articulo1);
		this.sistema.agregarArticulo(articulo2);
		
		assertEquals(sistema.getArticulos().size(), 2);
		verify(subscriptor, never()).recibirNotificación(articulo1);
		verify(subscriptor, never()).recibirNotificación(articulo2);
	}

}
