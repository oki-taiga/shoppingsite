package jp.co.aforce.servlets;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.CartBean;
import jp.co.aforce.tool.Action;

public class CartRemoveAction extends Action{

	@SuppressWarnings("unchecked")
	public  String execute (HttpServletRequest request,HttpServletResponse response)
	throws Exception{
		HttpSession session=request.getSession();

		String itemid=request.getParameter("itemid");

		List<CartBean> cart=(List<CartBean>)session.getAttribute("cart");

		for(CartBean cartBean:cart) {
			if(Objects.equals(cartBean.getItemBean().getItemId(),itemid)) {
				cart.remove(cartBean);
				break;
			}
		}
		return "cart.jsp";
	}
}
