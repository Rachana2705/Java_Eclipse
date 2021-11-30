package com.xworkz.demo;

import com.xworkz.demo.exception.NotaPrimeMemberException;

public class AmazonPrime {

	public void freeDelivery(boolean primeMemnber,String country)throws NotaPrimeMemberException
	{
		if(primeMemnber == true && country!=null && country == "India")
		{
			System.out.println("You can get free delivery");
		}
		else
		{
			System.out.println("you cannot get free delivery");
			throw new NotaPrimeMemberException();
		}
	}
}
