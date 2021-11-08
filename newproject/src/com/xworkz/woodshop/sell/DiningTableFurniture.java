package com.xworkz.woodshop.sell;

import com.xworkz.woodshop.design.Furniture;

public class DiningTableFurniture extends Furniture {
	DiningTableFurniture() {
		super.breadth = 30;
		System.out.println("breadth of dining table " + breadth);
	}

	public static void main(String[] args) {

		new DiningTableFurniture();

		Furniture diningTable = new Furniture();
		System.out.println(diningTable.woodMaterial);
		// System.out.println(diningTable.price);
		// System.out.println(diningTable.length);
		// System.out.println(diningTable.breadth);

		diningTable.setLength(30);
		System.out.println(diningTable.getLength());

		Furniture diningTable1 = new Furniture("Rose wood", 75f, 80, 40);
		System.out.println(diningTable1.woodMaterial);
		// System.out.println(diningTable1.price);
		// System.out.println(diningTable1.breadth);

	}
}
