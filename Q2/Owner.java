package com.UML;

public class Owner {
	private String name;
	private Date dateOfBirth;
	private String nic;
	
	public Owner() {
		
	}
	public Owner(String name, Date dob, String nic) {
		this.name = name;
		this.dateOfBirth = dob;
		this.nic = nic;
	}
	public Owner(Owner owner) {
		this.name = owner.name;
		this.dateOfBirth = owner.dateOfBirth;
		this.nic = owner.nic;
	}
	

	public void print() {
		System.out.println("Owner Name: " + name);
        dateOfBirth.print();
        System.out.println("NIC: " + nic);
	}
}
