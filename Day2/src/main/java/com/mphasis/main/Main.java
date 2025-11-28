package com.mphasis.main;

public class Main {
	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
		cc.pay(4500);

		Upi upi = new Upi();
		upi.pay(5000);
		Payments payment = (amt) -> {
			if (Payments.validateAmount(amt)) {
				System.out.println("Amount paid " + amt + " using CreditCard");
			} else {
				System.out.println("Payment Failed !!");
				System.out.println("Invalid Amount !!");
			}
		};
	}
}
