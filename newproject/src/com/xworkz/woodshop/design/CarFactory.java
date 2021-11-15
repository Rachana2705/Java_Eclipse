package com.xworkz.woodshop.design;

public class CarFactory extends Factory{
	
	public CarFactory(){
		System.out.println("Invoked no-arg constructor of Car Factory");
	}
	
	public void manufacture() {
		System.out.println("invoked manufacture of Car Factory");
	}
	
	public void shutDown() {
		System.out.println("invoked shutDown of Car Factory");
	}
	public String toString() {
		System.out.println("Invoked toString of Car Factory");
		return "Car Factory";
	}
	public int hashCode() {
		System.out.println("Invoked hashCode of Car Factory");
		return 25;
	}
	
	
}
