package ar.edu.unq.po2.tpcomposite;

import java.util.ArrayList;
import java.util.List;
	//Patron: Composite
	//Rol: leaf
public class Ejercito extends Personaje{

	private ArrayList<Caracter> caracteres = new ArrayList<Caracter>();


	@Override
	public void moverHaciaElPunto(int puntoX, int puntoY) {
		for(Caracter caracter : caracteres) {
			caracter.moverHaciaElPunto(puntoX, puntoY);
		}
	}
	
	@Override
	public void add(Caracter caracter) {
		this.caracteres.add(caracter);
		
	}

	@Override
	public void remove(Caracter caracter) {
		this.caracteres.remove(caracter);
		
	}
	
	@Override
	public List<Caracter> getCaracteres() {
		return caracteres;
	}


}
