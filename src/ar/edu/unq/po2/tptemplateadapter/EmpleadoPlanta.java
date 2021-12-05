package ar.edu.unq.po2.tptemplateadapter;

	//Rol ConcreteClass
public class EmpleadoPlanta extends Empleado {
	private int hijos;

	@Override
	public int getSueldoBasico() {
		
		return 3000;
	}

	@Override
	public int bonificaciones() {
		
		return this.hijos * 150;
	}

}
