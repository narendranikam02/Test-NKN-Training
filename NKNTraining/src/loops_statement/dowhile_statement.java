package loops_statement;

public class dowhile_statement {

	public static void main(String[] args) {
		/*do
			 {
			statements;
			incre/decre;
			}
			while(condition);*/
		//Example to print 1 to 10 numbers
		System.out.println("Example 1 to print 1 to 10 numbers using do while loop");
		int i=1;
		do
		 {
		System.out.println(i);;
		i++;
		}
		while(i<=10);
		//Example 2 to print 10 to 1 numbers using do while loop
		System.out.println("Example 2 to print 10 to 1 numbers using do while loop");
				int j=10;
				do
				 {
					System.out.println(j);;
					j--;
				}
				while(j>=1);
				
	    //Example 3 to print even numbers 1 to 10 numbers using do while loop
		System.out.println("Example 3 to print even numbers 1 to 10 numbers using if condition inside do while loop");
		int k=1;
		do
		 {
			if(k%2==0) //
			System.out.println(k);
			k++;
			
			}
			while(k<=10);
	}

}
