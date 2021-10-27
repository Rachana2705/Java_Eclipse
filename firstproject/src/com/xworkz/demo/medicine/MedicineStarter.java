package com.xworkz.demo.medicine;

import com.xworkz.demo.medicine.patient.PatientMedicine;

public class MedicineStarter {

	public static void main(String[] args) {
		PatientMedicine patient =new PatientMedicine();
		
		patient.add("Paracetamol");
		patient.displayDetails();
		patient.add("Carboplatin");
		patient.add("Diclofenac");
		patient.add("Erythromycin");
		patient.add("Lorazepam");
		patient.displayDetails();
	}

}
