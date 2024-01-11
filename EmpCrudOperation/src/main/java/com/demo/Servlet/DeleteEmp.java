package com.demo.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Service.EmployeService;
import com.demo.Service.EmployeServiceImpl;

/**
 * Servlet implementation class DeleteEmp
 */
@WebServlet("/deleteEmp")
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eid = Integer.parseInt(request.getParameter("eid"));
		EmployeService eservice = new EmployeServiceImpl();
		eservice.deleteEmp(eid);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayEmploye");
		rd.forward(request, response);
		
	}	
	
}
