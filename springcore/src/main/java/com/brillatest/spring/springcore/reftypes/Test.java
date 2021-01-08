package com.brillatest.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/brillatest/spring/springcore/reftypes/reftype-config.xml");
		Student stdt = (Student) context.getBean("student");
		System.out.println(stdt);
		
	}

}
