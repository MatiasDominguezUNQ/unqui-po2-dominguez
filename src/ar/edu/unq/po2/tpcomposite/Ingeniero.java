package ar.edu.unq.po2.tpcomposite;

	//Patron: Composite
	//Rol: leaf
public class Ingeniero extends Personaje{
	private int lajas;

	public Ingeniero(int lajas) {
		super();
		this.lajas = lajas;
	}

	@Override
	public void moverHaciaElPunto(int puntoX, int puntoY) {
		while (this.getPosicionX() != puntoX && this.getPosicionY() != puntoY) {
			this.avanzarHacia(puntoX, puntoY);
			this.ponerLajaSiTiene();
		}
	}

	private void avanzarHacia(int puntoX, int puntoY) {
		// TODO Auto-generated method stub
		
	}

	private void ponerLajaSiTiene() {
		if (this.lajas > 0) {
			this.ponerLajaSiNoHay();
		}
	}

	private void ponerLajaSiNoHay() {
		if (! this.hayLajaEnLaPosicionActual()) {
			this.ponerLaja();
		}
	}

	private boolean hayLajaEnLaPosicionActual() {
		//revisa si hay lajas
		return false;
	}

	private void ponerLaja() {
		this.lajas -= 1;
	}

}
