package com.masai;

public class PrimeFactors {

	static void fineFactor(int x) {
		if(x < 2 || x > 100) {
			System.out.println("Invalid Number");
		}
		else {
			
			String str = "";
			for(int i=1; i<x; i++) {
				if(x%i == 0) {
					str = str + i + " ";
				}
			}
			
			System.out.println(str);
			
		}
	}
	
	public static void main(String[] args) {
		
		int x = 101;
		fineFactor(x);
		
	}
}
