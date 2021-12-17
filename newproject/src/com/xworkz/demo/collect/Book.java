package com.xworkz.demo.collect;

public class Book {

	private String name;
	private String authorName;
	private float price;
	private int noOfPages;
	
	public Book() {
		super();
	}

	public Book(String name, String authorName, float price, int noOfPages) {
		super();
		this.name = name;
		this.authorName = authorName;
		this.price = price;
		this.noOfPages = noOfPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", authorName=" + authorName + ", price=" + price + ", noOfPages=" + noOfPages
				+ "]";
	}
	
	
	
}
