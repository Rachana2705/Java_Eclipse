package com.xworkz.demo;

import com.xworkz.demo.exception.CashLessException;

public class MedicalInsuranceStarter {

	public static void main(String[] args) throws CashLessException{

		MedicalInsurance insurance = new MedicalInsurance();
		//insurance.canAvailCashless(null, 40);
		//insurance.canAvailCashless("hasha", 20);
		insurance.canAvailCashless("jeevan", 30);
		
	}
}


