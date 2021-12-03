package ar.edu.unq.po2.tpobserver;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Articulo> articulos;
	private ArrayList<ISubscriptor> subscriptores;

	public Sistema(ArrayList<Articulo> articulos, ArrayList<ISubscriptor> subscriptores) {
		super();
		this.articulos = articulos;
		this.subscriptores = subscriptores;
	}
	
	public Sistema() {
		this.articulos = new ArrayList<Articulo>();
		this.subscriptores = new ArrayList<ISubscriptor>();
}

	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}
	
	public ArrayList<ISubscriptor> getSubscriptores() {
		return subscriptores;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}

	public void setSubscriptores(ArrayList<ISubscriptor> subscriptores) {
		this.subscriptores = subscriptores;
	}
	
	public void agregarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		this.notificarPublicación(articulo);
	}
	
	public void agregarSubscriptor(ISubscriptor subscriptor) {
		this.subscriptores.add(subscriptor);
	}

	private void notificarPublicación(Articulo articulo) {
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