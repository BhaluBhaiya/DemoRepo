package com.demo.MiniProject2;

import java.text.DecimalFormat;

public class Vehicle extends Asset {
    private String registrationNumber;
    private String brand;
    private double purchaseCost;
    private int maxVelocity;
    private int capacity;
    private VehicleType vehicleType;
    
    private static final DecimalFormat df = new DecimalFormat("#0.00");
    
    public enum VehicleType {
        PETROL(1, "Petrol", 0.10),
        DIESEL(2, "Diesel", 0.11),
        CNG_LPG(3, "CNG/LPG", 0.12);
        
        private final int code;
        private final String displayName;
        private final double taxRate;
        
        VehicleType(int code, String displayName, double taxRate) {
            this.code = code;
            this.displayName = displayName;
            this.taxRate = taxRate;
        }
        
        public int getCode() {
            return code;
        }
        
        public String getDisplayName() {
            return displayName;
        }
        
        public double getTaxRate() {
            return taxRate;
        }
        
        public static VehicleType fromCode(int code) {
            for (VehicleType type : values()) {
                if (type.code == code) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Invalid vehicle type code: " + code);
        }
    }
    
    public Vehicle(int id, String registrationNumber, String brand, double purchaseCost, 
                   int maxVelocity, int capacity, VehicleType vehicleType) {
        super(id);
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.purchaseCost = purchaseCost;
        this.maxVelocity = maxVelocity;
        this.capacity = capacity;
        this.vehicleType = vehicleType;
        this.taxAmount = calculateTax();
    }
    
    @Override
    public double calculateTax() {
        return maxVelocity + capacity + (vehicleType.getTaxRate() * purchaseCost);
    }
    
    @Override
    public String getDetails() {
        return String.format("Reg No: %s | Brand: %s | Cost: INR %.2f | Velocity: %d kmph | Capacity: %d | Type: %s | Tax: INR %s",
                registrationNumber, brand, purchaseCost, maxVelocity, capacity, vehicleType.getDisplayName(), df.format(taxAmount));
    }
    
    @Override
    public String getType() {
        return "Vehicle";
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public double getPurchaseCost() {
        return purchaseCost;
    }
    
    public int getMaxVelocity() {
        return maxVelocity;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
