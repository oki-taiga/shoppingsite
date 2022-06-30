package jp.co.aforce.servlets;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.CartBean;
import jp.co.aforce.beans.MemberBean;
import jp.co.aforce.dao.Purchase_DAO;
import jp.co.aforce.tool.Action;


public class PurchaseAction extends Action{
	@SuppressWarnings("unchecked")
	public String execute(
			HttpServletRequest request,HttpServletResponse response)
	throws Exception{
		HttpSession session=request.getSession();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");


		String purchase_method=request.getParameter("purchase_method");
		int zip_code=Integer.parseInt(request.getParameter("zip_code"));
		String address=request.getParameter("address");



		if(purchase_method.isEmpty() || address.isEmpty()) {
		return "purchase-error-empty.jsp";
	}

	MemberBean memberbean=(MemberBean)session.getAttribute("MemberBean");
	Purchase_DAO pd=new Purchase_DAO();



	List<CartBean>cart=(List<CartBean>)session.getAttribute("cart");
	if(cart==null || !pd.insert(cart,purchase_method, zip_code,address,memberbean)) {
		return "purchase-error-insert.jsp";
	}
	if(memberbean==null) {
		return "purchase-login-error.jsp";
	}

	session.removeAttribute("cart");
	return "complete.jsp";
}
}
