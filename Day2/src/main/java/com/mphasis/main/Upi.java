package com.mphasis.main;

public class Upi implements Payments {
	@Override
	public void pay(double amt) {
		if (Payments.validateAmount(amt)) {
			System.out.println("Amount paid " + amt + " using UPI");
			generateReciept(amt);
		} else {
			System.out.println("Payment Failed !!");
			System.out.println("Invalid Amount !!");
		}
	}
}
