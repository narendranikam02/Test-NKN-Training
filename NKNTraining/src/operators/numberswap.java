package operators;

public class numberswap {

	public static void main(String[] args) {
		// Example : swap two numbers with temp variable
		/*int a=6;
		int b=16;
		
		int c =a;//c=6
		a=b; //a=16
		b=c; //b=6
		
		System.out.println("swapped a="+a);
		System.out.println("swapped b="+b);
		*/
		// Example : swap two numbers without temp variable
			    int a=5;
				int b=10;
				
				a=a+b;//a=15
				b=a-b;//15-10=5
				a=a-b;//15-5=10
				System.out.println(a);
				System.out.println(b);
				
				//System.out.println("swapped a="+a);
				//System.out.println("swapped b="+b);
				
	}

}
