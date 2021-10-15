package ar.edu.unq.po2.tpsolid;

import java.util.List;

public interface IRecepcion {
	
	public List<Correo> recibirNuevos(String user, String pass);

}
