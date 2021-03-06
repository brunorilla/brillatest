package com.brillatest.spring.springcore.lc.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/brillatest/spring/springcore/lc/annotations/config.xml");
		Patient pt = (Patient) context.getBean("patient");
		System.out.println(pt.toString());
		context.registerShutdownHook();
		
		
	}

}
