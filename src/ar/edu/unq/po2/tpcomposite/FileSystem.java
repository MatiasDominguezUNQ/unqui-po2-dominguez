package ar.edu.unq.po2.tpcomposite;

	//Rol: Component
public interface FileSystem {

	public int totalSize();
	
	public void printStructure();
	
	public FileSystem lastModified();
	
	public FileSystem oldestElement();
	
}