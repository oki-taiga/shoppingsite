package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/jp.co.aforce/logout"})
public class LoginOut extends HttpServlet {
		public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
			HttpSession session=request.getSession();

			if(session.getAttribute("Member_Been")!=null) {
				session.removeAttribute("Member_Beean");
				request.getRequestDispatcher("../views/login.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("../views/main_menu.jsp").forward(request, response);
			}
		}
}
