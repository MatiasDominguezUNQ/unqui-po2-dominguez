package ar.edu.unq.po2.tpobserver;

public class JuegoEnProgreso extends EstadoPartida {

	@Override
	public void unirParticipante(ServidorJuego servidor, IParticipante participante) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verificarRespuesta(String pregunta, String respuesta, IParticipante participante, ServidorJuego servidor) {
		if(servidor.getPreguntas().get(servidor.getPreguntaActual()) == pregunta &&
		   servidor.esRespuestaCorrecta(respuesta)) {
			servidor.actualizarPuntaje(participante);
			servidor.notificarRespuestaCorrectaDe(participante);
			servidor.pasarASiguientePregunta();
		} else {
			participante.alerta("Respuesta invalida.");				
		}

	}

	@Override
	public void finalizarJuego(ServidorJuego servidor) {
		servidor.setEstado(new JuegoFinalizado());
		servidor.anunciarAlGanador();

	}

}
