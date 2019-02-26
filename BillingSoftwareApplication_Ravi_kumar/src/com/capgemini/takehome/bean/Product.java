package com.capgemini.takehome.bean;

public class Product {
    private  int productId;
    private  String productName;
    private  String productCategory;
    private  int productPrice;
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public Product(int productId, String productName, String productCategory, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}
    
    
}
