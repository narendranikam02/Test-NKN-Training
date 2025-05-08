package operators;

public class Decrement {

	public static void main(String[] args) {
		//Case 1
		int a = 10;
		System.out.println(a);
		
		a--;                       //=a-1;
		System.out.println(a);
		
		//Case 2 (Post Decrement)
		int b=10;
		int res=b--;  //assignment happned and then value incremented
		System.out.println(res);
		System.out.println(b);
				
		//Case 3 (Pre decrement)
		int c=10;
		int res1=--c; //value incremented and then assignment happened 
		System.out.println(res1);
		System.out.println(c);		
	}

}
