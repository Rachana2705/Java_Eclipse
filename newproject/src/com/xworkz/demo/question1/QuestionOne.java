package com.xworkz.demo.question1;

import java.util.ArrayList;
import java.util.Scanner;
public class QuestionOne {

	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<String>();
		
		Scanner var = new Scanner(System.in);
		int count = 1;
		String name;
		String ans1;
		String ans = "y";
		while(ans.equals("y"))
		{
			System.out.println("Enter the username "+count);
			count++;
			name = var.nextLine();
			array.add(name);
			System.out.println("Do you want to Continue?(y/n)");
			ans1 = var.nextLine();
			ans = ans1;
		}
		System.out.println(array);
		
 	}

}
