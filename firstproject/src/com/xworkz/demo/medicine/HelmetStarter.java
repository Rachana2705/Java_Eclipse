package com.xworkz.demo.medicine;

import com.xworkz.demo.vehicle.vehiclebrand.Helmet;

public class HelmetStarter {

	public static void main(String[] args) {
		
		Helmet helmet = new Helmet();
		helmet.add("Vega");
		helmet.displayDetails();
		helmet.add("Steelbird");
		helmet.add(null);
		helmet.add("Studds");
		helmet.add("Royal Enfield");
		helmet.add("SMK");
		helmet.displayDetails();
	}

}
