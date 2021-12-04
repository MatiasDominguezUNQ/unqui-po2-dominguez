package ar.edu.unq.po2.tpcomposite;

import java.util.Date;
	
	//Rol: Composite
public abstract class File implements FileSystem {
	
	public abstract Date fechaModificacion();
	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FileSystem lastModified() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
