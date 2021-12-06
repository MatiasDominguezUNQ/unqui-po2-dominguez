package ar.edu.unq.po2.tprefactor.automotor;

import java.time.LocalDate;

public class Vehiculo {
	private Boolean esVehiculoPolicial;
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.esVehiculoPolicial = esVehiculoPolicial;
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

	public Boolean esVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}

	public Boolean debeRealizarVtvEn(LocalDate fecha) {
		
		return (!this.esVehiculoPolicial && this.llevaUnAñoDesde(fecha)
				&& this.estRadicadoEnBuenosAires());

	}

	private boolean llevaUnAñoDesde(LocalDate fecha) {
		return fecha.minusYears(1).isAfter(this.fechaFabricacion);
	}

	private boolean estRadicadoEnBuenosAires() {
		
		return ciudadRadicacion.equalsIgnoreCase("Buenos Aires");
	}
}
