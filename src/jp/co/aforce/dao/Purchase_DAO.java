package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import jp.co.aforce.beans.CartBean;
import jp.co.aforce.beans.ItemBean;
import jp.co.aforce.beans.MemberBean;

public class Purchase_DAO extends DAO {
	public boolean insert(List<CartBean>cart, String purchase_method,int zip_code,String address, MemberBean memberbean)
	throws Exception{
		Connection con=getConnection();
		con.setAutoCommit(false);
		//MemberBean memberbean=new MemberBean();
		//HttpSession session=request.getSession();
		//MemberBean memberbean=(MemberBean)session.getAttribute("MemberBean");

		for(CartBean cartbean:cart) {
			PreparedStatement st=con.prepareStatement(
					"insert into purchase_info values(null,?,?,?,?,?,?)");
			ItemBean itembean=cartbean.getItemBean();
			st.setString(1, memberbean.getMemberId());
			st.setInt(2, itembean.getItemPrice());
			st.setInt(3, cartbean.getCount());
			st.setString(4, purchase_method);
			st.setInt(5, zip_code);
			st.setString(6, address);
			int line=st.executeUpdate();
			st.close();

			if(line!=1) {
				con.rollback();
				con.setAutoCommit(true);
				con.close();
				return false;
			}
		}
		con.commit();
		con.setAutoCommit(true);
		con.close();
		return true;
	}

}
