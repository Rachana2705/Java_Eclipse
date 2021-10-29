package com.xworkz.demo.coffee.dto;

public class BlueToothDTO {

	private String brand;
	private int dataRate;
	private float range;
	private int numOfDevices;
	private int transmissionPrower;
	
	public BlueToothDTO() {}

	public BlueToothDTO(String brand, int dataRate, float range, int numOfDevices, int transmissionPrower) {
		this.brand = brand;
		this.dataRate = dataRate;
		this.range = range;
		this.numOfDevices = numOfDevices;
		this.transmissionPrower = transmissionPrower;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDataRate() {
		return dataRate;
	}

	public void setDataRate(int dataRate) {
		this.dataRate = dataRate;
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public int getNumOfDevices() {
		return numOfDevices;
	}

	public void setNumOfDevices(int numOfDevices) {
		this.numOfDevices = numOfDevices;
	}

	public int getTransmissionPrower() {
		return transmissionPrower;
	}

	public void setTransmissionPrower(int transmissionPrower) {
		this.transmissionPrower = transmissionPrower;
	}
	
	
	
	
}
