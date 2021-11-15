package com.xworkz.woodshop.design;

public class Factory {

	public Factory(){
		System.out.println("Invoked no-arg constructor of Factory");
	}
	
	public void manufacture() {
		System.out.println("Invoked manufacture of Factory");
	}
	
	public void open() {
		System.out.println("Invoked open of Factory");
	}
	
	public void shutDown() {
		System.out.println("Invoked shutDown of Factory");
	}
	
	public String toString() {
		System.out.println("Invoked toString of Factory");
		return "Factory";
	}
	public int hashCode() {
		System.out.println("Invoked hashCode of Factory");
		return 20;
	}
	
}
