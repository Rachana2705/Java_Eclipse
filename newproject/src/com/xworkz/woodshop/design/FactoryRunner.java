package com.xworkz.woodshop.design;

import com.xworkz.woodshop.sell.SugarFactory;

public class FactoryRunner {

	public static void main(String[] args) {

		CarFactory car = new CarFactory();
		car.manufacture();
		car.open();
		car.shutDown();
		car.toString();
		car.hashCode();
		
		SugarFactory sugar = new SugarFactory();
		sugar.manufacture();
		sugar.open();
		sugar.shutDown();
		sugar.toString();
		sugar.hashCode();
		
		Factory car1 = new CarFactory();
		car.manufacture();
		car.open();
		car.shutDown();
		car.toString();
		car.hashCode();
		
		Factory sugar1 = new SugarFactory();
		sugar.manufacture();
		sugar.open();
		sugar.shutDown();
		sugar.toString();
		sugar.hashCode();
		

	}

}
