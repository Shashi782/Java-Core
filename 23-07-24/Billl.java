class Billl{

int Billid;
String Billissuedate;
String BillDueDate;
boolean isPaid;
boolean latestBill;

public  Billl(int billId,String billIssueDate,String billdueDate,boolean isBilllPaid,boolean isLatestBill){
	
		this.Billid=billId;
		this.Billissuedate=billIssueDate;
		this.BillDueDate=billdueDate;
		this.isPaid=isBilllPaid;
		this.latestBill=isLatestBill;
	
		
	}


public  void getBillInfo(){
	System.out.println("The Bill Id is"+this.Billid);
	System.out.println("The Bill Id is"+this.BillDueDate);
	
	
	

}
}