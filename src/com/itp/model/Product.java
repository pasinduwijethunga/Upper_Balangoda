package com.itp.model;

import java.util.Currency;

public class Product {
	
	private String Pro_Id;
	private String Pro_Code;
	private String Pro_Name;
	private String pro_Descrip;
	private String pro_Status;
	private String pro_Price;
	private String pro_Weight;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	
    
	



	/**
	 * @param pro_Id
	 * @param pro_Code
	 * @param pro_Name
	 * @param pro_Descrip
	 * @param pro_Status
	 * @param pro_Price
	 * @param pro_Weight
	 */
	public Product(String pro_Id, String pro_Code, String pro_Name, String pro_Descrip, String pro_Status,
			String pro_Price, String pro_Weight) {
		super();
		Pro_Id = pro_Id;
		Pro_Code = pro_Code;
		Pro_Name = pro_Name;
		this.pro_Descrip = pro_Descrip;
		this.pro_Status = pro_Status;
		this.pro_Price = pro_Price;
		this.pro_Weight = pro_Weight;
	}




	public String getPro_Id() {
		return Pro_Id;
	}


	public void setPro_Id(String pid) {
		Pro_Id = pid;
	}


	public String getPro_Code() {
		return Pro_Code;
	}


	public void setPro_Code(String pro_Code) {
		Pro_Code = pro_Code;
	}


	public String getPro_Name() {
		return Pro_Name;
	}


	public void setPro_Name(String pro_Name) {
		Pro_Name = pro_Name;
	}


	public String getPro_Descrip() {
		return pro_Descrip;
	}


	public void setPro_Descrip(String pro_Descrip) {
		this.pro_Descrip = pro_Descrip;
	}


	public String getPro_Status() {
		return pro_Status;
	}


	public void setPro_Status(String pro_Status) {
		this.pro_Status = pro_Status;
	}


	public String getPro_Price() {
		return pro_Price;
	}


	public void setPro_Price(String pprice) {
		this.pro_Price = pprice;
	}




	public String getPro_Weight() {
		return pro_Weight;
	}



	public void setPro_Weight(String pro_Weight) {
		this.pro_Weight = pro_Weight;
	}
	
	
	
	

}
