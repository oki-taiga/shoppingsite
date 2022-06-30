package jp.co.aforce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.dao.Item_Info_DAO;

@WebServlet(urlPatterns= {"/jp.co.aforce/item_update"})
public class Item_Update extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		request.getRequestDispatcher("../views/login.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();

		String item_id=request.getParameter("item_id");
		String item_name=request.getParameter("item_name");
		String category=request.getParameter("category");
		String explanation=request.getParameter("explanation");
		int item_price=Integer.parseInt(request.getParameter("item_price"));

		ItemBean itembean=new ItemBean();
		Item_Info_DAO item_info=new Item_Info_DAO();

		itembean.setItemId(item_id);
		itembean.setItemName(item_name);
		itembean.setItemPrice(item_price);
		itembean.setCategory(category);
		itembean.setExplanation(explanation);



		try {
			int line=item_info.update(itembean);

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


