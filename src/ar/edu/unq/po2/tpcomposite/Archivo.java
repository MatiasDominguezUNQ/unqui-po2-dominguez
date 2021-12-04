package ar.edu.unq.po2.tpcomposite;

import java.time.LocalDate;
import java.util.Date;

	//Rol: Leaf
public class Archivo extends File {
	
	private String nombre;
	private int espacioEnDisco;
	private Date ultimaModificacion;

	public Archivo(String nombre, int espacioEnDisco, Date fechaActual) {
		this.nombre = nombre;
		this.espacioEnDisco = espacioEnDisco;
		this.ultimaModificacion = fechaActual;
	}

	public String getNombre() {
		return nombre;
	}


	public int getEspacioEnDisco() {
		return espacioEnDisco;
	}


	@Override
	public int totalSize() {
		return this.getEspacioEnDisco();
	}

	@Override
	public void printStructure() {
		System.out.println(this.getNombre());
	}

	@Override
	public FileSystem lastModified() {
		return this;
	}

	@Override
	public FileSystem oldestElement() {
		return this;
	}

	@Override
	public Date fechaModificacion() {
		return ultimaModificacion;
	}
}