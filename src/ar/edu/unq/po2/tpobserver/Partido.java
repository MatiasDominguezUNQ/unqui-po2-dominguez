package ar.edu.unq.po2.tpobserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partido {
	private String resultado;
	private List<String> contrincantes;
	private String deporte;
	
	public Partido(String resultado, List<String> contrincantes, String deporte) {
		super();
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
	}


	public boolean cumpleCon(List<String> criterio) {
		ArrayList<String> informacionPartido = new ArrayList<String>();
		informacionPartido.addAll(Arrays.asList(this.resultado,this.deporte));
		informacionPartido.addAll(this.contrincantes);
		
		return informacionPartido.stream().anyMatch(criterio::contains);
	}
	
	
}
