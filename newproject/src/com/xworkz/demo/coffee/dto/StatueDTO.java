package com.xworkz.demo.coffee.dto;

public class StatueDTO {
 
	private String name;
	private String material;
	private float height;
	private float width;
	private String location;
	
	public StatueDTO() {}

	public StatueDTO(String name, String material, float height, float width, String location) {
		super();
		this.name = name;
		this.material = material;
		this.height = height;
		this.width = width;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
