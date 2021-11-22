package com.xworkz.demo.interfaces;

public class StudentHostelRules implements HostelRules {

	public boolean admission() {
		System.out.println("Invoked admission from student hostel rules");
		return true;
	}

	public double closeTime() {
		System.out.println("Invoked closeTime from student hostel rules");
		return 19.30;
	}

	public String gender() {
		System.out.println("Invoked gender from student hostel rules");
		return "male";
	}
}
