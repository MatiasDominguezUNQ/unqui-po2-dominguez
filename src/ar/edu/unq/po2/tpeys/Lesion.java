package ar.edu.unq.po2.tpeys;

import java.util.EnumMap;

public enum Lesion {
	Rojo("Con frecuencia empieza rojo debido a que sangre fresca rica en ox�geno se ha acumulado debajo de la piel.","Mayor"), 
	Gris("Despu�s de aproximadamente 1 a 2 d�as, la sangre empieza a perder ox�geno y cambia de color.","Medio"),
	Amarillo("En aproximadamente 5 a 10 d�as, cambia a color amarillo o verde. Estos colores provienen de los compuestos llamados biliverdina y bilirrubina.","Medio"),
	Miel("Despu�s de 10 a 14 d�as, cambiar� a un tono amarillento-caf� o caf� claro.","Bajo");

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
