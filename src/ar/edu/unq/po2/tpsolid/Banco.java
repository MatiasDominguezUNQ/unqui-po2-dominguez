package ar.edu.unq.po2.tpsolid;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Solicitud> solicitudes = new ArrayList<Solicitud>();
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void recibirSolicitud(Solicitud solicitud) {
		this.registrarSolicitud(solicitud);
		this.evaluarSolicitud(solicitud);
	}

	private void registrarSolicitud(Solicitud solicitud) {
		solicitudes.add(solicitud);
	}

	public void evaluarSolicitud(Solicitud solicitud) {
		if (solicitud.cumpleRequisitos()) {
			this.aceptarSolicitud();
		} else {
			this.rechazarSolicitud();
		}
		
	}

	private void rechazarSolicitud() {
		// TODO Auto-generated method stub
		
	}

	private void aceptarSolicitud() {
		// TODO Auto-generated method stub
		
	}
}
