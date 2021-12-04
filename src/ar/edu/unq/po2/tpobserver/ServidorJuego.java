package ar.edu.unq.po2.tpobserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ServidorJuego {
	private ArrayList<String> preguntas;
	private int preguntaActual = 0;
	private ArrayList<String> respuestas;
	private ArrayList<IParticipante> participantes;
	private Map<IParticipante, Integer> puntajes;
	private EstadoPartida estado;// Se implementa el patron State para los estados posibles de una partida
	
	public ServidorJuego(ArrayList<String> preguntas, ArrayList<String> respuestas) {
		this.respuestas = respuestas;
		this.participantes = new ArrayList<IParticipante>();
		this.preguntas = preguntas;
		this.estado = new EsperandoJugadores();
		this.puntajes = new HashMap<IParticipante, Integer>();
	}
	
	public void unirParticipante(IParticipante participante) {
		this.getEstado().unirParticipante(this, participante);		
	}
	
	public void agregarParticipante(IParticipante participante) {
		this.participantes.add(participante);
		this.puntajes.put(participante, 0);
	}

	public boolean esRespuestaCorrecta(String respuesta) {
		
		return this.respuestas.get(this.preguntaActual).equals(respuesta);
	}
	
	public void actualizarPuntaje(IParticipante participante) {
		int puntajeActual = this.puntajes.get(participante);
		this.puntajes.put(participante, puntajeActual+1);
	}
	
	public void anunciarAlGanador() {
		IParticipante participanteGanador = this.elegirGanador();
		for(IParticipante participante : this.participantes) {
			participante.alerta("El ganador es " + participanteGanador.getNombre());
		}
	}
	
	public void notificarRespuestaCorrectaDe(IParticipante participanteConRespuesta) {
		for(IParticipante participante : this.participantes) {
			participante.alerta("La pregunta numero "+this.preguntaActual+"fue respondida por"+ participanteConRespuesta.getNombre());
		}
	}

	private void finalizarJuego() {
		this.getEstado().finalizarJuego(this);		
	}

	private IParticipante elegirGanador() {
		IParticipante ganadorHastaAhora = this.participantes.get(0);
		for(IParticipante participante : this.participantes) {
			ganadorHastaAhora = tieneMasPuntaje(participante, ganadorHastaAhora);
		}
		return ganadorHastaAhora;
	}
	
	private IParticipante tieneMasPuntaje(IParticipante participante1, IParticipante participante2) {
		if (this.puntajes.get(participante1) >= this.puntajes.get(participante2)) {
			return participante1;
		}
		else {
			return participante2;
		}
	}

	public void recibirRespuesta(String pregunta, String respuesta, IParticipante participante) {
		this.getEstado().verificarRespuesta(pregunta, respuesta, participante, this);		
	}

	public EstadoPartida getEstado() {
		return estado;
	}

	public void setEstado(EstadoPartida estado) {
		this.estado = estado;
	}

	public ArrayList<IParticipante> getParticipantes() {
		
		return this.participantes;
	}

	public void comenzarJuego() {
		this.setEstado(new JuegoEnProgreso());
		for(IParticipante participante : this.participantes) {
			participante.alerta("Comienza la partida");
			participante.comenzarPartida(this.preguntas);
		}
		
	}

	public ArrayList<String> getPreguntas() {
		return preguntas;
	}

	public int getPreguntaActual() {
		return preguntaActual;
	}

	public void pasarASiguientePregunta() {
		if (this.preguntaActual < 4) {
			this.preguntaActual = this.preguntaActual + 1;
		}
		else {
			this.finalizarJuego();
		}
	}

	public Map<IParticipante, Integer> getPuntajes() {
		return puntajes;
	}
	
}
