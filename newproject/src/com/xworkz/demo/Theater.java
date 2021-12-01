package com.xworkz.demo;

import com.xworkz.demo.exception.HouseFullRunTimeException;

public class Theater {

	private final int gandhiClassTicket = 5;
	private final int middleClassTicket = 5;
	private final int balconyTicket = 2;
	private String movieName;

	public Theater(String movieName) {
		this.movieName = movieName;
	}

	public boolean bookTicket(String movieName, TicketType ticketType, int totalTickets) {
		if (movieName.equals(movieName)) {
			if (TicketType.GANDHI_CLASS.equals(ticketType) && totalTickets <= this.gandhiClassTicket) {
				System.out.println(this.movieName + " is booked with ".concat(ticketType.toString()));
				return true;
			} else if (TicketType.MIDDLE_CLASS.equals(ticketType) && totalTickets <= this.middleClassTicket) {
				System.out.println(this.movieName + " is booked with ".concat(ticketType.toString()));
				return true;
			} else if (TicketType.BALCONY.equals(ticketType) && totalTickets <= this.balconyTicket) {
				System.out.println(this.movieName + " is booked with ".concat(ticketType.toString()));
				return true;
			} else {
				System.err.println("Cannot book ticket for " + movieName + " ticket is full for " + ticketType.toString());
				if (TicketType.GANDHI_CLASS.equals(ticketType) || TicketType.MIDDLE_CLASS.equals(ticketType)) {
					throw new HouseFullRunTimeException(ticketType.toString() + " can have maximum 5 tickets only");
				} else if (TicketType.BALCONY.equals(ticketType)) {
					throw new HouseFullRunTimeException(ticketType.toString() + " can have maximum 2 tickets only");
				}
			}
		}
		return false;
	}

}
