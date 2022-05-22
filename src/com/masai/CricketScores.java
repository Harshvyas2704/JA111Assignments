package com.masai;

public class CricketScores {

	
	static void findScore(int a, int b, int c, int d, int e) {
		int total;
		total = a*1 + b*2 + c*3 + d*4 + e*6;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		int ones = 4;
		int twos = 6;
		int threes = 4;
		int fours = 7;
		int sixes = 1;
		
		findScore(ones, twos, threes, fours, sixes);
	}
}
