package ar.edu.unq.po2.tptests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	PokerStatus pokerStatus; //SUT
	Carta carta1; //DOC
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	Carta carta6;
	Carta carta7;
	Carta carta8;
	Carta carta9;
	Carta carta10;
	
	@BeforeEach
	public void setUp() throws Exception {
		pokerStatus = new PokerStatus();
		carta1 = new Carta("4","C");
		carta2 = new Carta("4","C");
		carta3 = new Carta("4","T");
		carta4 = new Carta("4","D");
		carta5 = new Carta("5","C");
		carta6 = new Carta("10","C");
		carta7 = new Carta("1","C");
		carta8 = new Carta("11","C");
		carta9 = new Carta("12","C");
		carta10 = new Carta("13","C");
	}	
	
	@Test
	public void hayPoker() {
		//Exercise
		List<Carta> jugada = Arrays.asList(carta1, carta2 , carta3, carta4 ,carta5);
		List<Carta> jugada2 = Arrays.asList(carta7, carta2 , carta3, carta4 ,carta1);
		Jugada primeraJugada  = pokerStatus.verificar(jugada);
		Jugada segundaJugada = pokerStatus.verificar(jugada2);
		//Verify
		assertEquals("Poker",primeraJugada.getTipoJugada());
		assertEquals("Poker",segundaJugada.getTipoJugada());
		assertTrue(primeraJugada.getTipoJugada()=="Poker");
		assertTrue(segundaJugada.getTipoJugada()=="Poker");		
	}
	
	@Test
	public void hayTrio() {
		//Exercise
		List<Carta> jugada = Arrays.asList(carta7,carta2,carta3,carta4,carta7);
		List<Carta> jugada2 = Arrays.asList(carta1,carta2,carta3,carta6,carta7);
		List<Carta> jugada3 = Arrays.asList(carta5,carta6,carta3,carta1,carta2);
		Jugada terceraJugada  = pokerStatus.verificar(jugada);
		Jugada cuartaJugada  = pokerStatus.verificar(jugada2);
		Jugada quintaJugada  = pokerStatus.verificar(jugada3);
		//Verify		
		assertEquals("Trio",terceraJugada.getTipoJugada());
		assertEquals("Trio",cuartaJugada.getTipoJugada());
		assertEquals("Trio",quintaJugada.getTipoJugada());
		assertTrue(terceraJugada.getTipoJugada()=="Trio");
		assertTrue(cuartaJugada.getTipoJugada()=="Trio");
		assertTrue(quintaJugada.getTipoJugada()=="Trio");
	}
	
	@Test
	
	public void esColor() {
		//Exercise
		List<Carta> jugada = Arrays.asList(carta5,carta6,carta1,carta7,carta2);
		Jugada sextaJugada  = pokerStatus.verificar(jugada);
		//Verify
		assertEquals("Color",sextaJugada.getTipoJugada());
		assertTrue(sextaJugada.getTipoJugada()=="Color");
	}
	
	
	@Test
	public void noHayJugada() {
		//Exercise
		List<Carta> mano = Arrays.asList(carta6,carta5,carta7,carta4,carta1);
		Jugada septimaJugada  = pokerStatus.verificar(mano);
		//Verify
		assertEquals("Nada",septimaJugada.getTipoJugada());
		assertTrue(septimaJugada.getTipoJugada()=="Nada") ;
	}
	
	@Test
	public void ganador() {
		//Exercise
		List<Carta> mano1 = Arrays.asList(carta1, carta2 , carta3, carta4 ,carta5);
		List<Carta> mano2 = Arrays.asList(carta6,carta5,carta7,carta4,carta1);		
		Jugada jugada  = pokerStatus.verificar(mano1);
		//Verify		
		assertTrue(jugada.jugadaGanador(mano1, mano2) == mano1);
		
	}
	
	@Test
	public void verificarPokerMockito() {
		//Setup
		this.carta1 = mock(Carta.class);
		this.carta2 = mock(Carta.class);
		this.carta3 = mock(Carta.class);
		this.carta4 = mock(Carta.class);
		this.carta5 = mock(Carta.class);
		//Exercise
		when(carta1.getValor()).thenReturn(2);
		when(carta2.getValor()).thenReturn(2);
		when(carta3.getValor()).thenReturn(2);
		when(carta4.getValor()).thenReturn(2);
		when(carta5.getValor()).thenReturn(3);
		Jugada jugada = pokerStatus.verificar(Arrays.asList(carta1, carta2, carta3, carta4, carta5));
		//Verify
		assertEquals(jugada.getTipoJugada(), "Poker");		
	}
}
