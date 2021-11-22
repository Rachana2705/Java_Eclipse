package com.xworkz.demo.interfaces;

public class RachanaElectionRule implements ElectionRule{

	@Override
	public int validAge() {
		System.out.println("invoked valid age method");
		return 23;
	}

	@Override
	public int wardNo() {
		System.out.println("invoked ward no. method");
		return 15;
	}

	@Override
	public String address() {
		System.out.println("invoked address method");
		return "Padmanabhanagar Bengaluru";
	}

}
