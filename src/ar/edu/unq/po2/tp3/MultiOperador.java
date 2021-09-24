package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class MultiOperador {
	private ArrayList<Integer> enteros= new ArrayList<Integer>();
	
	public void addNumber(int n) {
		
		enteros.add(n);
	}
	
	public int sumarEnteros() {
		int resultado = 0;
		for (int entero : enteros) {
			resultado = resultado + entero;
		}
		return resultado;
	}
	
	public int restarEnteros() {
		int resultado = enteros.get(0);
		for (int i=1; i< enteros.size(); i++) {
			resultado = resultado - enteros.get(i);
		}
		return resultado;
	}
	
	public int multiplicarEnteros() {
		int resultado = enteros.get(0);
		for (int i=1; i< enteros.size(); i++) {
			resultado = resultado * enteros.get(i);
		}
		return resultado;
	}

}
