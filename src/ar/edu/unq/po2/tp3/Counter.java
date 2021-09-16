package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> list= new ArrayList<Integer>();

	public void addNumber(int n) {
		
		list.add(n);
	}
	
	public int getEvenOcurrences() {
		
		int even = 0;
		
		for (int num:list) {
			if(num % 2 == 0) even++;
		}
		
		return even;
	}
	
	public int disassembleNumbers() {
		
		int highestEven = 0;
		int highestSum  = 0;
		int n;
		for (int number:list) {
			int numberToSearch = number;
			int sum = 0;
			int unit = this.getUnit(numberToSearch); 
			int even = unit * 2;
			while (unit > 1) {
				n = numberToSearch / unit;
				n = n * unit;
				numberToSearch = numberToSearch - n;
				if (n % even == 0) sum++;
				unit = unit / 10;
				even = even / 10;
			}
			n = numberToSearch / unit;
			n = n * unit;
			numberToSearch = numberToSearch - n;
			if (n % even == 0) sum++;
			if (sum > highestSum) {
				highestEven = number;
				highestSum  = sum;
			}
		}
		return highestEven;
	}
	
	private int getUnit(int number) {
		
		double figures = 0;
		long temp = 1;
		while (temp <= number) {
		    figures++;
		    temp *= 10;
		}
		double unit = Math.pow(10, figures - 1);
		return (int)Math.round(unit);
	}

	public int highestMultiple(int x, int y) {
		int a = x, b = y, gcd = 1;  
		for(int i = 1; i <= a && i <= b; ++i) { 
			if(a % i == 0 && b % i == 0) gcd = i;  
		}  
		int n      = (a * b) / gcd; 
		int number = -1;
		for (int i = 0; (n * i) < 1000; i++) {
			number = n * i;
		}
		return number;
	}
}
