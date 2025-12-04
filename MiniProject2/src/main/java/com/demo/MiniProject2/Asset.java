package com.demo.MiniProject2;

public abstract class Asset implements Comparable<Asset> {
    protected int id;
    protected double taxAmount;
    
    public Asset(int id) {
        this.id = id;
        this.taxAmount = 0.0;
    }
    
    public int getId() {
        return id;
    }
    
    public double getTaxAmount() {
        return taxAmount;
    }
    
    public abstract double calculateTax();
    
    public abstract String getDetails();
    
    public abstract String getType();
    
    @Override
    public int compareTo(Asset other) {
        return Double.compare(this.taxAmount, other.taxAmount);
    }
}
