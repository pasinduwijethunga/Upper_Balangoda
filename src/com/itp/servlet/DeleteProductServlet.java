package com.itp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.service.ProductService;
import com.itp.service.ProductServiceImpl;

/**
 * Servlet implementation class DeleteProductServlet
 */
@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Pro_Id = request.getParameter("deleteValue");
		
		ProductService  proService = new ProductServiceImpl();
			
		boolean isDeleted = false;
		try {
			isDeleted = proService.deleteProduct(Pro_Id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (isDeleted==true) {
			
			 System.out.println("Successfully");
			 
			 PrintWriter writer = response.getWriter();
			 writer.println("<script>");
			 writer.println("alert('deleted Successfully')");
			 writer.println("</script>");
			 
			 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
			 dispatcher.include(request, response);
		}
		
		
		
	}

}
