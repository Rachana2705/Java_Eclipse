package com.xworkz.demo.medicine.patient;

public class PatientMedicine {

	private String[] container=new String[5];
	private int count = 0;
	public PatientMedicine()
	{
		System.out.println("Invoked no-arg constructor");
	}
	public void add(String medicineName) {
		if(medicineName!=null && count<container.length) 
		{
			this.container[count] = medicineName;
			count++;
		}
		else
		{
			System.err.println("Medicine name cannot be null or exceeded the limit of number of medicines");
		}
	}
	public void displayDetails() {
		System.out.println("Invoked Display");
		for(int tablet=0;tablet<this.container.length;tablet++) {
			String ref = this.container[tablet];
			System.out.println(ref);
		}
	}
}
