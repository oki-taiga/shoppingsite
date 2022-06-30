package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.MemberBean;

public class Member_Info_DAO extends DAO {

	MemberBean memberbean = new MemberBean();

	public MemberBean search(String member_id,String password)throws Exception{
		Connection con=getConnection();

		PreparedStatement st=con.prepareStatement("select * from member_info where MEMBER_ID=? and PASSWORD=?");
		MemberBean memberbean = new MemberBean();
		st.setString(1, member_id);
		st.setString(2, password);

		ResultSet rs=st.executeQuery();

		while(rs.next()) {
			memberbean.setMember_Id(rs.getString("member_id"));
			memberbean.setPassword(rs.getString("password"));
		}

		st.close();
		con.close();

		return memberbean;

	}

	public int search
	(String last_name,String first_name,int sex,int birth_year,int birth_month,int birth_day,String phone_number,String mail_address,String password)
	throws Exception{
		Connection con=getConnection();
		int count=0;

		PreparedStatement st=con.prepareStatement
		("select count(*) from member_info where LAST_NAME=? and FIRST_NAME=? and SEX=? and BIRTH_YEAR=? and BIRTH_MONTH=? and BIRTH_DAY=? and PHONE_NUMBER=? and MAIL_ADDRESS=? and PASSWORD=?");
		st.setString(1,last_name);
		st.setString(2,first_name);
		st.setInt(3,sex);
		st.setInt(4,birth_year);
		st.setInt(5,birth_month);
		st.setInt(6,birth_day);
		st.setString(7,phone_number);
		st.setString(8,mail_address);
		st.setString(9, password);
		ResultSet rs=st.executeQuery();

		while(rs.next()) {
			count=rs.getInt(1);
		}
		st.close();
		con.close();

		return count;
	}

		public int insert(MemberBean memberbean)throws Exception{

//			LocalDateTime date=LocalDateTime.now();
//			DateTimeFormatter d=DateTimeFormatter.ofPattern("yyMMddHHmmss");
//			String new_member_id="A"+d.format(date);


			Connection con=getConnection();
			PreparedStatement st=con.prepareStatement("insert into member_info values(?,?,?,?,?,?,?,?,?,?)");
			st.setString(1, memberbean.getMemberId());
			st.setString(2, memberbean.getLastName());
			st.setString(3, memberbean.getFirstName());
			st.setInt(4, memberbean.getSex());
			st.setInt(5, memberbean.getBirthYear());
			st.setInt(6, memberbean.getBirthMonth());
			st.setInt(7, memberbean.getBirthDay());
			st.setString(8, memberbean.getPhoneNumber());
			st.setString(9, memberbean.getMailAddress());
			st.setString(10, memberbean.getPassword());

			int line=st.executeUpdate();

			st.close();
			con.close();
			return line;
		}

		public int update(MemberBean memberbean) throws Exception {

			Connection con = getConnection();

			PreparedStatement st = con.prepareStatement(
					"update member_info set LAST_NAME=?, FIRST_NAME=?, SEX=?, BIRTH_YEAR=?,BIRTH_MONTH=?,BIRTH_DAY=?,PHONE_NUMBER=?,MAIL_ADDRESS=?,PASSWORD=? WHERE MEMBER_ID=?");

			st.setString(1, memberbean.getLastName());
			st.setString(2, memberbean.getFirstName());
			st.setInt(3, memberbean.getSex());
			st.setInt(4, memberbean.getBirthYear());
			st.setInt(5, memberbean.getBirthMonth());
			st.setInt(6, memberbean.getBirthDay());
			st.setString(7, memberbean.getPhoneNumber());
			st.setString(8, memberbean.getMailAddress());
			st.setString(9, memberbean.getPassword());
			st.setString(10, memberbean.getMemberId());

			int line = st.executeUpdate();

			st.close();
			con.close();

			return line;

		}

		public int delete(MemberBean member_bean) throws Exception {

			Connection con = getConnection();

			PreparedStatement st = con.prepareStatement(
					"delete from member_info where MEMBER_ID=?");
			st.setString(1, member_bean.getMemberId());

			int line = st.executeUpdate();

			st.close();
			con.close();

			return line;

		}
		public List<MemberBean> search(MemberBean memberbean) throws Exception {

			List<MemberBean> list = new ArrayList<>();

			Connection con = getConnection();

			PreparedStatement st = con.prepareStatement(
					"select * from member_info where MEMBER_ID = ?");
			st.setString(1, memberbean.getMemberId());
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				memberbean.setMember_Id(rs.getString("member_id"));
				memberbean.setLast_Name(rs.getString("last_name"));
				memberbean.setFirst_Name(rs.getString("first_name"));
				memberbean.setSex(rs.getInt("sex"));
				memberbean.setBirth_Year(rs.getInt("birth_year"));
				memberbean.setBirth_Month(rs.getInt("birth_month"));
				memberbean.setBirth_Day(rs.getInt("birth_day"));
				memberbean.setPhone_Number(rs.getString("phone_number"));
				memberbean.setMail_Address(rs.getString("mail_address"));
				memberbean.setPassword(rs.getString("password"));

				list.add(memberbean);
			}

			st.close();
			con.close();

			return list;

		}
}
