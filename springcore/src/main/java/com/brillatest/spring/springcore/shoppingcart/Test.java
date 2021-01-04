package com.brillatest.spring.springcore.shoppingcart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/brillatest/spring/springcore/shoppingcart/shoppingcart-config.xml");
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(cart);
		
	}

}
