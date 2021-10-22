package ar.edu.unq.po2.tptests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {
	//SETUP TDD
	PokerStatus pokerStatus;
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	Carta carta6;
	Carta carta7;
	Carta carta8;
	Carta carta9;
	Carta carta10;
	Jugada jugadaFinal;	
	
	//SUT
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
		jugadaFinal = new Jugada(null);
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
		List<Carta> jugada = Arrays.asList(carta6,carta5,carta7,carta4,carta1);
		Jugada septimaJugada  = pokerStatus.verificar(jugada);
		//Verify
		assertEquals("Nada",septimaJugada.getTipoJugada());
		assertTrue(septimaJugada.getTipoJugada()=="Nada") ;
	}
	
	@Test
	public void ganador() {
		//Exercise
		List<Carta> jugada = Arrays.asList(carta1, carta2 , carta3, carta4 ,carta5);
		List<Carta> jugada2 = Arrays.asList(carta6,carta5,carta7,carta4,carta1);		
		//Verify		
		jugadaFinal.jugadaGanador(jugada, jugada2);
		
	}	
}