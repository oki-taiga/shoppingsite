package jp.co.aforce.servlets;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.CartBean;
import jp.co.aforce.tool.Action;

public class PreviewAction extends Action{
	@SuppressWarnings("unchecked")
	public String execute(
			HttpServletRequest request,HttpServletResponse response)
	throws Exception{
		HttpSession session=request.getSession();

		List<CartBean> cart=(List<CartBean>)session.getAttribute("cart");
		if(cart==null || cart.size()==0) {
			return "preview-error-cart.jsp";
		}
		return "purchase.jsp";
	}
}
