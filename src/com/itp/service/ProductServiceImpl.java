package com.itp.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.itp.model.Product;
import com.itp.utill.DBConnection;

public class ProductServiceImpl  implements ProductService{
	
	private static Connection conn;
	
	public ProductServiceImpl() {
		
		conn = DBConnection.getConnection();
	
	}
	
	

	@Override
	public boolean addNewProduct(Product pro) throws SQLException {
		
		String sql = "Insert into products values (?,?,?,?,?,?,?)";
		PreparedStatement stm = conn.prepareStatement(sql);
		
		stm.setObject(1,0);
		stm.setObject(2,pro.getPro_Code());
		stm.setObject(3,pro.getPro_Name());
		stm.setObject(4,pro.getPro_Descrip());
		stm.setObject(5,pro.getPro_Status());
		stm.setObject(6,pro.getPro_Price());
		stm.setObject(7,pro.getPro_Weight());
		
		int res = stm.executeUpdate();
		
		
		return res>0;
		
		
	}



	@Override
	public ArrayList<Product> getAllProducts() throws SQLException{

		
		String sql = "Select * from products";
		Statement stm = conn.createStatement();
		ResultSet rst = stm.executeQuery(sql);
		ArrayList<Product> proList = new ArrayList<Product>();
		
		while (rst.next()) {
			
			Product pro = new Product();
			pro.setPro_Id(rst.getString("Pro_Id"));
			pro.setPro_Code(rst.getString("pro_Code"));
			pro.setPro_Name (rst.getString("pro_Name"));
			pro.setPro_Descrip(rst.getString("pro_Descrip"));
			pro.setPro_Status(rst.getString("pro_Status"));
			pro.setPro_Price(rst.getString("pro_Price"));
			pro.setPro_Weight(rst.getString("pro_Weight"));
			
			proList.add(pro);
			
		}

		return proList;
	}

}
