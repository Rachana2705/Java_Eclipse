package com.xworkz.demo.vehicle.vehiclebrand;

public class Vehicle {

	private String[] container = new String[5];
	private int count = 0;
	public Vehicle() {
		System.out.println("Invoked no-arg constructor");
	}
	public void add(String modelnum) {
		if(modelnum!=null && count<container.length)
		{
		this.container[count] = modelnum;
		count++;
		}
		else
		{
		System.err.println("model num cannot be null or exceeded the limit of number of modelnum");
		}
	}
	public void displayDetails() {
		System.out.println("Invoked Display");
		for(int num=0;num<this.container.length;num++) {
			System.out.println(this.container[num]);
		}
	}
}
