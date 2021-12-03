package ar.edu.unq.po2.tpobserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Articulo {
	private String titulo;
	private List<String> autores;
	private List<String> filiaciones;
	private String tipo;
	private String lugar;
	private List<String> palabrasClave;
	
	
	public Articulo(String titulo, List<String> autores, List<String> filiaciones, String tipo, String lugar,
			List<String> palabrasClave) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.filiaciones = filiaciones;
		this.tipo = tipo;
		this.lugar = lugar;
		this.palabrasClave = palabrasClave;
	}


	public String getTitulo() {
		return titulo;
	}


	public List<String> getAutores() {
		return autores;
	}


	public List<String> getFiliaciones() {
		return filiaciones;
	}


	public String getTipo() {
		return tipo;
	}


	public String getLugar() {
		return lugar;
	}


	public List<String> getPalabrasClave() {
		return palabrasClave;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}


	public void setFiliaciones(ArrayList<String> filiaciones) {
		this.filiaciones = filiaciones;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public void setPalabrasClave(ArrayList<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}


	public boolean cumpleCon(String criterio) {
		ArrayList<String> informacionArticulo = new ArrayList<String>();
		informacionArticulo.addAll(Arrays.asList(this.titulo,this.tipo,this.lugar));
		informacionArticulo.addAll(this.autores);
		informacionArticulo.addAll(this.filiaciones);
		informacionArticulo.addAll(this.palabrasClave);
		
		return informacionArticulo.contains(criterio);
	}
}
