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

	public boolean cumpleCon(String criterio) {
		ArrayList<String> informacionArticulo = new ArrayList<String>();
		informacionArticulo.addAll(Arrays.asList(this.titulo,this.tipo,this.lugar));
		informacionArticulo.addAll(this.autores);
		informacionArticulo.addAll(this.filiaciones);
		informacionArticulo.addAll(this.palabrasClave);
		
		return informacionArticulo.contains(criterio);
	}
}
