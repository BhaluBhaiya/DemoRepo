package com.mphasis.Day4New;

public class Item {
	private int prodId;
	private String prodName;
	private double price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int prodId, String prodName, double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
	}
	
	
}
