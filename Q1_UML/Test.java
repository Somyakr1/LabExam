package com.UML;

public class Test {
	
	public static void main(String[] args) {
		
		Date date = new Date(19, 8, 2003);
		Owner owner = new Owner("Somya", date, "nicNo");
		
		System.out.println("Saving Account");
		SavingAccount acc1 = new SavingAccount(owner, 10000, "1234567892");
		acc1.deposit(1000);
		acc1.withdraw(2000);
		System.out.println("Balance left after transactions: " + acc1.getBalance());
		
		System.out.println("\nCurrent Account");
		SavingAccount acc2 = new SavingAccount(owner, 10000, "1234567892");
		acc2.deposit(1000);
		acc2.withdraw(2000);
		System.out.println("Balance left after transactions: " + acc2.getBalance());
	}
	
}
