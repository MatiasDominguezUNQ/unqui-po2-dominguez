package ar.edu.unq.po2.tpobserver;

public abstract class EstadoPartida {
	
	public abstract void unirParticipante(ServidorJuego servidor, IParticipante participante);
	public abstract void verificarRespuesta(String pregunta, String respuesta, IParticipante participante, ServidorJuego servidor);
	public abstract void finalizarJuego(ServidorJuego servidor);
	
}
