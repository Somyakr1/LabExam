package com.UML;

public class SavingAccount extends Account{
	
	private float interestRate = 5;
	
	public SavingAccount() {
		
	}
	
	public SavingAccount(Owner owner, float balance, String number) {
		super(owner, balance, number);
	}
	
	public SavingAccount(SavingAccount acc1) {
		super(acc1);
		this.interestRate = acc1.interestRate;
	}
	
	public float getInterest() {
		return interestRate;
	}
	
	@Override
	public void deposit(int amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Amount of rupees " + amount + " deposited successfully");
		}
	}
	
	@Override
	public void withdraw(int amount) {
		if(amount<=balance) {
			balance -= amount;
			System.out.println("Amount of rupees " + amount+ " withdrawn successfully");
		}
		else {
			System.out.println("Insuffcient Balance");
		}
	}
}
