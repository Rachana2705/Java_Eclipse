package com.xworkz.woodshop.sell;

import com.xworkz.woodshop.design.Factory;

public class SugarFactory extends Factory{

	public SugarFactory(){
		System.out.println("Invoked no-arg constructor of Sugar Factory");
	}
	
	public void manufacture() {
		System.out.println("invoked manufacture of Suagr Factory");
	}
	
	public String toString() {
		System.out.println("Invoked toString of Sugar Factory");
		return "Car Factory";
	}
	public int hashCode() {
		System.out.println("Invoked hashCode of Sugar Factory");
		return 25;
	}		
	

}
