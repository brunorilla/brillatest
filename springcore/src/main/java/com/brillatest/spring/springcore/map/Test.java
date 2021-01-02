package com.brillatest.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/brillatest/spring/springcore/map/map-config.xml");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
		
	}

}
