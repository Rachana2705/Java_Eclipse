package com.xworkz.demo.coffee;

import com.xworkz.demo.coffee.dto.SolarDTO;

public class SolarStarter {

	public static void main(String[] args) {

		SolarDTO solar = new SolarDTO();
		solar.setBrand("Venus");
		solar.setVolt(240);
		solar.setNoOfPlates(20);
		solar.setAmphere(25);

		System.out.println(solar.getBrand().concat(" ").concat(String.valueOf(solar.getVolt())).concat(" ")
				.concat(String.valueOf(solar.getAmphere())).concat(" ").concat(String.valueOf(solar.getNoOfPlates())));
		
		SolarDTO solar1 = new SolarDTO("sunrise",230,40,24);
		
		System.out.println(solar1.getBrand().concat(" ").concat(String.valueOf(solar1.getVolt())).concat(" ")
				.concat(String.valueOf(solar1.getAmphere())).concat(" ").concat(String.valueOf(solar1.getNoOfPlates())));
	
		
	}

}
