package com.xworkz.woodshop.design;

import com.xworkz.demo.interfaces.ElectionRule;
import com.xworkz.demo.interfaces.RachanaElectionRule;

public class ElectionStarter {

	public static void main(String[] args) {

		ElectionRule electionRule = new RachanaElectionRule();
		ElectionCommision commision = new ElectionCommision(electionRule);
		
		commision.provideVoterId();
		
	}

}
