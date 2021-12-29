package com.xworkz.demo.question2;

import java.util.ArrayList;
import java.util.Scanner;
public class BankStarter {

	public static void main(String[] args) {

		String name,ans1;
		double deposite;
		double costPerDay;
		Bank bank = new Bank();
		int c = 1;
		String ans = "y";
		
		Scanner var = new Scanner(System.in);
		
		ArrayList<Bank> bank1 = new ArrayList<Bank>();
		while(ans.equals("y")) {
		System.out.println("Enter the details of item Type "+c);
		c++;
		System.out.println("Name:");
		name = var.nextLine();
		System.out.println("Deposite");
		deposite = var.nextDouble();
		System.out.println("Cost per Day");
		costPerDay = var.nextDouble();
		var.nextLine();
		bank1.add(new Bank(name, deposite, costPerDay));
		System.out.println("Do you want to continue(y/n)");
		System.out.println();
		ans1 = var.nextLine();
		ans = ans1;
		}	
		System.out.println("Name    Deposit     CostPerDay");
		
		for(Object obj : bank1)
		{
			//System.out.println("%-20s%-20d%-20d","Name","Deposite","Costperday");
			System.out.printf(obj+"      ");
		}
		
		
	}
}
