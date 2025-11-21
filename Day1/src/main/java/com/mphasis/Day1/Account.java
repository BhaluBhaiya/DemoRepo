package com.mphasis.Day1;

public class Account {
	private double accNum;
	private String accHolderName;
	private String bankName;
	private String branchName;
	private String iFSC;
	private int pin;
	
	public Account() {
		super();
	}

	public Account(double accNum, String accHolderName, String bankName, String branchName, String iFSC) {
		super();
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.bankName = bankName;
		this.branchName = branchName;
		this.iFSC = iFSC;
		this.pin = generatePin();
	}

	private int generatePin() {
		return (int)Math.round(Math.random()*10000);
	}
	
	public int getPin(){
		return this.pin;
	}

	public double getAccNum() {
		return accNum;
	}

	public void setAccNum(double accNum) {
		this.accNum = accNum;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getiFSC() {
		return iFSC;
	}

	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accHolderName=" + accHolderName + ", bankName=" + bankName
				+ ", branchName=" + branchName + ", iFSC=" + iFSC + ", pin=" + pin + "]";
	}
	
	public void withdraw(double amount) {
		System.out.println("Money withdrawn seccessfully");
	}
	
	public void deposit(double amount) {
		System.out.println("Money Deposited seccessfully");
		
	}
}

