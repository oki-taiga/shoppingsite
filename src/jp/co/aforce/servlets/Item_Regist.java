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

@WebServlet(urlPatterns= {"/jp.co.aforce/item_regist"})
public class Item_Regist extends HttpServlet {

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

		ItemBean item_bean=new ItemBean();

		item_bean.setItemId(item_id);
		item_bean.setItemName(item_name);
		item_bean.setItemPrice(item_price);
		item_bean.setCategory(category);
		item_bean.setExplanation(explanation);

		Item_Info_DAO item_info=new Item_Info_DAO();

		try {
			int line=item_info.insert(item_bean);
			if(line>0) {
				out.println("商品の追加に成功しました。");
				System.out.println("");
			}else {
				out.println("商品の追加に失敗しました。");
			}
		}catch(Exception e) {
				e.printStackTrace(out);
				System.out.println("例外");
		}

	}
}


