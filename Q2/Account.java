package com.UML;

public abstract class Account {
	protected Owner owner;
	protected float balance;
	protected String number;
	
	public Account() {
	
	}
	
	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}
	
	public Account(Account a) {
		this.owner = a.owner;
		this.balance = a.balance;
		this.number = a.number;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
	}
	
	public void withdraw(int amount) {

	}
}
