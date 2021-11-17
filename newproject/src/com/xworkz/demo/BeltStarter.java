package com.xworkz.demo;

public class BeltStarter {
	public BeltStarter()
	{
		System.out.println("Invoked no-arg constructor of BeltStarter");
	}
	
	
	public static void main(String[] args) {

		Belt belt = new Belt();
		belt.setPrice(20f);
		belt.setSize("small");
		belt.setMaterial("leadther");
		belt.setGender("female");
		
		Belt belt1 = new Belt();
		belt1.setPrice(20f);
		belt1.setSize("small");
		belt1.setMaterial("leadther");
		belt1.setGender("female");
		
		Belt belt2 = new Belt();
		belt2.setPrice(20f);
		belt2.setSize("medium");
		belt2.setMaterial("leadther");
		belt2.setGender("male");
		
		boolean same1 = belt.equals(belt1);
		System.out.println(same1);
		boolean same2 = belt1.equals(belt2);
		System.out.println(same2);
		boolean same3 = belt1.equals("str");
		System.out.println(same3);



	}

}
