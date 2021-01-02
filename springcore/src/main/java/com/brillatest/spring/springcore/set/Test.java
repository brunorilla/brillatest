package com.brillatest.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/brillatest/spring/springcore/set/set-config.xml");
		CarDealer cd = (CarDealer) context.getBean("cardealer");
		System.out.println(cd.getName());
		System.out.println(cd.getModels());
	}

}
