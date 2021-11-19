package com.xworkz.demo.inheritance;

import com.xworkz.demo.inheritance.child.HdfcBank;

public class BankStarter {

	public static void main(String[] args) {

		IciciBank icici = new IciciBank("ICICI Bank","icici1234");
		icici.openAccount();
		icici.provideLoan();
		icici.closeAccount();
		
		HdfcBank hdfc = new HdfcBank("HDFC Bank","hdfc5678");
		hdfc.openAccount();
		hdfc.provideLoan();
		hdfc.closeAccount();
		
		Bank icici1 = new IciciBank("ICICI Bank","icici1122");
		icici1.openAccount();
		icici1.provideLoan();
		icici1.closeAccount();
		
		Bank hdfc1 = new HdfcBank("HDFC Bank","hdfc5566");
		hdfc1.openAccount();
		hdfc1.provideLoan();
		hdfc1.closeAccount();
		
	}

}
