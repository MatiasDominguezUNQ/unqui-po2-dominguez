package ar.edu.unq.po2.tpeys;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class ActividadSemanal {
	private DiaDeLaSemana diaDeLaSemana;
	private int horaDeInicio;
	private int duracion;
	private Deporte deporte;
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	private List<ActividadSemanal> actividadesResultado;
	
	public ActividadSemanal(DiaDeLaSemana dia, int hora, int duracion, Deporte deporte) {
		this.diaDeLaSemana = dia;
		this.horaDeInicio  = hora;
		this.duracion      = duracion;
		this.deporte	   = deporte;
	}
	
	public ActividadSemanal() {
		// TODO Auto-generated constructor stub
	}

	public int costo() {
		int costoDeHora;
		if (diaDeLaSemana == DiaDeLaSemana.Lunes ||
			diaDeLaSemana == DiaDeLaSemana.Martes ||
			diaDeLaSemana == DiaDeLaSemana.Miercoles) {
			costoDeHora = 500;
		}
		else {
			costoDeHora = 1000;
		}
		return (costoDeHora * duracion) + (deporte.getComplejidad() * 200);
	}
	
	public List<ActividadSemanal> todasLasActividadesDeFutbol() {
		actividadesResultado = actividades.stream()
		.filter(actividad -> actividad.getDeporte().equals(Deporte.Futbol))
		.collect(Collectors.toList());
		return actividadesResultado;
	}
	
	public List<ActividadSemanal> todasLasActividadesDeComplejidad(int complejidad) {
		actividadesResultado = actividades.stream()
		.filter(actividad -> actividad.getDeporte().getComplejidad() == complejidad)
		.collect(Collectors.toList());
		return actividadesResultado;
	}
	
	public int horasTotalesDeActividades() {
		int resultado;
		resultado = actividades.stream()
		.mapToInt(ActividadSemanal::getDuracion)
		.sum();
		return resultado;
	}
	
	public ActividadSemanal actividadDeMenorCostoDe(Deporte deporte) {
		Optional<ActividadSemanal> resultado;
		resultado = actividades.stream()
		.filter(actividad -> actividad.getDeporte().equals(deporte))
		.min(Comparator.comparing(ActividadSemanal::costo));
		return resultado.get();
	}
	
	public Map<Deporte, ActividadSemanal> actividadMasEconomica() {
		Map<ActividadSemanal, List<ActividadSemanal>>actividadesResultado = 
		actividades.stream()
		.collect(Collectors.groupingBy(s -> this.actividadDeMenorCostoDe(s.getDeporte())));
		Map<Deporte, ActividadSemanal>  actividadMasEconomica = new HashMap<>();
		
		for(Entry<ActividadSemanal, List<ActividadSemanal>> entry : actividadesResultado.entrySet()) {
			actividadMasEconomica.put(entry.getKey().getDeporte(), entry.getKey());
		}
		return actividadMasEconomica;
	}

	public void agregarActividad(ActividadSemanal actividad) {
		actividades.add(actividad);
	}
	
	public String toString() {
		String stringResultado =
		"Deporte: "+this.getDeporte()+". Dia: "+this.getDiaDeLaSemana()+
		" a las: "+this.getHoraDeInicio()+". Duración: "+this.getDuracion()+
		"hora(s).";
		return stringResultado;
	}
	
	public void imprimirTodasLasActividades() {
		actividades.forEach(r -> System.out.println(r));
	}
	
	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}

	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}
	
}
