package ar.edu.unq.po2.tpstatestrategy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReproductorTest {
	private Reproductor reproductor;
	private Song cancion;
	
	@BeforeEach
	public void setUp() throws Exception {
		cancion = new Song();
		reproductor = new Reproductor(cancion);
	}
	
	@Test
	public void testEstadoInicialDeReproductorYCancion() {
		assertEquals(reproductor.getEstado().getClass(), SeleccionDeCanciones.class);
		assertEquals(cancion.getEstado().getClass(), CancionFrenada.class);
	}
	
	@Test
	public void testReproducirCancion() {
		reproductor.play();
		assertEquals(reproductor.getEstado().getClass(), ReproduciendoCancion.class);
		assertEquals(cancion.getEstado().getClass(), CancionReproduciendose.class);
	}

	@Test
	public void testPausarCancion() {
		reproductor.play();
		reproductor.pause();
		assertEquals(reproductor.getEstado().getClass(), ReproduciendoCancion.class);
		assertEquals(cancion.getEstado().getClass(), CancionPausada.class);
	}
	
	@Test
	public void testFrenarCancion() {
		reproductor.play();
		reproductor.stop();
		assertEquals(reproductor.getEstado().getClass(), SeleccionDeCanciones.class);
		assertEquals(cancion.getEstado().getClass(), CancionFrenada.class);
	}
	
	@Test
	public void testPausarYReproducirCancion() {
		reproductor.play();
		reproductor.pause();
		reproductor.pause();
		assertEquals(reproductor.getEstado().getClass(), ReproduciendoCancion.class);
		assertEquals(cancion.getEstado().getClass(), CancionReproduciendose.class);
	}
	
	@Test
	public void testPausarSiNoHayCancion() {
		reproductor.pause();
		assertEquals(reproductor.getEstado().getClass(), SeleccionDeCanciones.class);
		assertEquals(cancion.getEstado().getClass(), CancionFrenada.class);
	}
}
