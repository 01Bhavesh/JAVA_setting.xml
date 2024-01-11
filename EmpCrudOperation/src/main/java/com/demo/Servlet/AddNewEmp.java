package com.demo.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Model.Employe;
import com.demo.Service.EmployeService;
import com.demo.Service.EmployeServiceImpl;

/**
 * Servlet implementation class AddNewEmp
 */
@WebServlet("/NewEmp")
public class AddNewEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int eid = Integer.parseInt(request.getParameter("eid"));
	String ename = request.getParameter("ename");
	double esal = Double.parseDouble(request.getParameter("esal"));
	EmployeService eservice = new EmployeServiceImpl();
	Employe e = new Employe(eid,ename,esal);
	eservice.addEmp(e);
	RequestDispatcher rd = request.getRequestDispatcher("DisplayEmploye");
	rd.forward(request, response);
	
	}

}
