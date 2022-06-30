package jp.co.aforce.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.MemberBean;
import jp.co.aforce.dao.Member_Info_DAO;

@WebServlet(urlPatterns= {"/jp.co.aforce/login"})
public class Login extends HttpServlet {
		public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
			response.setContentType("text/html;charset=UTF-8");

			HttpSession session=request.getSession();

			String member_id=request.getParameter("member_id");
			String password=request.getParameter("password");

			Member_Info_DAO dao=new Member_Info_DAO();

			try {
				MemberBean memberbean=dao.search(member_id, password);
				String MemberId=memberbean.getMemberId();

				if (MemberId != null) {
					if(member_id.equals("Administrator")){
						request.getRequestDispatcher("../views/administrator_menu.jsp").forward(request, response);
						System.out.println("あ");
					}
					session.setAttribute("MemberBean", memberbean);
					request.getRequestDispatcher("../views/login-complete.jsp").forward(request, response);
					System.out.println("い");
				} else {
					request.setAttribute("error", "IDまたはパスワードが誤っています。");
					request.setAttribute("member_id", member_id);
					request.getRequestDispatcher("../views/login.jsp").forward(request, response);
					System.out.println("う");
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("エラーが起きてます.");


			}



		}
}
