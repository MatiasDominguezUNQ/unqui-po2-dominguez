package ar.edu.unq.po2.tpcomposite;

import java.util.List;
	//Patron: Composite
	//Rol: Composite
public abstract class Personaje implements Caracter{
	private int posicionX;
	private int posicionY;
	
	public int getPosicionX() {
		return posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	@Override
	public void moverHaciaElPunto(int puntoX, int puntoY) {
		this.posicionX = puntoX;
		this.posicionY = puntoY;
	}

	@Override
	public void add(Caracter child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Caracter child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Caracter> getCaracteres() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
