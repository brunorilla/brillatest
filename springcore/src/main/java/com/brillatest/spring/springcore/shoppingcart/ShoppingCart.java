package com.brillatest.spring.springcore.shoppingcart;

import java.util.List;

public class ShoppingCart {
	private List<Item> item;

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + item + "]";
	}
	
	
}
