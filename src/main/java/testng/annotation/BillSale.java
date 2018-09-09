package testng.annotation;

public class BillSale {
	private long billid;
	private String billNo;
	BillSale(long billid,String billNo){
		this.billid=billid;
		this.billNo=billNo;
	}
	public long getBillid() {
		return billid;
	}
	public void setBillid(long billid) {
		this.billid = billid;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	
}
