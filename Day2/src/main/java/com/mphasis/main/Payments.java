package com.mphasis.main;

public interface Payments {
	public void pay(double amt);

	public default void generateReciept(double amt) {
		System.out.println("reciept generated successfully for the amount :" + amt);
	}

	public static boolean validateAmount(double amt) {
		return amt > 0;
	}
}
