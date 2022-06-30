package jp.co.aforce.beans;

public class CartBean implements java.io.Serializable {
	private ItemBean itemBean;
	private int count;

	public ItemBean getItemBean() {
		return itemBean;
	}
	public int getCount() {
		return count;
	}
	public void setItemBean(ItemBean itemBean) {
		this.itemBean=itemBean;
	}
	public void setCount(int count) {
		this.count=count;
	}

}
