package com.brillatest.spring.springcore.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting id...");
		this.id = id;
	}

	public void salute() {
		System.out.println("Hi!");
	}

	public void goodbye() {
		System.out.println("Bye! ");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
