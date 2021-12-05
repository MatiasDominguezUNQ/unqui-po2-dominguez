package ar.edu.unq.po2.tpstatestrategy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaquinaVideojuegosTest {
	private MaquinaVideojuegos maquina;
	
	@BeforeEach
	public void setUp() throws Exception {
		maquina = new MaquinaVideojuegos();
	}
	
	@Test
	public void testEncenderMaquina() {
		maquina.presionarBotonEncendido();
		assertEquals(maquina.getEstado().getClass(), EsperandoFichas.class);
	}
	
	@Test
	public void testInsertarUnaFicha() {
		maquina.presionarBotonEncendido();
		maquina.insertarFicha();
		assertEquals(maquina.getEstado().getClass(), EsperandoUnJugador.class);
	}
	
	@Test
	public void testInsertarDosFichas() {
		maquina.presionarBotonEncendido();
		maquina.insertarFicha();
		maquina.insertarFicha();
		assertEquals(maquina.getEstado().getClass(), EsperandoDosJugadores.class);
	}
	
	@Test
	public void testIniciarUnJugador() {
		maquina.presionarBotonEncendido();
		maquina.insertarFicha();
		maquina.presionarBotonEncendido();
		assertEquals(maquina.getEstado().getClass(), JuegoComenzadoUnJugador.class);
	}
	
	@Test
	public void testIniciarDosJugadores() {
		maquina.presionarBotonEncendido();
		maquina.insertarFicha();
		maquina.insertarFicha();
		maquina.presionarBotonEncendido();
		assertEquals(maquina.getEstado().getClass(), JuegoComenzadoDosJugadores.class);
	}
	
	@Test
	public void testFinalizarJuego() {
		maquina.presionarBotonEncendido();
		maquina.insertarFicha();
		maquina.presionarBotonEncendido();
		maquina.presionarBotonEncendido();
		assertEquals(maquina.getEstado().getClass(), MaquinaApagada.class);
	}
}
