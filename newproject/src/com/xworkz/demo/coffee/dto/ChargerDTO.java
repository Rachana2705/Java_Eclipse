package com.xworkz.demo.coffee.dto;

public class ChargerDTO {

	private String madein;
	private String companyname;
	private float price;
	private String color = "black";
	private String type = "super charger";
	
	public ChargerDTO() 
	{
	}
	
	public ChargerDTO(String madein, String companyname, float price, String color, String type) {
		super();
		this.madein = madein;
		this.companyname = companyname;
		this.price = price;
		this.color = color;
		this.type = type;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
