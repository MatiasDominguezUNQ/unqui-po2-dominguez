package ar.edu.unq.po2.tptemplateadapter;

	//Rol ConcreteClass
public class EmpleadoTemporario extends Empleado{
	private int horas;
	private boolean estaCasado;
	private boolean tieneHijos;
	
	@Override
	public int getSueldoBasico() {
		
		return 1000 + (this.horas * 5);
	}
	@Override
	public int bonificaciones() {
		if(this.estaCasado || this.tieneHijos) {
			return 100;
		}
		else {
			return 0;
		}
	}

}
