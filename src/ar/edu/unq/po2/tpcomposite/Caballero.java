package ar.edu.unq.po2.tpcomposite;

	//Patron: Composite
	//Rol: leaf
public class Caballero extends Personaje{
	
	@Override
	public void moverHaciaElPunto(int puntoX, int puntoY) {
		while (this.getPosicionX() != puntoX && this.getPosicionY() != puntoY) {
			this.avanzarHacia(puntoX, puntoY);
			this.hacerZigZag();
		}
	}

	private void hacerZigZag() {
		// TODO Auto-generated method stub
		
	}

	private void avanzarHacia(int puntoX, int puntoY) {
		// TODO Auto-generated method stub
		
	}
}
