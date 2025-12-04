package com.demo.MiniProject2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaxManager {
    private List<Property> properties;
    private List<Vehicle> vehicles;
    private Set<String> regNum;
    private int pIdCnt;
    private int vIdCnt;
    
    private static final DecimalFormat df = new DecimalFormat("#0.00");
    
    public TaxManager() {
        this.properties = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.regNum = new HashSet<>();
        this.pIdCnt = 1;
        this.vIdCnt = 1;
    }
    
    public int getNextPropertyId() {
        return pIdCnt;
    }
    
    public int getNextVehicleId() {
        return vIdCnt;
    }
    
    public void addProperty(Property property) {
        properties.add(property);
        pIdCnt++;
    }
    
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        regNum.add(vehicle.getRegistrationNumber());
        vIdCnt++;
    }
    
    public Set<String> getRegistrationNumbers() {
        return regNum;
    }
    
    public List<Property> getProperties() {
        return new ArrayList<>(properties);
    }
    
    public List<Vehicle> getVehicles() {
        return new ArrayList<>(vehicles);
    }
    
    public List<Property> getPropertiesSortedByTax() {
        List<Property> sorted = new ArrayList<>(properties);
        Collections.sort(sorted, Collections.reverseOrder());
        return sorted;
    }
    
    public List<Vehicle> getVehiclesSortedByTax() {
        List<Vehicle> sorted = new ArrayList<>(vehicles);
        Collections.sort(sorted, Collections.reverseOrder());
        return sorted;
    }
    
    public double getTotalPropertyTax() {
        double total = 0.0;
        for (Property property : properties) {
            total += property.getTaxAmount();
        }
        return total;
    }
    
    public double getTotalVehicleTax() {
        double total = 0.0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.getTaxAmount();
        }
        return total;
    }
    
    public double getTotalTax() {
        return getTotalPropertyTax() + getTotalVehicleTax();
    }
    
    public int getPropertyCount() {
        return properties.size();
    }
    
    public int getVehicleCount() {
        return vehicles.size();
    }
    
    public boolean hasProperties() {
        return !properties.isEmpty();
    }
    
    public boolean hasVehicles() {
        return !vehicles.isEmpty();
    }
    
    public boolean hasAnyAssets() {
        return hasProperties() || hasVehicles();
    }
    
    public Property searchPropertyById(int id) {
        for (Property property : properties) {
            if (property.getId() == id) {
                return property;
            }
        }
        return null;
    }
    
    public Vehicle searchVehicleByRegistration(String registrationNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                return vehicle;
            }
        }
        return null;
    }
    
    public void displayTaxSummary() {
        String separator = "+" + "-".repeat(100) + "+";
        String doubleSeparator = "+" + "=".repeat(100) + "+";
        
        System.out.println("\n" + doubleSeparator);
        System.out.println("|" + centerText("TAX SUMMARY REPORT", 100) + "|");
        System.out.println(doubleSeparator);
        
        System.out.println("\n" + separator);
        System.out.println("|" + centerText("PROPERTY TAX DETAILS", 100) + "|");
        System.out.println(separator);
        
        if (hasProperties()) {
            System.out.printf("| %-4s | %-15s | %-15s | %-8s | %-10s | %-20s |%n",
                    "ID", "Base Value", "Built-up Area", "Age", "In City", "Tax Amount");
            System.out.println(separator);
            
            List<Property> sortedProperties = getPropertiesSortedByTax();
            for (Property p : sortedProperties) {
                System.out.printf("| %-4d | INR %-10.2f | %-12.2f sq.ft | %-8d | %-10s | INR %-15s |%n",
                        p.getId(), p.getBaseValue(), p.getBuiltUpArea(), 
                        p.getAgeOfConstruction(), p.isInMainCity() ? "Yes" : "No", 
                        df.format(p.getTaxAmount()));
            }
            System.out.println(separator);
            System.out.printf("| Total Properties: %-3d %60s INR %-15s |%n", 
                    getPropertyCount(), "Total Property Tax:", df.format(getTotalPropertyTax()));
        } else {
            System.out.println("|" + centerText("No Data Present at This Moment", 100) + "|");
        }
        System.out.println(separator);
        
        System.out.println("\n" + separator);
        System.out.println("|" + centerText("VEHICLE TAX DETAILS", 100) + "|");
        System.out.println(separator);
        
        if (hasVehicles()) {
            System.out.printf("| %-6s | %-12s | %-15s | %-10s | %-8s | %-8s | %-15s |%n",
                    "Reg No", "Brand", "Purchase Cost", "Velocity", "Capacity", "Type", "Tax Amount");
            System.out.println(separator);
            
            List<Vehicle> sortedVehicles = getVehiclesSortedByTax();
            for (Vehicle v : sortedVehicles) {
                System.out.printf("| %-6s | %-12s | INR %-10.2f | %-7d kmph | %-8d | %-8s | INR %-10s |%n",
                        v.getRegistrationNumber(), truncate(v.getBrand(), 12), v.getPurchaseCost(),
                        v.getMaxVelocity(), v.getCapacity(), v.getVehicleType().getDisplayName(),
                        df.format(v.getTaxAmount()));
            }
            System.out.println(separator);
            System.out.printf("| Total Vehicles: %-3d %62s INR %-15s |%n", 
                    getVehicleCount(), "Total Vehicle Tax:", df.format(getTotalVehicleTax()));
        } else {
            System.out.println("|" + centerText("No Data Present at This Moment", 100) + "|");
        }
        System.out.println(separator);
        
        System.out.println("\n" + doubleSeparator);
        System.out.println("|" + centerText("GRAND TOTAL", 100) + "|");
        System.out.println(doubleSeparator);
        System.out.printf("| %-30s: %-20d | %-30s: INR %-15s |%n", 
                "Total Properties", getPropertyCount(), "Total Property Tax", df.format(getTotalPropertyTax()));
        System.out.printf("| %-30s: %-20d | %-30s: INR %-15s |%n", 
                "Total Vehicles", getVehicleCount(), "Total Vehicle Tax", df.format(getTotalVehicleTax()));
        System.out.println(separator);
        System.out.printf("| %75s: INR %-15s |%n", "TOTAL TAX PAYABLE", df.format(getTotalTax()));
        System.out.println(doubleSeparator);
    }
    
    private String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(padding) + text + " ".repeat(width - padding - text.length());
    }
    
    private String truncate(String text, int maxLength) {
        if (text.length() <= maxLength) {
            return text;
        }
        return text.substring(0, maxLength - 2) + "..";
    }
}
