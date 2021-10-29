package com.xworkz.demo.coffee.dto;

public class SolarDTO {
 private String brand;
 private int volt;
 private int amphere;
 private int noOfPlates;
 
 public SolarDTO() {}

public SolarDTO(String brand, int volt, int amphere, int noOfPlates) {
	super();
	this.brand = brand;
	this.volt = volt;
	this.amphere = amphere;
	this.noOfPlates = noOfPlates;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getVolt() {
	return volt;
}

public void setVolt(int volt) {
	this.volt = volt;
}

public int getAmphere() {
	return amphere;
}

public void setAmphere(int amphere) {
	this.amphere = amphere;
}

public int getNoOfPlates() {
	return noOfPlates;
}

public void setNoOfPlates(int noOfPlates) {
	this.noOfPlates = noOfPlates;
}
 
 
}
