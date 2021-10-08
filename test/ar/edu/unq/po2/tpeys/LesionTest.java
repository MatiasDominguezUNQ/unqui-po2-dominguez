package ar.edu.unq.po2.tpeys;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LesionTest {
	Lesion lesion;
	
	public void descripciones() {
		System.out.println(Lesion.Rojo.getDescripcion());
	}
	
	@Test
	public void riesgos() {
		System.out.println(Lesion.Rojo.getRiesgo());
	}
	
	@Test
	public void siguienteEtapa() {
		lesion = Lesion.Rojo;
		assertEquals(lesion.getSiguienteEtapa(), Lesion.Gris);
	}
}
