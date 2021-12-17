package com.xworkz.demo.collect;

public class Mobile extends AssetContainer {

	public String name;
	public float price;
	public int ram;
	public int noOfSimCards;
	public boolean SDCard;

	public Mobile() {
		super();
	}

	public Mobile(String name, float price, int ram, int noOfSimCards, boolean SDCard) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.noOfSimCards = noOfSimCards;
		this.SDCard = SDCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getNoOfSimCards() {
		return noOfSimCards;
	}

	public void setNoOfSimCards(int noOfSimCards) {
		this.noOfSimCards = noOfSimCards;
	}

	public boolean isSDCard() {
		return SDCard;
	}

	public void setSDCard(boolean sDCard) {
		SDCard = sDCard;
	}

	@Override
	public String toString() {
		return "Mobile [name = " + name + ", Price= " + price + ", RAM = " + ram + ", noSimCards= " + noOfSimCards
				+ ", SDCard= " + SDCard + "]";
	}

}
