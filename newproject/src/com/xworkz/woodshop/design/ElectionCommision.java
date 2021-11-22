package com.xworkz.woodshop.design;

import com.xworkz.demo.interfaces.ElectionRule;

public class ElectionCommision {


		private ElectionRule electionRule;
		
		public ElectionCommision(ElectionRule electionRule) {
			this.electionRule = electionRule;
		}
		
		public void provideVoterId()
		{
			System.out.println("invoked voter ID provider");
			if(electionRule!=null)
			{
				int age = electionRule.validAge();
				int wardNo = electionRule.wardNo();
				String address = electionRule.address();
				if(age>18 && wardNo>=1 && wardNo <=100 && address.length()>=10 && address.length()<=50)
				{
					System.out.println("Voter Id can be provided");
				}
				else
				{
					System.err.println("Voter Id cannot be provided");
				}
			}
			else
			{
				System.err.println("reference is not pointing to any memory location");
			}
		}
	

}
