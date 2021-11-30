package com.xworkz.demo;

import com.xworkz.demo.exception.CashLessException;

public class MedicalInsurance {

	public void canAvailCashless(String name,double totalHoursInHospital) throws CashLessException
	{
		if(name!= null && totalHoursInHospital > 24)
		{
			System.out.println("you can avail cash less payment");
		}
		else
		{
			System.out.println("you cannot avail cash less payment");
			throw new CashLessException();
		}
	}
}
