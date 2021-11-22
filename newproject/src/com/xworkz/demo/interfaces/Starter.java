package com.xworkz.demo.interfaces;

public class Starter {

	public static void main(String[] args) {

		HospitalRules hospitalRules = new PatientHospitalRules();

		String register = hospitalRules.register();
		double payAdvance = hospitalRules.payAdvance();
		boolean validInsurance = hospitalRules.validInsurance();

		System.out.println(register);
		System.out.println(payAdvance);
		System.out.println(validInsurance);

		HostelRules hostelRules = new StudentHostelRules();

		boolean admission = hostelRules.admission();

		double closeTime = hostelRules.closeTime();

		String gender = hostelRules.gender();

		System.out.println(admission);
		System.out.println(closeTime);
		System.out.println(gender);

	}

}
