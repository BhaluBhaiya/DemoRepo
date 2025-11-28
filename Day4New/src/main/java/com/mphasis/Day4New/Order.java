package com.mphasis.Day4New;

import java.util.Arrays;

public class Order<T> {
	private T item;

	public Order(T item) {
		this.item = item;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		if(item instanceof Object[])
			return  "Order [item=" + Arrays.toString((Object[])item) + "]";
		else 
			return "Order [Item = "+ item +"]";
	}
	
	
}
