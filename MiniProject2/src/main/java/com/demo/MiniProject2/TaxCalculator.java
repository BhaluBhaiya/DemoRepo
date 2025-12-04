package com.demo.MiniProject2;

import java.io.Console;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class TaxCalculator {
	private static Scanner scanner;
	private static TaxManager taxManager;
	private static final DecimalFormat df = new DecimalFormat("#0.00");
	private static final UsersData user = new UsersData();
	private static final LoginCheck loginCheck = new LoginCheck(user);

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		taxManager = new TaxManager();

		String currentUser = promptLogin(scanner);
		System.out.println("Welcome, " + currentUser + "!");

		displayWelcomeScreen();

		boolean running = true;
		while (running) {
			displayMainMenu();
			try {
				int choice = ValidationUtils.validateMenuChoice(scanner.nextLine(), 1, 4);
				switch (choice) {
				case 1:
					handlePropertySubMenu();
					break;
				case 2:
					handleVehicleSubMenu();
					break;
				case 3:
					handleTaxSummary();
					break;
				case 4:
					running = false;
					displayExitMessage();
					break;
				}
			} catch (ValidationUtils.ValidationException e) {
				System.out.println("\n[ERROR] " + e.getMessage());
			}
		}

		scanner.close();
	}

	private static String promptLogin(Scanner scanner) {

		System.out.println(centerText("*************************************", 70));
		System.out.println(centerText("LOGIN PAGE", 70));
		System.out.println(centerText("*************************************", 70));

		Console console = System.console();

		while (true) {
			System.out.print("\nUsername (or 'q' to quit): ");
			if (!scanner.hasNextLine()) {
				System.out.println("\nInput closed. Exiting.");
				System.exit(0);
			}
			String username = scanner.nextLine().trim();
			if (username.equalsIgnoreCase("q")) {
				System.out.println("Goodbye!");
				System.exit(0);
			}

			String password;
			if (console != null) {
				char[] pw = console.readPassword("Password: ");
				password = (pw == null) ? "" : new String(pw);
			} else {
				System.out.print("Password: ");
				if (!scanner.hasNextLine()) {
					System.out.println("\nInput closed. Exiting.");
					System.exit(0);
				}
				password = scanner.nextLine();
			}

			if (loginCheck.login(username, password)) {
				return username;
			} else {
				System.out.println("Invalid credentials. Please try again.");
			}
		}
	}

	private static void displayWelcomeScreen() {
		String border = "=".repeat(70);

		System.out.println("\n" + border);
		System.out.println(centerText("*************************************", 70));
		System.out.println(centerText("TAX CALCULATION APPLICATION", 70));
		System.out.println(centerText("*************************************", 70));
		System.out.println(border);
		System.out.println();
		System.out.println(centerText("Developer: Bhuvan Parewa", 70));
		System.out.println(centerText("Version: 1.0", 70));
		System.out.println(border);
		System.out.println("\nPress ENTER to continue...");
		scanner.nextLine();
	}

	private static void displayMainMenu() {
		String border = "=".repeat(50);

		System.out.println("\n" + border);
		System.out.println(centerText("MAIN MENU", 50));
		System.out.println(border);
		System.out.println();
		System.out.println("  1. Property Menu");
		System.out.println("  2. Vehicle Menu");
		System.out.println("  3. View Tax Summary");
		System.out.println("  4. Exit Application");
		System.out.println();
		System.out.println(border);
		System.out.print("\nEnter your choice (1-4): ");
	}

	private static void handlePropertySubMenu() {
		boolean inPropertyMenu = true;

		while (inPropertyMenu) {
			displayPropertySubMenu();
			try {
				int choice = ValidationUtils.validateMenuChoice(scanner.nextLine(), 1, 4);
				switch (choice) {
				case 1:
					addProperty();
					break;
				case 2:
					calculatePropertyTax();
					break;
				case 3:
					showProperties();
					break;
				case 4:
					inPropertyMenu = false;
					break;
				}
			} catch (ValidationUtils.ValidationException e) {
				System.out.println("\n[ERROR] " + e.getMessage());
			}
		}
	}

	private static void displayPropertySubMenu() {
		String border = "=".repeat(50);

		System.out.println("\n" + border);
		System.out.println(centerText("PROPERTY MENU", 50));
		System.out.println(border);
		System.out.println();
		System.out.println("  1. Add Property");
		System.out.println("  2. Calculate Tax");
		System.out.println("  3. Show Properties");
		System.out.println("  4. Main Menu");
		System.out.println();
		System.out.println(border);
		System.out.print("\nEnter your choice (1-4): ");
	}

	private static void addProperty() {
		String border = "=".repeat(60);

		System.out.println("\n" + border);
		System.out.println(centerText("ADD PROPERTY DETAILS", 60));
		System.out.println(border);

		try {
			System.out.print("\nEnter Base Value of Land (INR): ");
			double baseValue = ValidationUtils.validatePositiveDouble(scanner.nextLine(), "Base Value");

			System.out.print("Enter Built-up Area (sq.ft): ");
			double builtUpArea = ValidationUtils.validatePositiveDouble(scanner.nextLine(), "Built-up Area");

			System.out.print("Is the property located in the main city? (Y/N): ");
			boolean isInMainCity = ValidationUtils.validateYesNo(scanner.nextLine());

			System.out.print("Enter Age of Construction (years): ");
			int ageOfConstruction = ValidationUtils.validatePositiveInt(scanner.nextLine(), "Age of Construction");

			int propertyId = taxManager.getNextPropertyId();
			Property property = new Property(propertyId, baseValue, builtUpArea, ageOfConstruction, isInMainCity);

			System.out.println("\n" + "-".repeat(60));
			System.out.println("  Property Added Successfully!");
			System.out.println("  Property ID: " + propertyId);
			System.out.println("-".repeat(60));

			System.out.print("\nDo you want to save this property? (Y/N): ");
			boolean save = ValidationUtils.validateYesNo(scanner.nextLine());

			if (save) {
				taxManager.addProperty(property);
				System.out.println("\n[SUCCESS] Property saved successfully!");
			} else {
				System.out.println("\n[INFO] Property was not saved.");
			}

		} catch (ValidationUtils.ValidationException e) {
			System.out.println("\n[ERROR] " + e.getMessage());
		}

		System.out.println("\nPress ENTER to continue...");
		scanner.nextLine();
	}

	private static void calculatePropertyTax() {
		String border = "=".repeat(60);
		String innerBorder = "-".repeat(60);

		System.out.println("\n" + border);
		System.out.println(centerText("CALCULATE PROPERTY TAX", 60));
		System.out.println(border);

		if (!taxManager.hasProperties()) {
			System.out.println("\n  No properties available.");
			System.out.println("  Please add a property first.");
			System.out.println("\nPress ENTER to continue...");
			scanner.nextLine();
			return;
		}

		try {
			System.out.print("\nEnter Property ID to calculate tax: ");
			int propertyId = ValidationUtils.validatePositiveInt(scanner.nextLine(), "Property ID");

			Property property = taxManager.searchPropertyById(propertyId);

			if (property == null) {
				System.out.println("\n[ERROR] Property with ID " + propertyId + " not found.");
			} else {
				System.out.println("\n" + innerBorder);
				System.out.println(centerText("PROPERTY TAX CALCULATION", 60));
				System.out.println(innerBorder);
				System.out.println();
				System.out.println("  Property ID        : " + property.getId());
				System.out.println("  Base Value         : INR " + df.format(property.getBaseValue()));
				System.out.println("  Built-up Area      : " + df.format(property.getBuiltUpArea()) + " sq.ft");
				System.out.println("  Age of Construction: " + property.getAgeOfConstruction() + " years");
				System.out.println("  Located in City    : " + (property.isInMainCity() ? "Yes" : "No"));
				System.out.println();
				System.out.println("  " + "-".repeat(40));
				System.out.println("  CALCULATED TAX     : INR " + df.format(property.getTaxAmount()));
				System.out.println("  " + "-".repeat(40));
			}

		} catch (ValidationUtils.ValidationException e) {
			System.out.println("\n[ERROR] " + e.getMessage());
		}

		System.out.println("\nPress ENTER to continue...");
		scanner.nextLine();
	}

	private static void showProperties() {
		String border = "=".repeat(100);

		System.out.println("\n" + border);
		System.out.println(centerText("ALL PROPERTIES", 100));
		System.out.println(border);

		if (!taxManager.hasProperties()) {
			System.out.println("\n" + centerText("No Data Present at This Moment", 100));
		} else {
			System.out.printf("\n| %-4s | %-15s | %-15s | %-8s | %-10s | %-20s |%n", "ID", "Base Value",
					"Built-up Area", "Age", "In City", "Tax Amount");
			System.out.println("+" + "-".repeat(98) + "+");

			List<Property> properties = taxManager.getPropertiesSortedByTax();
			for (Property p : properties) {
				System.out.printf("| %-4d | INR %-10.2f | %-12.2f sq.ft | %-8d | %-10s | INR %-15s |%n", p.getId(),
						p.getBaseValue(), p.getBuiltUpArea(), p.getAgeOfConstruction(), p.isInMainCity() ? "Yes" : "No",
						df.format(p.getTaxAmount()));
			}
			System.out.println("+" + "-".repeat(98) + "+");
			System.out.println("\n  Total Properties: " + taxManager.getPropertyCount());
			System.out.println("  Total Property Tax: INR " + df.format(taxManager.getTotalPropertyTax()));
		}

		System.out.println("\n" + border);
		System.out.println("\nPress ENTER to continue...");
		scanner.nextLine();
	}

	private static void handleVehicleSubMenu() {
		boolean inVehicleMenu = true;

		while (inVehicleMenu) {
			displayVehicleSubMenu();
			try {
				int choice = ValidationUtils.validateMenuChoice(scanner.nextLine(), 1, 4);
				switch (choice) {
				case 1:
					addVehicle();
					break;
				case 2:
					calculateVehicleTax();
					break;
				case 3:
					showVehicles();
					break;
				case 4:
					inVehicleMenu = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("\n[ERROR] " + e.getMessage());
			}
		}
	}

	private static void displayVehicleSubMenu() {
		String border = "=".repeat(50);

		System.out.println("\n" + border);
		System.out.println(centerText("VEHICLE MENU", 50));
		System.out.println(border);
		System.out.println();
		System.out.println("  1. Add Vehicle");
		System.out.println("  2. Calculate Tax");
		System.out.println("  3. Show Vehicles");
		System.out.println("  4. Main Menu");
		System.out.println();
		System.out.println(border);
		System.out.print("\nEnter your choice (1-4): ");
	}

	private static void addVehicle() {
		String border = "=".repeat(60);

		System.out.println("\n" + border);
		System.out.println(centerText("ADD VEHICLE DETAILS", 60));
		System.out.println(border);

		try {
			System.out.print("\nEnter Registration Number (4 digits, e.g., 0010): ");
			String registrationNumber = ValidationUtils.validateRegistrationNumber(scanner.nextLine(),
					taxManager.getRegistrationNumbers());

			System.out.print("Enter Vehicle Brand: ");
			String brand = ValidationUtils.validateBrand(scanner.nextLine());

			System.out.print("Enter Purchase Cost (INR 50,000 - 10,00,000): ");
			double purchaseCost = ValidationUtils.validatePurchaseCost(scanner.nextLine());

			System.out.print("Enter Maximum Velocity (120-300 kmph): ");
			int maxVelocity = ValidationUtils.validateVelocity(scanner.nextLine());

			System.out.print("Enter Seating Capacity (2-50): ");
			int capacity = ValidationUtils.validateCapacity(scanner.nextLine());

			System.out.println("\nVehicle Type Options:");
			System.out.println("  1. Petrol (10% of purchase cost)");
			System.out.println("  2. Diesel (11% of purchase cost)");
			System.out.println("  3. CNG/LPG (12% of purchase cost)");
			System.out.print("Enter Vehicle Type (1-3): ");
			int vehicleTypeCode = ValidationUtils.validateVehicleType(scanner.nextLine());

			Vehicle.VehicleType vehicleType = Vehicle.VehicleType.fromCode(vehicleTypeCode);

			int vehicleId = taxManager.getNextVehicleId();
			Vehicle vehicle = new Vehicle(vehicleId, registrationNumber, brand, purchaseCost, maxVelocity, capacity,
					vehicleType);

			System.out.println("\n" + "-".repeat(60));
			System.out.println("  Vehicle Added Successfully!");
			System.out.println("  Registration Number: " + registrationNumber);
			System.out.println("-".repeat(60));

			System.out.print("\nDo you want to save this vehicle? (Y/N): ");
			boolean save = ValidationUtils.validateYesNo(scanner.nextLine());

			if (save) {
				taxManager.addVehicle(vehicle);
				System.out.println("\n[SUCCESS] Vehicle saved successfully!");
			} else {
				System.out.println("\n[INFO] Vehicle was not saved.");
			}

		} catch (Exception e) {
			System.out.println("\n[ERROR] " + e.getMessage());
		}

		System.out.println("\nPress ENTER to continue...");
		scanner.nextLine();
	}

	private static void calculateVehicleTax() {
		String border = "=".repeat(60);
		String innerBorder = "-".repeat(60);

		System.out.println("\n" + border);
		System.out.println(centerText("CALCULATE VEHICLE TAX", 60));
		System.out.println(border);

		if (!taxManager.hasVehicles()) {
			System.out.println("\n  No vehicles available.");
			System.out.println("  Please add a vehicle first.");
			System.out.println("\nPress ENTER to continue...");
			scanner.nextLine();
			return;
		}

		try {
			System.out.print("\nEnter Registration Number to calculate tax: ");
			String regNumber = scanner.nextLine().trim();

			if (regNumber.isEmpty()) {
				System.out.println("\n[ERROR] Registration number cannot be empty.");
				System.out.println("\nPress ENTER to continue...");
				scanner.nextLine();
				return;
			}

			Vehicle vehicle = taxManager.searchVehicleByRegistration(regNumber);

			if (vehicle == null) {
				System.out.println("\n[ERROR] Vehicle with registration number " + regNumber + " not found.");
			} else {
				System.out.println("\n" + innerBorder);
				System.out.println(centerText("VEHICLE TAX CALCULATION", 60));
				System.out.println(innerBorder);
				System.out.println();
				System.out.println("  Registration Number: " + vehicle.getRegistrationNumber());
				System.out.println("  Brand              : " + vehicle.getBrand());
				System.out.println("  Purchase Cost      : INR " + df.format(vehicle.getPurchaseCost()));
				System.out.println("  Maximum Velocity   : " + vehicle.getMaxVelocity() + " kmph");
				System.out.println("  Seating Capacity   : " + vehicle.getCapacity());
				System.out.println("  Vehicle Type       : " + vehicle.getVehicleType().getDisplayName());
				System.out.println();
				System.out.println("  Tax Breakdown:");
				System.out.println("    Velocity Component  : " + vehicle.getMaxVelocity());
				System.out.println("    Capacity Component  : " + vehicle.getCapacity());
				System.out.println("    Cost Component (" + (int) (vehicle.getVehicleType().getTaxRate() * 100) + "%): "
						+ df.format(vehicle.getVehicleType().getTaxRate() * vehicle.getPurchaseCost()));
				System.out.println();
				System.out.println("  " + "-".repeat(40));
				System.out.println("  CALCULATED TAX     : INR " + df.format(vehicle.getTaxAmount()));
				System.out.println("  " + "-".repeat(40));
			}

		} catch (Exception e) {
			System.out.println("\n[ERROR] " + e.getMessage());
		}

		System.out.println("\nPress ENTER to continue...");
		scanner.nextLine();
	}

	private static void showVehicles() {
		String border = "=".repeat(100);

		System.out.println("\n" + border);
		System.out.println(centerText("ALL VEHICLES", 100));
		System.out.println(border);

		if (!taxManager.hasVehicles()) {
			System.out.println("\n" + centerText("No Data Present at This Moment", 100));
		} else {
			System.out.printf("\n| %-6s | %-12s | %-15s | %-10s | %-8s | %-8s | %-15s |%n", "Reg No", "Brand",
					"Purchase Cost", "Velocity", "Capacity", "Type", "Tax Amount");
			System.out.println("+" + "-".repeat(98) + "+");

			List<Vehicle> vehicles = taxManager.getVehiclesSortedByTax();
			for (Vehicle v : vehicles) {
				System.out.printf("| %-6s | %-12s | INR %-10.2f | %-7d kmph | %-8d | %-8s | INR %-10s |%n",
						v.getRegistrationNumber(), truncate(v.getBrand(), 12), v.getPurchaseCost(), v.getMaxVelocity(),
						v.getCapacity(), v.getVehicleType().getDisplayName(), df.format(v.getTaxAmount()));
			}
			System.out.println("+" + "-".repeat(98) + "+");
			System.out.println("\n  Total Vehicles: " + taxManager.getVehicleCount());
			System.out.println("  Total Vehicle Tax: INR " + df.format(taxManager.getTotalVehicleTax()));
		}

		System.out.println("\n" + border);
		System.out.println("\nPress ENTER to continue...");
		scanner.nextLine();
	}

	private static void handleTaxSummary() {
		if (!taxManager.hasAnyAssets()) {
			String border = "=".repeat(50);
			System.out.println("\n" + border);
			System.out.println(centerText("TAX SUMMARY", 50));
			System.out.println(border);
			System.out.println();
			System.out.println(centerText("No Data Present at This Moment", 50));
			System.out.println();
			System.out.println("  Please add properties or vehicles first to view the tax summary.");
			System.out.println();
			System.out.println(border);
		} else {
			taxManager.displayTaxSummary();
		}

		System.out.println("\nPress ENTER to return to main menu...");
		scanner.nextLine();
	}

	private static void displayExitMessage() {
		String border = "=".repeat(50);

		System.out.println("\n" + border);
		System.out.println(centerText("THANK YOU", 50));
		System.out.println(border);
		System.out.println();
		System.out.println(centerText("Thank you for using Tax Calculation Application!", 50));
		System.out.println(centerText("Goodbye!", 50));
		System.out.println();
		System.out.println(border);
	}

	private static String centerText(String text, int width) {
		int padding = (width - text.length()) / 2;
		if (padding < 0)
			padding = 0;
		return " ".repeat(padding) + text;
	}

	private static String truncate(String text, int maxLength) {
		if (text.length() <= maxLength) {
			return text;
		}
		return text.substring(0, maxLength - 2) + "..";
	}
}
