package com.xworkz.demo;

public class Belt extends BeltStarter {

	private float price;
	private String material;
	private String size;
	private String gender;
	
	public Belt() {
		System.out.println("Invoked no-arg constructor of Belt");
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("the parameter passed is not null");
			if(obj instanceof Belt)
			{
				System.out.println("It is an instance of belt");
				Belt b1 = (Belt)obj;
				String mat = b1.getMaterial();
				String size1 = b1.getSize();
				if(this.material.equals(mat) && this.size.equals(size1))
				{
					System.out.println("the material and the size of belt is matching");
					return true;
				}
				else
				{
					System.out.println("the material or the size of belt is not matching");
				}
				
			}
			else
			{
				System.out.println("It is not an instance of belt");
			}
		}
		else
		{
			System.out.println("the parameter passed is null");
	
		}
		return false;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
