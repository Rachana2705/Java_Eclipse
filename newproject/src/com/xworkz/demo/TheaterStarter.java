package com.xworkz.demo;

public class TheaterStarter {

	public static void main(String[] args) {

		Theater theater = new Theater("Salaga");
		theater.bookTicket("Salaga", TicketType.GANDHI_CLASS, 4);
		theater.bookTicket("Salaga", TicketType.BALCONY, 3);
	}

}
