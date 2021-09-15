package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> list= new ArrayList<Integer>();
	
	public int getEvenOcurrences() {
		
		int even = 0;
		
		for (int num:list) {
			if(num % 2 == 0) even=+1;
		}
		
		return even;
	}
	
	public void addNumber(int n) {
		
		list.add(n);
	}

	public ArrayList<Integer> getList() {
		
		return list;
	}

	public void setList1(ArrayList<Integer> list) {
		
		this.list = list;
	}
	
}
