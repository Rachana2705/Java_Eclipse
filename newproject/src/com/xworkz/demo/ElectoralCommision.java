package com.xworkz.demo;

import com.xworkz.demo.exception.NotEligibleForVote;

public class ElectoralCommision {

	public void canVote(String name, int age)throws NotEligibleForVote
	{
		if(name!=null && age>18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
			throw new NotEligibleForVote();
		}
		
	}
}

