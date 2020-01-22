package com.itp.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itp.model.Product;

public interface ProductService {

	
	
	boolean addNewProduct(Product pro) throws SQLException;
	
	
	
	public ArrayList <Product> getAllProducts()throws SQLException;



	boolean deleteProduct(String Pro_Id)throws SQLException ;
	
	
	

}
