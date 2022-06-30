package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/jp.co.aforce/administrator"})
public class Administrator_Menu extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
				request.getRequestDispatcher("../views/login.jsp").forward(request, response);
			}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{

	if(request.getParameter("item_regist") !=null) {
		request.getRequestDispatcher("/views/item_regist.jsp").forward(request, response);
	}
	if(request.getParameter("item_update") !=null) {
		request.getRequestDispatcher("/views/item_update.jsp").forward(request, response);
	}
	if(request.getParameter("item_delete") !=null) {
		request.getRequestDispatcher("/views/item_delete.jsp").forward(request, response);
	}

	}
}