package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.MemberBean;
import jp.co.aforce.dao.Member_Info_DAO;

@WebServlet(urlPatterns = { "/jp.co.aforce/member_delete" })
public class Member_Delete extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();

		String member_id=request.getParameter("member_id");

		MemberBean member_bean=new MemberBean();

		member_bean.setMember_Id(member_id);


		Member_Info_DAO member_info=new Member_Info_DAO();

		try {
			List<MemberBean> list = new ArrayList<>();


			member_bean.setMember_Id(member_id);

			list = member_info.search(member_bean);


			if(list.size()==0) {
				out.println("エラーのようです。");
			}


			int line = member_info.delete(member_bean);

			if (line > 0) {
				out.println("削除に成功しました。");
			} else {
				out.println("削除に失敗しました。");
			}

		} catch (Exception e) {
			out.println("エラーです。");
		}

	}
}
