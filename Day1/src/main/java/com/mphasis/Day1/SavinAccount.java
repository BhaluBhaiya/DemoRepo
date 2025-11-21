package com.mphasis.Day1;

public class SavinAccount extends Account{
	private double balance;

	public SavinAccount(double accNum, String accHolderName, String bankName, String branchName, String iFSC,
			double balance) {
		super(accNum, accHolderName, bankName, branchName, iFSC);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavinAccount [Account Number=" + getAccNum() +", Account Holder Name ="
				+ getAccHolderName() +"balance=" + balance +  ", Bank Name =" + getBankName() + ", Branch Name " + getBranchName()
				+ ", IFSC Code =" + getiFSC() + "]";
	}
	@Override
	public void withdraw(double amount) {
		if(amount < this.balance) {
			this.balance = this.balance - amount;
			System.out.println("Amount Withdrawn Succesfully");
		}
		else 
			System.err.println("Insufficient Funds");
	}
	
	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("Amount Deposited Successfully");
	}
	
	public double checkBalance(){
		return this.getBalance();
	}
	
	
	
}
