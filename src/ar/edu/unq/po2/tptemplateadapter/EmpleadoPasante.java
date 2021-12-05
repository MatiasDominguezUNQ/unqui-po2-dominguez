package ar.edu.unq.po2.tptemplateadapter;
	
	//Rol ConcreteClass
public class EmpleadoPasante extends Empleado{
	private int horas;
	
	@Override
	public int getSueldoBasico() {
		
		return this.horas * 40;
	}

	@Override
	public int bonificaciones() {
		
		return 0;
	}

}
