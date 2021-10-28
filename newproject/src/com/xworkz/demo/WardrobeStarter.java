package com.xworkz.demo;

public class WardrobeStarter {

	public static void main(String[] args) {

		Wardrobe wardrobe1 = new Wardrobe();
		
		wardrobe1.add("shirt");
		wardrobe1.add("pant");
		wardrobe1.add("anarkali");
		wardrobe1.add("kurti");
		wardrobe1.add(null);
		wardrobe1.add("frock");
		boolean b1 = wardrobe1.add("saree");
		if(b1)
		{
			System.out.println("add was successful");
		}
		else
		{
			System.out.println("add was not successful");
		}

		wardrobe1.displayDetails();
		
		wardrobe1.update(3,"long frock");
		boolean b2 = wardrobe1.update(7,"lehanga");
		if(b2)
		{
			System.out.println("update was successful");
		}
		else
		{
			System.out.println("update was not successful");
		}

		
		boolean b3 = wardrobe1.delete(5);
		if(b3)
		{
			System.out.println("delete was successful");
		}
		else
		{
			System.out.println("delete was not successful");
		}

		wardrobe1.add("sweater");
		
		wardrobe1.displayDetails();
		
		wardrobe1.add("lehanga");

		boolean b4 = wardrobe1.match("lehanga");
		if(b4)
		{
			System.out.println("match was successful");
		}
		else
		{
			System.out.println("match was not successful");
		}

		wardrobe1.match(null);
		
		wardrobe1.displayDetails();

		
		boolean b5 = wardrobe1.firstletter("f");
		if(b5)
		{
			System.out.println("first letter match was successful");
		}
		else
		{
			System.out.println("first letter match was not successful");
		}

		wardrobe1.firstletter("d");

		wardrobe1.lastletter("i");
		boolean b6 = wardrobe1.lastletter("a");
		if(b6)
		{
			System.out.println("last letter match was successful");
		}
		else
		{
			System.out.println("last letter match was not successful");
		}



	}

}
