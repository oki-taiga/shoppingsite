package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.MemberBean;
import jp.co.aforce.dao.Member_Info_DAO;

@WebServlet(urlPatterns= {"/jp.co.aforce/member_regist"})
public class Member_Regist extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();

		LocalDateTime date=LocalDateTime.now();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("yyMMddHHmmss");
		String new_member_id="A"+d.format(date);

		String last_name=request.getParameter("last_name");
		String first_name=request.getParameter("first_name");
		String password=request.getParameter("password");
		String mail_address=request.getParameter("mail_address");

		int sex=Integer.parseInt(request.getParameter("sex"));
		int birth_year=Integer.parseInt(request.getParameter("birth_year"));
		int birth_month=Integer.parseInt(request.getParameter("birth_month"));
		int birth_day=Integer.parseInt(request.getParameter("birth_day"));
		String phone_number=request.getParameter("phone_number");

		MemberBean member_bean=new MemberBean();

		member_bean.setMember_Id(new_member_id);
		member_bean.setLast_Name(last_name);
		member_bean.setFirst_Name(first_name);
		member_bean.setSex(sex);
		member_bean.setBirth_Year(birth_year);
		member_bean.setBirth_Month(birth_month);
		member_bean.setBirth_Day(birth_day);
		member_bean.setPhone_Number(phone_number);
		member_bean.setMail_Address(mail_address);
		member_bean.setPassword(password);


		Member_Info_DAO member_info=new Member_Info_DAO();

		try {
			int count=member_info.search(last_name, first_name, sex, birth_year, birth_month, birth_day,phone_number, mail_address,password);
			if(count>=1 ) {
				request.setAttribute("error","会員情報が重複してます。");
				request.getRequestDispatcher("../views/regist.jsp").forward(request, response);
			}else {
				 int line=member_info.insert(member_bean);
				 request.setAttribute("memberid",new_member_id);
					System.out.println(new_member_id);
				 request.getRequestDispatcher("../views/regist-complete.jsp").forward(request, response);
				if(line>0) {
					out.println("会員情報登録に失敗しました。");
				}
			}

		}catch(Exception e) {
			out.println("エラーです");
			System.out.println("エラーが発生しました。");
			}
	}
}


