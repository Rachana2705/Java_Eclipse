package com.xworkz.woodshop.design;

public class ComputerTableFurniture extends Furniture {

	ComputerTableFurniture() {
		super.breadth = 20;
		System.out.println("breadth of computer table " + breadth);
	}

	public static void main(String[] args) {

		new ComputerTableFurniture();
		Furniture computerTable = new Furniture();
		System.out.println(computerTable.woodMaterial);
		System.out.println(computerTable.price);
		// System.out.println(computerTable.length);
		System.out.println(computerTable.breadth);

		computerTable.setLength(20);
		System.out.println(computerTable.getLength());

		Furniture computerTable1 = new Furniture("Oak wood", 50f, 40, 25);
		System.out.println(computerTable1.woodMaterial);
		System.out.println(computerTable1.price);
		System.out.println(computerTable1.breadth);
	}
}
