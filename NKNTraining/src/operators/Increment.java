package operators;

public class Increment {

	public static void main(String[] args) {
		/*Case 1
		int a = 10;
		System.out.println(a);
		
		a++;                       //=a+1;
		System.out.println(a);
		
		//Case 2 (Post Increment)
		int b=10;
		int res=b++;  //assignment happned and then value incremented
		System.out.println(res);
		System.out.println(b);
		*/
		//Case 3 (Pre Increment)
		int b=10;
		int res=++b; //value incremented and then assignment happened 
		System.out.println(res);
		System.out.println(b);		
				
	}

}
