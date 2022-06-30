package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.ItemBean;

public class Item_Info_DAO extends DAO {



	public int insert(ItemBean item_bean) throws Exception {


		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter d = DateTimeFormatter.ofPattern("yyMMddHHmmss");
		String new_item_id = "I" + d.format(date);

		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("insert into item_info_oki values(?,?,?,?,?)");
		st.setString(1, new_item_id);
		st.setString(2, item_bean.getItemName());
		st.setInt(3, item_bean.getItemPrice());
		st.setString(4, item_bean.getCategory());
		st.setString(5, item_bean.getExplanation());

		int line = st.executeUpdate();

		st.close();
		con.close();
		return line;

	}

	public List<ItemBean> search1(ItemBean itembean) throws Exception {

		List<ItemBean> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select * from item_info_oki where item_id = ?");
		st.setString(1, itembean.getItemId());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			itembean.setItemId(rs.getString("item_id"));
			itembean.setItemName(rs.getString("item_name"));
			itembean.setItemPrice(rs.getInt("item_price"));
			itembean.setCategory(rs.getString("category"));
			itembean.setExplanation(rs.getString("explanation"));

			list.add(itembean);
		}

		st.close();
		con.close();

		return list;

	}

	public List<ItemBean> search(String keyword) throws Exception {

		List<ItemBean> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select * from item_info_oki where ITEM_NAME like ?");
		st.setString(1, "%" + keyword + "%");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			ItemBean i = new ItemBean();

			i.setItemId(rs.getString("item_id"));
			i.setItemName(rs.getString("item_name"));
			i.setItemPrice(rs.getInt("item_price"));
			i.setCategory(rs.getString("category"));
			i.setExplanation(rs.getString("explanation"));

			list.add(i);
		}
		st.close();
		con.close();

		return list;
	}

	public int update(ItemBean itembean) throws Exception {

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"update item_info_oki set ITEM_NAME=?, ITEM_PRICE=?, CATEGORY=?, EXPLANATION=? where ITEM_ID=?");

		st.setString(1, itembean.getItemName());
		st.setInt(2, itembean.getItemPrice());
		st.setString(3, itembean.getCategory());
		st.setString(4, itembean.getExplanation());
		st.setString(5, itembean.getItemId());

		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;

	}

	public int delete(ItemBean itembean) throws Exception {

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"delete from item_info_oki where ITEM_ID=?");
		st.setString(1, itembean.getItemId());

		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;

	}

}
