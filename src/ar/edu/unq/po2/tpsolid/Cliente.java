package ar.edu.unq.po2.tpsolid;

public class Cliente {
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;
	private int sueldoNetoMensual;
	private Banco bancoAsociado;
	
	
	
	public Cliente(String nombre, String apellido, int edad, String direccion, int sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public int sueldoNetoAnual() {
		int sueldoAnual;
		sueldoAnual = sueldoNetoMensual * 12;
		return sueldoAnual;
	}
	
	public void enviarSolicitudDeCredito(Solicitud solicitud) {
		bancoAsociado.recibirSolicitud(solicitud);
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public void asociarBanco(Banco banco) {
		this.bancoAsociado = banco;
	}

}
