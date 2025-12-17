package com.demo.EcommerceApp.exceptions;

public class ItemNotFoundException extends RuntimeException {
	public ItemNotFoundException(String msg) {
		super(msg);
	}
}
