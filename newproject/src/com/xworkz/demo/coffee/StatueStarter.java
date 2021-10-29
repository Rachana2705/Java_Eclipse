package com.xworkz.demo.coffee;

import com.xworkz.demo.coffee.dto.StatueDTO;

public class StatueStarter {

	public static void main(String[] args) {

		StatueDTO statue = new StatueDTO();
		statue.setName("Statue Of Liberty");
		statue.setLocation("New York");
		statue.setHeight(93f);
		statue.setWidth(30f);
		statue.setMaterial("copper");

		System.out.println(statue.getName().concat(" ").concat(statue.getLocation()).concat(" ")
				.concat(String.valueOf(statue.getHeight())).concat(String.valueOf(statue.getWidth())).concat(" ")
				.concat(statue.getMaterial()));
		
		StatueDTO statue1 = new StatueDTO("The Thinker","bronze",30,20,"Rodin Museum");
		
		System.out.println(statue1.getName().concat(" ").concat(statue1.getLocation()).concat(" ")
				.concat(String.valueOf(statue1.getHeight())).concat(String.valueOf(statue1.getWidth())).concat(" ")
				.concat(statue1.getMaterial()));	
		
	}

}
