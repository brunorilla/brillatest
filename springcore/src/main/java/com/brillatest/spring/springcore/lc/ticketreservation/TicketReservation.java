package com.brillatest.spring.springcore.lc.ticketreservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void init() {
		System.out.println("Inside initialization!");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method! ");
	}

	@Override
	public String toString() {
		return "Ticket Reservation [id=" + id + "]";
	}

}
