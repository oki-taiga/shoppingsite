package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/jp.co.aforce/member_menu"})
public class Member_Menu extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
				request.getRequestDispatcher("../views/login.jsp").forward(request, response);
			}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{

	if(request.getParameter("member_update") !=null) {
		request.getRequestDispatcher("/views/update.jsp").forward(request, response);
	}
	if(request.getParameter("member_delete") !=null) {
		request.getRequestDispatcher("/views/delete.jsp").forward(request, response);
	}

	}
}