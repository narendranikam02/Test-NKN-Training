package operators;

public class OperatorAssignmentBilling {

	public static void main(String[] args) {
		
		int noofItemsPurchased = 5; // Unary operator
		int priceofeachitem = 1100; // Unary operator
		int totalbillbeforediscount = (noofItemsPurchased*priceofeachitem); // Unary operator
		boolean eligiblefordiscount = (totalbillbeforediscount>1000);// Unary operator 
		int applydiscount =(totalbillbeforediscount- ((totalbillbeforediscount)/100)*10);
		int totalbillafterdiscount = (totalbillbeforediscount>1000) ? applydiscount : totalbillbeforediscount; // Ternary operators
		System.out.println("Total No. of Items Purchased : "+noofItemsPurchased);
		System.out.println("Eligible for Discount        : "+eligiblefordiscount);
		System.out.println("Total Bill Before Discount   : "+totalbillbeforediscount+"/-");
		System.out.println("Total Bill After Discount    : "+totalbillafterdiscount+"/-");
		
		int itemadded= ++noofItemsPurchased; // Unary operator : increment operator
		
		boolean eligibleforgift = (itemadded>=5) && (totalbillafterdiscount>1000) ; // Logical operators
		//System.out.println("Free Gift    : "+itemadded);
		System.out.println("Free Gift    : "+eligibleforgift);
		
				
	}

}
