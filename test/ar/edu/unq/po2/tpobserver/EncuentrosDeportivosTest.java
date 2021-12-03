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

public class EncuentrosDeportivosTest {
	private Aplicacion aplicacion;
	private Partido partido1;
	private Partido partido2;
	private Partido partido3;
	private IPartidoListener servidor;
	private IPartidoListener appMovil;
	private List<String> contrincantes1;
	private List<String> contrincantes2;
	private List<String> contrincantes3;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		this.aplicacion = new Aplicacion();
		this.contrincantes1 =  Arrays.asList("Juan", "Nicolas");
		this.contrincantes2 = Arrays.asList("Martin", "Pedro");
		this.contrincantes3 = Arrays.asList("Juan", "Pedro");
		this.partido1 = new Partido("Gana Juan", contrincantes1, "Tennis");
		this.partido2 = new Partido("Gana Pedro", contrincantes2, "Ping Pong");
		this.partido3 = new Partido("Gana Pedro", contrincantes3, "Ajedrez");
		this.servidor = mock(IPartidoListener.class);
		this.appMovil = mock(IPartidoListener.class);
		this.aplicacion.agregarListener(servidor);
		this.aplicacion.agregarListener(appMovil);

	}

	@Test
	void listenerRecibeNotificacionTest() {
		when(servidor.intereses()).thenReturn(Arrays.asList("Ping Pong", "Tennis"));
		when(appMovil.intereses()).thenReturn(Arrays.asList("Futbol", "Martin"));
		this.aplicacion.agregarPartido(partido1);
		this.aplicacion.agregarPartido(partido2);
		this.aplicacion.agregarPartido(partido3);
		
		assertEquals(aplicacion.getPartidos().size(), 3);
		verify(appMovil).recibirPartido(partido2);
		verify(servidor).recibirPartido(partido1);
		verify(servidor).recibirPartido(partido2);
	}
	
	@Test
	void listenerNoRecibeNotificacionTest() {
		when(servidor.intereses()).thenReturn(Arrays.asList("Natacion"));
		when(appMovil.intereses()).thenReturn(Arrays.asList("Futbol", "Carlos"));
		this.aplicacion.agregarPartido(partido1);
		this.aplicacion.agregarPartido(partido2);
		this.aplicacion.agregarPartido(partido3);
		
		assertEquals(aplicacion.getPartidos().size(), 3);
		verify(appMovil, never()).recibirPartido(partido1);
		verify(appMovil, never()).recibirPartido(partido2);
		verify(appMovil, never()).recibirPartido(partido3);
		verify(servidor, never()).recibirPartido(partido1);
		verify(servidor, never()).recibirPartido(partido2);
		verify(servidor, never()).recibirPartido(partido3);
	}

}
