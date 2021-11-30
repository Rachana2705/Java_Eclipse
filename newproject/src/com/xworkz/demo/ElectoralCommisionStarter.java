package com.xworkz.demo;

import com.xworkz.demo.exception.NotEligibleForVote;

public class ElectoralCommisionStarter {

	public static void main(String[] args) throws NotEligibleForVote {

		ElectoralCommision electoral = new ElectoralCommision();
		//The method canVote(String, int) from the type ElectoralCommision 
		//refers to the missing type NotEligibleForVote
		//electoral.canVote("Pooja", 19);
		//electoral.canVote("Mohan", 16);
		//electoral.canVote(null, 20);
		electoral.canVote("Tarun", 25);
	}

}
