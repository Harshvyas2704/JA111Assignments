package com.masai;


public class SwitchCase {
	
	static void city(String cityName) {
		 
		 
		 switch(cityName) {
		 case "Mumbai":
			 System.out.println("Financial city");
			 break;
		 case "Kolkata":
			 System.out.println("City of Joy");
			 break;
		 case "Delhi":
			 System.out.println("Capital of the country");
			 break;
		 case "Bangalore":
			 System.out.println("Cyber City");
			 break;
		 default: 
			 System.out.println("May be Other Indian City");
			 break;
		 }
	 }
	
	public static void main(String[] args) {
		
		String x = "Delhi";
		city(x);
		
	}
}
