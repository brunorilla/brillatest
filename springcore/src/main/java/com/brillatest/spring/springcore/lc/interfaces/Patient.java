package com.brillatest.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean , DisposableBean {

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
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside after properties set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
		
	}

}
