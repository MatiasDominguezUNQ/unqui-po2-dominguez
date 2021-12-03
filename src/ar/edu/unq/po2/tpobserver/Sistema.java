package ar.edu.unq.po2.tpobserver;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Articulo> articulos;
	private List<ISubscriptor> subscriptores;
	
	public Sistema() {
		this.articulos = new ArrayList<Articulo>();
		this.subscriptores = new ArrayList<ISubscriptor>();
}

	public List<Articulo> getArticulos() {
		return articulos;
	}
	
	public List<ISubscriptor> getSubscriptores() {
		return subscriptores;
	}
	
	public void agregarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		this.notificarPublicacion(articulo);
	}
	
	public void agregarSubscriptor(ISubscriptor subscriptor) {
		this.subscriptores.add(subscriptor);
	}

	private void notificarPublicacion(Articulo articulo) {
		for (ISubscriptor subscriptor : this.getSubscriptores()) {
			this.notificarSiEstaInteresado(subscriptor, articulo);
		}
	}

	private void notificarSiEstaInteresado(ISubscriptor subscriptor, Articulo articulo) {
		if(articulo.cumpleCon(subscriptor.criterio())) {
			subscriptor.recibirNotificación(articulo);
		}
		
	}

}