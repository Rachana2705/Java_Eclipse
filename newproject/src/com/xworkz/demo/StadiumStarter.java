package com.xworkz.demo;

public class StadiumStarter {

	public static void main(String[] args) {

		Stadium stadium1 = new Stadium();
		stadium1.setCity("KR");
		stadium1.setCity("Bangalore");
		stadium1.setAreaInMeters(1000);
		
		Stadium stadium2 = new Stadium();
		stadium2.setCity("KR");
		stadium2.setCity("Bangalore");
		stadium2.setAreaInMeters(1000);
		
		Stadium stadium3 = new Stadium();
		stadium3.setCity("ARF");
		stadium3.setCity("Mysore");
		stadium3.setAreaInMeters(1500);
		
		boolean b1 = stadium1.equals(stadium2);
		System.out.println(b1);
		boolean b2 = stadium1.equals(stadium3);
		System.out.println(b2);
		boolean b3 = stadium1.equals(827);
		System.out.println(b3);

		
	}

}
