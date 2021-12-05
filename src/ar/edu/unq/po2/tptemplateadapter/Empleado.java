package ar.edu.unq.po2.tptemplateadapter;

	//Patron Template
	//Rol AbstractClass
public abstract class Empleado {
	
	public abstract int getSueldoBasico();
	
	//Template method
	public int sueldo() {
		
		return this.getSueldoBasico() + bonificaciones() - this.conceptosYAportes();
	}
	
	public abstract int bonificaciones();
	
	//Template method
	private int conceptosYAportes() {
		return (this.getSueldoBasico() * 13 / 100);
	}

}