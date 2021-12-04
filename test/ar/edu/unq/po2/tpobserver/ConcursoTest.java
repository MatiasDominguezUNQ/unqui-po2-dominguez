package ar.edu.unq.po2.tpobserver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConcursoTest {
	private ServidorJuego servidor;
	private IParticipante participante1;
	private IParticipante participante2;
	private IParticipante participante3;
	private IParticipante participante4;
	private IParticipante participante5;
	private ArrayList<String> preguntas = new ArrayList<String>();
	private ArrayList<String> respuestas = new ArrayList<String>();
	
	@BeforeEach
	public void setUp() throws Exception {
		this.preguntas.addAll(Arrays.asList("pregunta1","pregunta2","pregunta3","pregunta4","pregunta5"));
		this.respuestas.addAll(Arrays.asList("1","2","3","4","5"));
		this.servidor = new ServidorJuego(preguntas, respuestas);
		this.participante1 = mock(IParticipante.class);
		this.participante2 = mock(IParticipante.class);
		this.participante3 = mock(IParticipante.class);
		this.participante4 = mock(IParticipante.class);
		this.participante5 = mock(IParticipante.class);
		servidor.unirParticipante(participante1);
		servidor.unirParticipante(participante2);
		servidor.unirParticipante(participante3);
		servidor.unirParticipante(participante4);
	}

	@Test
	void elJuegoNoIniciaSin5Participantes() {
		assertEquals(servidor.getEstado().getClass(), EsperandoJugadores.class);
		assertEquals(servidor.getParticipantes().size(), 4);
	}
	
	@Test
	void iniciaLaPartidaTest() {
		servidor.unirParticipante(participante5);
	
		assertEquals(servidor.getEstado().getClass(), JuegoEnProgreso.class);
		assertEquals(servidor.getParticipantes().size(), 5);
	}
	
	@Test
	public void elJuegoAvanzaAlResponderUnaPreguntaTest() {
		servidor.unirParticipante(participante5);
		assertEquals(servidor.getPreguntaActual(), 0);
		
		servidor.recibirRespuesta("pregunta1", "1", participante1);
		assertTrue(servidor.getPuntajes().get(participante1).equals(1));
		assertEquals(servidor.getPreguntaActual(), 1);
	}
	
	@Test
	void siSeRespondenLas5PreguntasElJuegoTerminaTest() {
		servidor.unirParticipante(participante5);
		
		servidor.recibirRespuesta("pregunta1", "1", participante1);
		servidor.recibirRespuesta("pregunta2", "2", participante1);
		servidor.recibirRespuesta("pregunta3", "3", participante2);
		servidor.recibirRespuesta("pregunta4", "4", participante3);
		servidor.recibirRespuesta("pregunta5", "5", participante4);
		
		assertTrue(servidor.getPuntajes().get(participante1).equals(2));
		assertEquals(servidor.getEstado().getClass(), JuegoFinalizado.class);
	}
	
	@Test
	void respuestaIncorrectaTest() {
		servidor.unirParticipante(participante5);
		
		servidor.recibirRespuesta("pregunta1", "3", participante1);
		
		assertTrue(servidor.getPuntajes().get(participante1).equals(0));
		verify(participante1).alerta("Respuesta invalida.");
	}

	@Test
	void noPuedenUnirseMasDe5ParticipantesTest() {
		//Setup
		servidor.unirParticipante(participante5);
		//Exercise
		servidor.unirParticipante(participante1);
		servidor.unirParticipante(participante1);
		servidor.unirParticipante(participante1);
		//Verify
		assertEquals(servidor.getParticipantes().size(), 5);
	}
}
