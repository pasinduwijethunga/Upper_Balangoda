<%@page import="com.itp.service.ProductService"%>
<%@page import="com.itp.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itp.service.ProductServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <form action="AddProductServlet" mettod="post">
        
        <input type="text" placeholder="Pro_Code" name="Pro_Code">
        <br>
        
        <input type="text" placeholder="Pro_Name" name="Pro_Name">
        <br>
        
        <input type="text" placeholder="pro_Descrip" name="pro_Descrip">
        <br>
        
        <input type="text" placeholder="pro_Status" name="pro_Status">
        <br>
        
        <input type="text" placeholder="pro_Price" name="pro_Price">
        <br>
        
        <input type="text" placeholder="pro_Weight" name="pro_Weight">
        <br>
        
        <input type="submit" placeholder="Save" name="Save" style="blackground-color:blue;">
        <br>
        
        
        </form>
        
        
        <table style="width:100%">
        	<tr>
        
        <td>Pro_Code</td>
        <td>Pro_Name</td>
        <td>pro_Descrip</td>
        <td>pro_Status</td>
        <td>pro_Price</td>
        <td>pro_Weight</td>
        	</tr>
        	
        	<%ProductService serv = new ProductServiceImpl();
        	
        	ArrayList <Product> list = serv.getAllProducts();
        	
        	%>
       </table> 	
</body>
</html>