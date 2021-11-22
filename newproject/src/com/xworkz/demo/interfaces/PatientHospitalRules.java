package com.xworkz.demo.interfaces;

public class PatientHospitalRules implements HospitalRules {

	public String register() {
		System.out.println("invoked register from patient hospital rules");
		return "online";
	}

	public double payAdvance() {
		System.out.println("invoked payAdvance from patient hospital rules");
		return 20;
	}

	public boolean validInsurance() {
		System.out.println("invoked validInsurance from patient hospital rules");
		return true;
	}
}
