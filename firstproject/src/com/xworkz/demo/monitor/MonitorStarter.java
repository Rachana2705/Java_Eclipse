package com.xworkz.demo.monitor;

import com.xworkz.demo.monitor.monitorbrand.Monitor;

public class MonitorStarter {

	public static void main(String[] args) {

		Monitor monitor =new Monitor();
		
		monitor.add("Punta");
		monitor.displayDetails();
		monitor.add("Acer");
		monitor.add("Adcom");
		monitor.add("HP");
		monitor.add("Lenovo");
		monitor.displayDetails();
		monitor.add("Dell");
	}

}
