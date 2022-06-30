package jp.co.aforce.beans;

public class MemberBean implements java.io.Serializable {
	public String memberId;
	public String lastName;
	public String firstName;
	public int sex;
	public int birthYear;
	public int birthMonth;
	public int birthDay;
	public String phoneNumber;
	public String mailAddress;
	public String password;

	public String getMemberId() {
		return memberId;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getSex() {
		return sex;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public String getPassword() {
		return password;
	}

	public void setMember_Id(String memberId) {
		this.memberId=memberId;
	}
	public void setLast_Name(String lastName) {
		this.lastName=lastName;
	}
	public void setFirst_Name(String firstName) {
		this.firstName=firstName;
	}
	public void setSex(int sex) {
		this.sex=sex;
	}
	public void setBirth_Year(int birthYear) {
		this.birthYear=birthYear;
	}
	public void setBirth_Month(int birthMonth) {
		this.birthMonth=birthMonth;
	}
	public void setBirth_Day(int birthDay) {
		this.birthDay=birthDay;
	}
	public void setPhone_Number(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public void setMail_Address(String mailAddress) {
		this.mailAddress=mailAddress;
	}
	public void setPassword(String password) {
		this.password=password;
	}
}

