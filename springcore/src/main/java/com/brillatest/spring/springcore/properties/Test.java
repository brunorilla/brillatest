package com.brillatest.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/brillatest/spring/springcore/properties/properties-config.xml");
		Languages langs = (Languages) context.getBean("languages");
		System.out.println(langs);
		
	}

}
