package ar.edu.unq.po2.tptests;

import java.util.Arrays;
import java.util.List;


public class PokerStatus {
		
	public boolean verificar(String a, String b, String c, String d, String e) {
		int cantidadIguales;
		String cartaAChequear;
		List<String> cartas = Arrays.asList(a, b , c, d ,e);
		
		for (int i = 0; i < cartas.size(); i++) {
            cartas.set(i, cartas.get(i).substring(0, cartas.get(i).length() - 1));
        }
		
		cartaAChequear = cartas.get(0);
		cantidadIguales = 0;
		for (int i = 0 ; i<cartas.size() ; i++) {
			if (cartas.get(i).equals(cartaAChequear)) cantidadIguales++;
		}
		
		if (cantidadIguales < 4) {
			cartaAChequear = cartas.get(1);
			cantidadIguales = 0;
			for (int i = 0 ; i<cartas.size() ; i++) {
				if (cartas.get(i).equals(cartaAChequear)) cantidadIguales++;
			}
		}
		
		return (cantidadIguales == 4);
	}
}
