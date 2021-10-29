package com.xworkz.demo.coffee;

import com.xworkz.demo.coffee.dto.VehicleDTO;

public class VehicleStater {

	public static void main(String[] args) {

		VehicleDTO vehicle = new VehicleDTO();
		vehicle.setBrand("ford");
		vehicle.setFuelType("Diesel");
		vehicle.setMilage(20);
		vehicle.setPrice(18f);
		vehicle.setColor("red");

		System.out.println(vehicle.getBrand() + " " + vehicle.getFuelType() + " " + vehicle.getMilage() + " "
				+ vehicle.getPrice() + " " + vehicle.getColor());
		
		VehicleDTO vehicle1 = new VehicleDTO("fluence","petrol",15,20f,"grey");
		
		System.out.println(vehicle1.getBrand() + " " + vehicle1.getFuelType() + " " + vehicle1.getMilage() + " "
				+ vehicle1.getPrice() + " " + vehicle1.getColor());

	}

}
