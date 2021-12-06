package ar.edu.unq.po2.tprefactor.automotor;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		return (vehiculo.debeRealizarVtvEn(fecha));

	}
}
