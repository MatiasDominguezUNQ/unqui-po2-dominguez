package ar.edu.unq.po2.tpcomposite;


public interface FileSystem {

	public int totalSize();
	
	public void printStructure();
	
	public FileSystem lastModified();
	
	public FileSystem oldestElement();
	
}