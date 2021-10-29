package com.xworkz.demo.coffee.dto;

public class VehicleDTO {

	private String brand;
	private String fuelType;
	private int milage;
	private float price;
	private String color;
	
	public VehicleDTO()
	{}

	public VehicleDTO(String brand, String fuelType, int milage, float price, String color) {
		super();
		this.brand = brand;
		this.fuelType = fuelType;
		this.milage = milage;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getMilage() {
		return milage;
	}

	public void setMilage(int milage) {
		this.milage = milage;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
