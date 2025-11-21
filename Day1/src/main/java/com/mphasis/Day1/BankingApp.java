package com.mphasis.Day1;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavinAccount sa = new SavinAccount(1650154, "Bhanu Pratap", "HSBC Bank", "Block J Dabri", "HSBC0013BJD", 500000);
		System.out.println(sa);
		sa.withdraw(1000000);
		System.out.println(sa.checkBalance());

	}

}
