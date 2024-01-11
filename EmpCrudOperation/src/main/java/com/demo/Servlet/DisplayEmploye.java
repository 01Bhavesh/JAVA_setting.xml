package com.demo.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.Service.EmployeServiceImpl;
import com.demo.Model.Employe;
import com.demo.Service.EmployeService;

/**
 * Servlet implementation class DisplayEmploye
 */
@WebServlet("/DisplayEmploye")
public class DisplayEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("html/text");
//		PrintWriter out = response.getWriter();
		
		EmployeService eservice = new EmployeServiceImpl();
		List<Employe> lst = eservice.getAllEmp();
		request.setAttribute("list", lst);
		RequestDispatcher rd = request.getRequestDispatcher("displayemp.jsp");
		rd.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
	

}
