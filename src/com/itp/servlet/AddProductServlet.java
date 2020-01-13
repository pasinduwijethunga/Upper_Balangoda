package com.itp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Currency;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itp.model.Product;
import com.itp.service.ProductService;
import com.itp.service.ProductServiceImpl;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
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
		// TODO Auto-generated method stub
		
		String pid      = request.getParameter("pro_Id");
		String Pcode    = request.getParameter("Pro_Code");
		String Pname    = request.getParameter("Pro_Name");
		String Pdescrip = request.getParameter("pro_Descrip");
		String pstatus  = request.getParameter("pro_Status");
		String pprice   = request.getParameter("pro_Price");
		String pweight  = request.getParameter("pro_Weight");
		
		Product pro = new Product();
		
		pro.setPro_Id(pid);
		pro.setPro_Code(Pcode);
		pro.setPro_Name(Pname);
		pro.setPro_Descrip(Pdescrip);
		pro.setPro_Status(pstatus);
		pro.setPro_Price(pprice);
		pro.setPro_Weight(pweight);
		
		ProductService  proService = new ProductServiceImpl();
		
		try {
			boolean isAdded = proService.addNewProduct(pro);
			
			if (isAdded==true) {
				 System.out.println("Successfully");
				 
				 PrintWriter writer = response.getWriter();
				 writer.println("<script>");
				 writer.println("alert('Added Successfully')");
				 writer.println("</script>");
				 
				 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
				 dispatcher.include(request, response);
				 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
