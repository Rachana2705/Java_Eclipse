package com.xworkz.demo.coffee;

import com.xworkz.demo.coffee.dto.BlueToothDTO;

public class BlueToothStarter {

	public static void main(String[] args) {

		BlueToothDTO bluetooth = new BlueToothDTO();
		bluetooth.setBrand("iBall");
		bluetooth.setDataRate(20);
		bluetooth.setNumOfDevices(8);
		bluetooth.setRange(5.8f);
		bluetooth.setTransmissionPrower(200);

		System.out.println(bluetooth.getBrand().concat(" ").concat(String.valueOf(bluetooth.getDataRate())).concat(" ")
				.concat(String.valueOf(bluetooth.getNumOfDevices())).concat(" ")
				.concat(String.valueOf(bluetooth.getRange())).concat(" ")
				.concat(String.valueOf(bluetooth.getTransmissionPrower())));

		BlueToothDTO bluetooth1 = new BlueToothDTO("Intex", 30, 3.5f, 2, 250);

		System.out.println(bluetooth1.getBrand().concat(" ").concat(String.valueOf(bluetooth1.getDataRate())).concat(" ")
				.concat(String.valueOf(bluetooth1.getNumOfDevices())).concat(" ")
				.concat(String.valueOf(bluetooth1.getRange())).concat(" ")
				.concat(String.valueOf(bluetooth1.getTransmissionPrower())));
	}

}
