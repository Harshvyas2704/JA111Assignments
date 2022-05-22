package com.masai;

public class SumOfNaturalNumber {

	static void findSum(int x) {
		
		if(x < 0) {
			System.out.println("Enter a valid number");
		}
		else {
			int ans = (x*(x+1)) / 2;
			System.out.println(ans);
			
		}
	}
	
	public static void main(String[] args) {
		
		int x = 10;
		findSum(x);
	}
}
