package com.xworkz.demo.collect;

public class AssetStarter {

	public static void main(String[] args) {
		
		  Mobile mobile1 = new Mobile("Oppo",10000 , 250, 2, false);
		  Mobile mobile2 = new Mobile("Vivo",12000 , 500, 2, true);
		  Mobile mobile3 = new Mobile("Samsung",15000 , 500, 1, true);
		  Mobile mobile4 = new Mobile("1plus", 12599, 600, 1, false);

		  //mobile1.addAsset(mobile1);
		  //mobile1.displayAsset();
		  
		  Asset hpAsset = new AssetContainer();
		  hpAsset.addAsset(mobile1);
		  hpAsset.addAsset(mobile2);
		  hpAsset.addAsset(mobile3);
		  hpAsset.addAsset(mobile4);
		  hpAsset.displayAsset();

		  //hpAsset.deleteAsset(mobile2);
		 // boolean result=hpAsset.searchAsset(mobile2);
		  //System.out.println(result);
		  
		  hpAsset.updateAsset(mobile3, "Apple");
		  hpAsset.displayAsset();
		  hpAsset.addAsset(mobile2);
		  
		  hpAsset.displayAsset();
		  hpAsset.deleteAsset(mobile2);
		  
		  
		  Book book1 = new Book("Wings of fire", "A.P.J Abdul Kalam", 150, 300);
		  Book book2 = new Book("The Secret","by Rhonda Byrne ", 400, 500);
		  Book book3 = new Book("Desert Solitaire","Edward Abbey", 250, 200);
		  Book book4 = new Book("Gilead","Marilynne Robinson", 650, 750);
		  
		  hpAsset.addAsset(book1);
		  hpAsset.addAsset(book2);
		  hpAsset.addAsset(book3);
		  hpAsset.addAsset(book4);
		  
		  hpAsset.displayAsset();
		  
		  hpAsset.updateAsset(book2, "2666");
		  hpAsset.deleteAsset(book4);
		  hpAsset.displayAsset();

		  
		}


}
