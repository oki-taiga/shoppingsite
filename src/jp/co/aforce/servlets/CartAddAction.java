package jp.co.aforce.servlets;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.CartBean;
import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.tool.Action;

public class CartAddAction extends Action{

	@SuppressWarnings("unchecked")
	public  String execute (HttpServletRequest request,HttpServletResponse response)
	throws Exception{
		HttpSession session=request.getSession();

		String itemid=request.getParameter("itemid");

		List<CartBean> cart=(List<CartBean>)session.getAttribute("cart");
		if(cart==null) {
			cart=new ArrayList<CartBean>();
			session.setAttribute("cart", cart);
		}

		for(CartBean cartBean:cart) {
			if(Objects.equals(cartBean.getItemBean().getItemId(),itemid)) {
				cartBean.setCount(cartBean.getCount()+1);
				return "cart.jsp";
			}
		}
		List<ItemBean> list=(List<ItemBean>)session.getAttribute("list");
		for(ItemBean itembean:list) {
			if(Objects.equals(itembean.getItemId(),itemid)) {
				CartBean cartBean=new CartBean();
				cartBean.setItemBean(itembean);
				cartBean.setCount(1);
				cart.add(cartBean);
			}
		}
			return "cart.jsp";
	}
}
