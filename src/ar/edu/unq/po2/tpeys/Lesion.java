package ar.edu.unq.po2.tpeys;

import java.util.EnumMap;

public enum Lesion {
	Rojo("Con frecuencia empieza rojo debido a que sangre fresca rica en oxígeno se ha acumulado debajo de la piel.","Mayor"), 
	Gris("Después de aproximadamente 1 a 2 días, la sangre empieza a perder oxígeno y cambia de color.","Medio"),
	Amarillo("En aproximadamente 5 a 10 días, cambia a color amarillo o verde. Estos colores provienen de los compuestos llamados biliverdina y bilirrubina.","Medio"),
	Miel("Después de 10 a 14 días, cambiará a un tono amarillento-café o café claro.","Bajo");

	private String descripcion;
	private String riesgo;
	
	Lesion(String descripcion, String riesgo) {
			this.descripcion = descripcion;
			this.riesgo      = riesgo;
	}
		
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getRiesgo() {
		return this.riesgo;
	}
	
	public Lesion getSiguienteEtapa() {
		EnumMap<Lesion, Lesion> siguienteEtapa = new EnumMap<Lesion, Lesion>(Lesion.class);
		siguienteEtapa.put(Rojo, Gris);
		siguienteEtapa.put(Gris, Amarillo);
		siguienteEtapa.put(Amarillo, Miel);
		siguienteEtapa.put(Miel, Rojo);
		return siguienteEtapa.get(this);
	}
}
