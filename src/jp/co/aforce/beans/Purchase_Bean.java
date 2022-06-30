package jp.co.aforce.beans;

public class Purchase_Bean {
	public int purchase_id;
	public String member_id;
	public int fee;
	public int count;
	public String purchase_method;
	public int zip_code;
	public String address;


	public int getPurchase_Id() {
		return purchase_id;
	}
	public String getMember_Id() {
		return member_id;
	}
	public int getfee() {
		return fee;
	}
	public int Count() {
		return count;
	}
	public String getPurchase_Method() {
		return purchase_method;
	}
	public int Zip_Code() {
		return zip_code;
	}
	public String getAddress() {
		return address;
	}

	public void setPurchase_Id(int purchase_id) {
		this.purchase_id=purchase_id;
	}
	public void setMember_Id(String member_id) {
		this.member_id=member_id;
	}
	public void setFee(int fee) {
		this.fee=fee;
	}
	public void setCount(int count) {
		this.count=count;
	}
	public void setPurchase_Method(String purchase_method) {
		this.purchase_method=purchase_method;
	}
	public void setZip_Code(int zip_code) {
		this.zip_code=zip_code;
	}
	public void setAddress(String address) {
		this.address=address;
	}

}
