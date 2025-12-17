package com.demo.EcommerceApp.exceptions;

public class OrderNotFoundException extends RuntimeException{
	public OrderNotFoundException(String msg) {
		super(msg);
	}
}
