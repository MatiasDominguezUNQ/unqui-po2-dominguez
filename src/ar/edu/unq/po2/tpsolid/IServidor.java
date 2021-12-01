package ar.edu.unq.po2.tpsolid;

import java.util.List;

public interface IServidor {

	public void enviar(Correo correo);
	public List<Correo> recibirNuevos(String user, String pass);
	public void conectar(String nombreUsuario, String passusuario);

}
