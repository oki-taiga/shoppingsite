package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.MemberBean;
import jp.co.aforce.dao.Member_Info_DAO;

@WebServlet(urlPatterns= {"/jp.co.aforce/member_update"})
public class Member_Update extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();

		String member_id=request.getParameter("member_id");
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

		member_bean.setMember_Id(member_id);
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
			int line=member_info.update(member_bean);

			if(line>0) {
				out.println("更新に成功しました。");
			} else {
				out.println("更新に失敗しました。");
			}

		} catch (Exception e) {
			out.println("予期せぬエラーです。");
			e.printStackTrace();
		}

	}
}


