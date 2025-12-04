package com.demo.MiniProject2;

public class PropertyTax {
	private static int propId = 1001;
	
	private int id;
	private double baseValue;
	private double buildAr;
	private int ageOfLand;
	private boolean inCity;
	private double calculatedTax;
	public PropertyTax() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropertyTax(int id, double baseValue, double buildAr, int ageOfLand, boolean inCity) {
		super();
		this.id = id;
		this.baseValue = baseValue;
		this.buildAr = buildAr;
		this.ageOfLand = ageOfLand;
		this.inCity = inCity;

	}
	public static int getPropId() {
		return propId;
	}
	public static void setPropId(int propId) {
		PropertyTax.propId = propId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
	}
	public double getBuildAr() {
		return buildAr;
	}
	public void setBuildAr(double buildAr) {
		this.buildAr = buildAr;
	}
	public int getAgeOfLand() {
		return ageOfLand;
	}
	public void setAgeOfLand(int ageOfLand) {
		this.ageOfLand = ageOfLand;
	}
	public boolean isInCity() {
		return inCity;
	}
	public void setInCity(boolean inCity) {
		this.inCity = inCity;
	}
	public double getCalculatedTax() {
		return calculatedTax;
	}
	public void setCalculatedTax(double calculatedTax) {
		this.calculatedTax = calculatedTax;
	}
	public double calculateTax() {
		double area = this.buildAr;
		int age = this.ageOfLand;
		double base = this.baseValue;
		
		double baseTax = area*age*base;
		double finalTax;
		
		if(this.inCity)
			finalTax = baseTax*(0.5*area);
		else
			finalTax = baseTax;
		return Math.round(finalTax*100.0)/100.0;
	}
}
