package com.UML;

public class CurrentAccount extends Account{
	private float minBalance = 2000;
	
	public CurrentAccount() {
		
	}
	
	public CurrentAccount(Owner owner, float balance, String number) {
		super(owner, balance, number);
	}
	
	public CurrentAccount(CurrentAccount acc) {
		super(acc);
		this.minBalance = acc.minBalance;
	}
	
	@Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
			System.out.println("Amount of rupees " + amount + " deposited successfully");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
			System.out.println("Amount of rupees " + amount+ " withdrawn successfully");
        } else {
            System.out.println("Minimum balance must be maintained");
        }
    }
	
	public float getCharges() {
		return minBalance;
	}
}
