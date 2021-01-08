package com.brillatest.spring.springcore.lc.ticketreservation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/brillatest/spring/springcore/lc/ticketreservation/config.xml");
		TicketReservation tr = (TicketReservation) context.getBean("ticketreservation");
		System.out.println(tr.toString());
		context.registerShutdownHook();
		
		
	}

}
