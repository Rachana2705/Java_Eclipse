package com.xworkz.demo;

import com.xworkz.demo.exception.NotaPrimeMemberException;

public class AmazonPrimeStarter {

	public static void main(String[] args) throws NotaPrimeMemberException {

		AmazonPrime prime = new AmazonPrime();
		//prime.freeDelivery(false, null);
		//prime.freeDelivery(true, null);
		//prime.freeDelivery(true, "China");
		prime.freeDelivery(true, "India");
	}

}
