package ar.edu.unq.po2.tpcomposite;

import java.util.List;
	//Patron: Composite
	//Rol: Component
public interface Caracter {

	public abstract void moverHaciaElPunto(int puntoX, int puntoY);
	
	public abstract void add(Caracter caracter);
		
	public abstract void remove(Caracter caracter);
	
	public abstract List<Caracter> getCaracteres();
	
}
