package com.mypackage.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			String firstName1=request.getParameter("firstname");
			String lastName1=request.getParameter("lastname");
			String phno1=request.getParameter("phno");
			String email1=request.getParameter("email");
			String language1=request.getParameter("language");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Root");
		   	PreparedStatement ps=con.prepareStatement("insert into Example values(?,?,?,?,?)");
			ps.setString(1,firstName1);
			ps.setString(2,lastName1);
			ps.setString(3,phno1);
			ps.setString(4,email1);
			ps.setString(5,language1);
			ps.execute();
			response.sendRedirect("Sucess.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
