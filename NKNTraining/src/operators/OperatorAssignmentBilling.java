package operators;

public class OperatorAssignmentBilling {

	public static void main(String[] args) {
		
		int noofItemsPurchased = 5;
		int priceofeachitem = 1000;
		int totalbillbeforediscount = (noofItemsPurchased*priceofeachitem);
		boolean eligiblefordiscount = (totalbillbeforediscount>1000);
		int applydiscount =(totalbillbeforediscount- ((totalbillbeforediscount)/100)*10);
		int totalbillafterdiscount = (totalbillbeforediscount>1000) ? applydiscount : totalbillbeforediscount;
		System.out.println("Total No. of Items Purchased : "+noofItemsPurchased);
		System.out.println("Eligible for Discount        : "+eligiblefordiscount);
		System.out.println("Total Bill Before Discount   : "+totalbillbeforediscount+"/-");
		System.out.println("Total Bill After Discount    : "+totalbillafterdiscount+"/-");
		
		int itemadded= ++noofItemsPurchased;
		
		boolean eligibleforgift = (itemadded>5) && (totalbillafterdiscount>1000) ;
		//System.out.println("Free Gift    : "+itemadded);
		System.out.println("Free Gift    : "+eligibleforgift);
		
				
	}

}
