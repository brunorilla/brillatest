package com.brillatest.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/brillatest/spring/springcore/dependencycheck/config.xml");
		Prescription pn = (Prescription) context.getBean("prescription");
		System.out.println(pn.toString());

	}

}
