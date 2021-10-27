package com.xworkz.demo.monitor.monitorbrand;

public class Monitor {

	private String[] container=new String[5];
	private int count = 0;
	public Monitor()
	{
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
			System.err.println("Brand name cannot be null or exceeded the limit of number of brand");
		}
	}
	public void displayDetails() {
		System.out.println("Invoked Display");
		for(int name=0;name<this.container.length;name++) {
			String ref = this.container[name];
			System.out.println(ref);
		}
	}
}
