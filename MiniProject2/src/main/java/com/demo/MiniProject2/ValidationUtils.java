package com.demo.MiniProject2;

import java.util.Set;

public class ValidationUtils {
    
    public static class ValidationException extends Exception {
        public ValidationException(String message) {
            super(message);
        }
    }
    
    public static int validateMenuChoice(String input, int min, int max) throws ValidationException {
        try {
            int choice = Integer.parseInt(input.trim());
            if (choice < min || choice > max) {
                throw new ValidationException("Please enter a number between " + min + " and " + max);
            }
            return choice;
        } catch (NumberFormatException e) {
            throw new ValidationException("Invalid input. Please enter a numeric value.");
        }
    }
    
    public static double validatePositiveDouble(String input, String fieldName) throws ValidationException {
        try {
            double value = Double.parseDouble(input.trim());
            if (value <= 0) {
                throw new ValidationException(fieldName + " must be a non-zero positive number.");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new ValidationException("Invalid input for " + fieldName + ". Please enter a valid number.");
        }
    }
    
    public static int validatePositiveInt(String input, String fieldName) throws ValidationException {
        try {
            int value = Integer.parseInt(input.trim());
            if (value <= 0) {
                throw new ValidationException(fieldName + " must be a non-zero positive number.");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new ValidationException("Invalid input for " + fieldName + ". Please enter a valid integer.");
        }
    }
    
    public static boolean validateYesNo(String input) throws ValidationException {
        if (input == null || input.trim().isEmpty()) {
            throw new ValidationException("Please enter Y or N.");
        }
        String trimmed = input.trim().toUpperCase();
        if (trimmed.equals("Y")) {
            return true;
        } else if (trimmed.equals("N")) {
            return false;
        } else {
            throw new ValidationException("Invalid input. Please enter Y for Yes or N for No.");
        }
    }
    
    public static String validateRegistrationNumber(String input, Set<String> existingRegistrations) throws ValidationException {
        if (input == null || input.trim().isEmpty()) {
            throw new ValidationException("Registration number cannot be empty.");
        }
        
        String trimmed = input.trim();
        
        if (trimmed.length() != 4) {
            throw new ValidationException("Registration number must be exactly 4 digits.");
        }
        
        try {
            Integer.parseInt(trimmed);
        } catch (NumberFormatException e) {
            throw new ValidationException("Registration number must contain only digits.");
        }
        
        if (trimmed.equals("0000")) {
            throw new ValidationException("Registration number 0000 is not valid.");
        }
        
        if (existingRegistrations.contains(trimmed)) {
            throw new ValidationException("Registration number " + trimmed + " already exists. Please enter a unique number.");
        }
        
        return trimmed;
    }
    
    public static String validateBrand(String input) throws ValidationException {
        if (input == null || input.trim().isEmpty()) {
            throw new ValidationException("Brand name cannot be empty.");
        }
        return input.trim();
    }
    
    public static double validatePurchaseCost(String input) throws ValidationException {
        try {
            double cost = Double.parseDouble(input.trim());
            if (cost < 50000 || cost > 1000000) {
                throw new ValidationException("Purchase cost must be between INR 50,000 and INR 10,00,000.");
            }
            return cost;
        } catch (NumberFormatException e) {
            throw new ValidationException("Invalid purchase cost. Please enter a valid number.");
        }
    }
    
    public static int validateVelocity(String input) throws ValidationException {
        try {
            int velocity = Integer.parseInt(input.trim());
            if (velocity < 120 || velocity > 300) {
                throw new ValidationException("Maximum velocity must be between 120 kmph and 300 kmph.");
            }
            return velocity;
        } catch (NumberFormatException e) {
            throw new ValidationException("Invalid velocity. Please enter a valid integer.");
        }
    }
    
    public static int validateCapacity(String input) throws ValidationException {
        try {
            int capacity = Integer.parseInt(input.trim());
            if (capacity < 2 || capacity > 50) {
                throw new ValidationException("Capacity must be between 2 and 50 seats.");
            }
            return capacity;
        } catch (NumberFormatException e) {
            throw new ValidationException("Invalid capacity. Please enter a valid integer.");
        }
    }
    
    public static int validateVehicleType(String input) throws ValidationException {
        try {
            int type = Integer.parseInt(input.trim());
            if (type < 1 || type > 3) {
                throw new ValidationException("Vehicle type must be 1 (Petrol), 2 (Diesel), or 3 (CNG/LPG).");
            }
            return type;
        } catch (NumberFormatException e) {
            throw new ValidationException("Invalid vehicle type. Please enter 1, 2, or 3.");
        }
    }
}
