package com.brillatest.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting id...");
		this.id = id;
	}

	@PostConstruct
	public void salute() {
		System.out.println("Hi!");
	}

	@PreDestroy
	public void goodbye() {
		System.out.println("Bye! ");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
