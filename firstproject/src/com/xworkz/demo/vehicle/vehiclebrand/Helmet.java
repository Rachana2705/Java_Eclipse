package com.xworkz.demo.vehicle.vehiclebrand;

public class Helmet {
	private String[] container = new String[5];
	private int count = 0;
	public Helmet() {
		System.out.println("Invoked no-arg constructor");
	}
	public void add(String brand) {
		if(brand!=null && count<container.length)
		{
		this.container[count] = brand;
		count++;
		}
		else
		{
		System.err.println("brand name cannot be null or exceeded the limit of number of brand names");
		}
	}
	public void displayDetails() {
		System.out.println("Invoked Display");
		for(int num=0;num<this.container.length;num++) {
			System.out.println(this.container[num]);
		}
}
}
