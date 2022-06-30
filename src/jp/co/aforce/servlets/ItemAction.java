package jp.co.aforce.servlets;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.dao.Item_Info_DAO;
import jp.co.aforce.tool.Action;


public class ItemAction extends Action{
	public  String execute (HttpServletRequest request,HttpServletResponse response)
	throws Exception{

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		HttpSession session=request.getSession();

		String keyword=request.getParameter("keyword");
		if(keyword==null)keyword="";

		Item_Info_DAO item_info=new Item_Info_DAO();
		List<ItemBean> list=item_info.search(keyword);


		session.setAttribute("list", list);

		return "all_item.jsp";
	}
}
