package ar.edu.unq.po2.tpobserver;

public class EsperandoJugadores extends EstadoPartida {

	@Override
	public void unirParticipante(ServidorJuego servidor, IParticipante participante) {
		if(servidor.getParticipantes().size() == 4) {
			servidor.agregarParticipante(participante);
			servidor.comenzarJuego();
		} else {
			servidor.agregarParticipante(participante);
		}
	}

	@Override
	public void verificarRespuesta(String pregunta, String respuesta, IParticipante participante, ServidorJuego servidor) {

	}

	@Override
	public void finalizarJuego(ServidorJuego servidor) {
		
	}

}
