package com.demo.MiniProject2;

import java.text.DecimalFormat;

public class Property extends Asset {
    private double baseValue;
    private double builtUpArea;
    private int ageOfConstruction;
    private boolean isInMainCity;
    
    private static final DecimalFormat df = new DecimalFormat("#0.00");
    
    public Property(int id, double baseValue, double builtUpArea, int ageOfConstruction, boolean isInMainCity) {
        super(id);
        this.baseValue = baseValue;
        this.builtUpArea = builtUpArea;
        this.ageOfConstruction = ageOfConstruction;
        this.isInMainCity = isInMainCity;
        this.taxAmount = calculateTax();
    }
    
    
    @Override
    public double calculateTax() {
        double tax;  
        
        if (isInMainCity) {
            tax = (builtUpArea * ageOfConstruction * baseValue) + (0.5 * builtUpArea*baseValue);
        } else {
            tax = builtUpArea * ageOfConstruction * baseValue;
        }
        
        return tax;
    }
    
    @Override
    public String getDetails() {
        return String.format("Property ID: %d | Base Value: %.2f | Built-up Area: %.2f sq.ft | Age: %d years | In City: %s | Tax: INR %s",
                id, baseValue, builtUpArea, ageOfConstruction, isInMainCity ? "Yes" : "No", df.format(taxAmount));
    }
    
    @Override
    public String getType() {
        return "Property";
    }
    
    public double getBaseValue() {
        return baseValue;
    }
    
    public double getBuiltUpArea() {
        return builtUpArea;
    }
    
    public int getAgeOfConstruction() {
        return ageOfConstruction;
    }
    
    public boolean isInMainCity() {
        return isInMainCity;
    }
}
