package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> list1= new ArrayList<Integer>();
	
	public int getEvenOcurrences() {
		
		int even = 0;
		
		for (int num:list1) {
			if(num % 2 == 0) even=+1;
		}
		
		return even;
	}
	
	public void addNumber(int n) {
		
		list1.add(n);
	}

	public ArrayList<Integer> getList1() {
		
		return list1;
	}

	public void setList1(ArrayList<Integer> list1) {
		
		this.list1 = list1;
	}
	
}
