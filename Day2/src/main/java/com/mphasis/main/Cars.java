package com.mphasis.main;

public class Cars {
	private String carName;
	private String brand;
	private String type;
	private double cost;
	public Cars() {
		super();
	}
	public Cars(String carName, String brand, String type, double cost) {
		super();
		this.carName = carName;
		this.brand = brand;
		this.type = type;
		this.cost = cost;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Cars [carName=" + carName + ", brand=" + brand + ", type=" + type + ", cost=" + cost + "]";
	}
	public double getMSRP() {
		// TODO Auto-generated method stub
		return cost+cost*0.4;
	}
	
	
	
	
}
