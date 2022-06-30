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

import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.dao.Item_Info_DAO;

@WebServlet(urlPatterns= {"/jp.co.aforce/item_delete"})
public class Item_Delete extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		request.getRequestDispatcher("../views/login.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();

		String itemid=request.getParameter("item_id");

		ItemBean item_bean=new ItemBean();
		Item_Info_DAO item_info=new Item_Info_DAO();

		item_bean.setItemId(itemid);

		try {
			List<ItemBean> list = new ArrayList<>();


			item_bean.setItemId(itemid);

			list = item_info.search1(item_bean);


			if(list.size()==0) {
				out.println("エラーのようです。");
			}


			int line = item_info.delete(item_bean);

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


