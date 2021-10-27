package com.xworkz.demo.vehicle;

import com.xworkz.demo.vehicle.vehiclebrand.Vehicle;
public class VehicleStarter {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.add("156hjsla");
		vehicle.displayDetails();
		vehicle.add("623hjh");
		vehicle.add("81jnkj");
		vehicle.add("911bjsb");
		vehicle.add("022ijsj");
		vehicle.displayDetails();
	}

}
