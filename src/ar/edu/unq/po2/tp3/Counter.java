package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> list= new ArrayList<Integer>();
	
	public int getEvenOcurrences() {
		
		int even = 0;
		
		for (int num:list) {
			if(num % 2 == 0) even++;
		}
		
		return even;
	}
	
	public int dissassembleNumber() {
		
		int highestEven = 0;
		int highestSum  = 0;
		int n;
		for (int number:list) {
			int numberToSearch = number;
			int sum = 0;
			int multiple = this.getFigures(numberToSearch); 
			int even = multiple * 2;
			while (multiple > 1) {
				n = numberToSearch / multiple;
				n = n * multiple;
				numberToSearch = numberToSearch - n;
				if (n % even == 0) sum++;
				multiple = multiple / 10;
				even = even / 10;
			}
			n = numberToSearch / multiple;
			n = n * multiple;
			numberToSearch = numberToSearch - n;
			if (n % even == 0) sum++;
			if (sum > highestSum) {
				highestEven = number;
				highestSum  = sum;
			}
		}
		return highestEven;
	}
	
	private int getFigures(int number) {
		
		double figures = 0;
		long temp = 1;
		while (temp <= number) {
		    figures++;
		    temp *= 10;
		}
		double multiple = Math.pow(10, figures - 1);
		return (int)Math.round(multiple);
	}

	public void addNumber(int n) {
		
		list.add(n);
	}

	public ArrayList<Integer> getList1() {
		
		return list;
	}

	public void setList1(ArrayList<Integer> list1) {
		
		this.list = list1;
	}
	
}
