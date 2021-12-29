package com.xworkz.demo.question2;

public class Bank {

		private String name;
		private double deposite;
		private double costPerDay;
		
		public Bank() {
			super();
		}

		public Bank(String name, double deposite, double costPerDay) {
			super();
			this.name = name;
			this.deposite = deposite;
			this.costPerDay = costPerDay;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getDeposite() {
			return deposite;
		}

		public void setDeposite(double deposite) {
			this.deposite = deposite;
		}

		public double getCostPerDay() {
			return costPerDay;
		}

		public void setCostPerDay(double costPerDay) {
			this.costPerDay = costPerDay;
		}

		@Override
		public String toString() {
			return name + "   " + deposite + "      " + costPerDay+"\n";
		}

		

}
