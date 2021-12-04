package ar.edu.unq.po2.tpcomposite;

import java.util.Date;
import java.util.List;
	
	//Rol: Leaf
public class Directorio extends File {
	
	private String nombre;
	private List<File> contenido;
	private Date fechaCreacion;

	public Directorio(String nombre, List<File> contenido, Date fechaActual) {
		super();
		this.nombre = nombre;
		this.contenido = contenido;
		this.fechaCreacion = fechaActual;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public int totalSize() {
		int sizeTotal = 0;
		
		for(FileSystem file : contenido) {
			sizeTotal += file.totalSize();
		}
		
		return sizeTotal;
	}

	@Override
	public void printStructure() {
		for(FileSystem file : contenido) {
			file.printStructure();
		}
	}

	@Override
	public FileSystem lastModified() {
		File ultimoModificado = this.contenido.get(0);
		for(File file : contenido) {
			ultimoModificado = this.fueModificadoUltimo(ultimoModificado, file);
		}
		
		return ultimoModificado;
	
	}

	private File fueModificadoUltimo(File file1, File file2) {
		if (file1.fechaModificacion().after(file2.fechaModificacion())) {
			return file1;
		} else {
			return file2;
		}		
	}

	@Override
	public File oldestElement() {
		File elementoMasViejo = this.contenido.get(0);
		for(File file : contenido) {
			elementoMasViejo = this.fueModificadoAntes(elementoMasViejo, file);
		}
		
		return elementoMasViejo;
	}

	private File fueModificadoAntes(File file1, File file2) {
		if (file1.fechaModificacion().after(file2.fechaModificacion())) {
			return file2;
		} else {
			return file1;
		}
	}

	@Override
	public Date fechaModificacion() {
		return this.fechaCreacion;
	}

}