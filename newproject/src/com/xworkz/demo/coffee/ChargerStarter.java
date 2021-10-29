package com.xworkz.demo.coffee;

import com.xworkz.demo.coffee.dto.ChargerDTO;

public class ChargerStarter {

	public static void main(String[] args) {

		ChargerDTO charger = new ChargerDTO();
		charger.setMadein("India");
		charger.setCompanyname("Anker");
		charger.setPrice(500f);
		charger.setColor("white");
		charger.setType("super charger");

		System.out.println(charger.getMadein().concat(" ").concat(charger.getCompanyname()).concat(" ")
				.concat(String.valueOf(charger.getPrice())).concat(" ").concat(charger.getColor()).concat(" ")
				.concat(charger.getType()));

		ChargerDTO charger2 = new ChargerDTO("Japan", "Sony", 800f, "Black", "Superfast");
		
		System.out.println(charger2.getMadein().concat(" ").concat(charger2.getCompanyname()).concat(" ")
				.concat(String.valueOf(charger2.getPrice())).concat(" ").concat(charger2.getColor()).concat(" ")
				.concat(charger2.getType()));
	}

}
