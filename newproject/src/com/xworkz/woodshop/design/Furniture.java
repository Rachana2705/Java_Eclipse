package com.xworkz.woodshop.design;

public class Furniture {

	public String woodMaterial;
	float price;
	private int length;
	protected int breadth;

	public Furniture() {
		super();
		System.out.println("Invoked no-arg constructor");
	}

	public Furniture(String woodMaterial, float price, int length, int breadth) {
		this.woodMaterial = woodMaterial;
		this.price = price;
		this.setLength(length);
		this.breadth = breadth;
		System.out.println("Invoked String, float, int, int constructor");
		System.out.println("length is " + this.length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
