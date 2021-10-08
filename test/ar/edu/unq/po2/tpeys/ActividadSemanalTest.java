package ar.edu.unq.po2.tpeys;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ActividadSemanalTest {
	ActividadSemanal actividadesSemanales = new ActividadSemanal();
	@BeforeEach
	public void setUp() throws Exception {
		actividadesSemanales.agregarActividad(new ActividadSemanal(DiaDeLaSemana.Lunes, 900, 2, Deporte.Futbol));
		actividadesSemanales.agregarActividad(new ActividadSemanal(DiaDeLaSemana.Martes, 1000, 4, Deporte.Running));
		actividadesSemanales.agregarActividad(new ActividadSemanal(DiaDeLaSemana.Miercoles, 1500, 3, Deporte.Tennis));
		actividadesSemanales.agregarActividad(new ActividadSemanal(DiaDeLaSemana.Jueves, 1600, 1, Deporte.Jabalina));
		actividadesSemanales.agregarActividad(new ActividadSemanal(DiaDeLaSemana.Viernes, 1300, 2, Deporte.Running));
		actividadesSemanales.agregarActividad(new ActividadSemanal(DiaDeLaSemana.Sabado, 1200, 3, Deporte.Basket));
		actividadesSemanales.agregarActividad(new ActividadSemanal(DiaDeLaSemana.Domingo, 1100, 2, Deporte.Futbol));
	}
	
	@Test
	public void todasLasActividadesDeFutbol() {
		List<ActividadSemanal> resultado =
		actividadesSemanales.todasLasActividadesDeFutbol();
		resultado.forEach(r -> System.out.println(r.getDeporte()));
	}
	
	@Test
	public void todasLasActividadesDeComplejidad() {
		List<ActividadSemanal> resultado =
		actividadesSemanales.todasLasActividadesDeComplejidad(3);
		resultado.forEach(r -> System.out.println(r.getDeporte()));
	}
	
	@Test
	public void horasTotalesDeActividades() {
		int resultado = 
		actividadesSemanales.horasTotalesDeActividades();
		System.out.println(resultado);
	}
	
	@Test
	public void actividadDeMenorCosto() {
		ActividadSemanal resultado = 
		actividadesSemanales.actividadDeMenorCostoDe(Deporte.Futbol);
		System.out.println(resultado.costo());
	}
	
	@Test
	public void actividadMasEconomica() {
		Map<Deporte, ActividadSemanal>actividadesResultado = 
		actividadesSemanales.actividadMasEconomica();
		System.out.println(actividadesResultado);
	}
	
	@Test
	public void imprimirActividades() {
		actividadesSemanales.imprimirTodasLasActividades();
	}
}
