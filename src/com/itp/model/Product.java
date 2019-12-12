package com.itp.model;

public class Product {

	private int productId;
	private String productName;
	private String productDescrip;
	private float productPrice;
	private String productStatus;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, String productDescrip, float productPrice, String productStatus) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescrip = productDescrip;
		this.productPrice = productPrice;
		this.productStatus = productStatus;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescrip() {
		return productDescrip;
	}

	public void setProductDescrip(String productDescrip) {
		this.productDescrip = productDescrip;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	
	
	
	
	
}
