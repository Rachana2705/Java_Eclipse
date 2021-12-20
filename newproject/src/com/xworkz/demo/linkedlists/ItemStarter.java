package com.xworkz.demo.linkedlists;

public class ItemStarter {

	public static void main(String[] args) {
		
		Item item1 = new ItemContainer();
		
		Movie movie1 = new Movie("Rajakumara", 2020, 2.5, "Kannada");
		Movie movie2 = new Movie("Gaja", 2016, 1.8, "Kannada");
		Movie movie3 = new Movie("Bond", 2005, 3, "English");
		Movie movie4 = new Movie("Up", 2018, 2, "English");
		Movie movie5 = new Movie("Lucifier", 2020, 4, "Telugu");

		item1.addItem(movie1);
		item1.addItem(movie2);
		item1.addItem(movie3);
		item1.addItem(movie4);
		item1.addItem(movie5);
		
		item1.displayItem();
		
		Movie movie6 = new Movie("Addhuri", 2012, 1.25, "Kannada");
		Movie movie7 = new Movie("Frozen", 2012, 3.45, "English");
		Movie movie8 = new Movie("Drusyam", 2021, 5, "Telugu");
		Movie movie9 = new Movie("Rustum", 2019, 4, "Kannada");
		Movie movie10 = new Movie("OM", 2004, 3.75, "Kannada");
		
		item1.addFirstItem(movie6);
		
		item1.getFirstItem();
		
		item1.addLastItem(movie8);
		
		item1.deleteFirstItem();
		
		item1.displayItem();
		
		item1.addLastItem(movie10);
		
		item1.addLastItem(movie7);
		
		item1.deleteLastItem();
		
		item1.addFirstItem(movie9);
		
		item1.getFirstItem();
		
		item1.getLastItem();
		
		item1.displayItem();


	}

}
