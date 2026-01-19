package com.Q1;

public class Merchandise implements Comparable<Merchandise>{
	private String itemCode;
	private int quantity;
	protected float unitPrice;
	
	public Merchandise(String itemCode, int quantity, float unitPrice) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
	
	@Override
    public int compareTo(Merchandise m) {
        return this.itemCode.compareTo(m.itemCode);
    }

    @Override
    public String toString() {
        return itemCode + " " + quantity + " " + unitPrice;
    }
	
}
