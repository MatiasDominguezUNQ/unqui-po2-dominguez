package ar.edu.unq.po2.tpobserver;

import java.util.ArrayList;

public interface IParticipante {
	
	public void solicitarUnirse(ServidorJuego servidor);
	public void comenzarPartida(ArrayList<String> preguntas);
	public void alerta(String mensaje);
	public void responderPregunta(String pregunta);
	public String getNombre();

}
