package loops_statement;

public class forloop_statement {

	public static void main(String[] args) {
		/* for loop syntax
	 for (initialization; condition; increment/decrement)
		{
		Statements;
		}
		 */
		//Example 1 : print 1 to 10 numbers
		System.out.println("Example 1 : print 1 to 10 numbers");
		for (int i=1; i<=10;i++)
		{
		System.out.println(i);
		}
		//Example 2 Approach 1: print 1 to 10 even numbers
				System.out.println("Example 2 : print 1 to 10 even numbers using if condition");
				for (int i=1; i<=10;i++)
				{
					if(i%2==0) 
					{
				    System.out.println(i);
				    }
	}
				//Example 2 Approach 2: print 1 to 10 even numbers using shorthand operator
				System.out.println("Example 2 Approach 2: print 1 to 10 even numbers using shorthand operator");
				for (int j=2; j<=10;j+=2)
				{
							    System.out.println(j);
				    
				}
				

				//Example 3 print 1 to 10 even and odd numbers 
				System.out.println("Example 3 print 1 to 10 even and odd numbers ");
				for (int k=1; k<=10;k++)
				{
					if(k%2==0) 
					{
				    System.out.println("Even No " +k);
				    }
					else 
					{
						System.out.println("Odd No " +k);
						
					}
				}		
				//Example 4 print 10 to 1 in descending order 
					System.out.println("Example 4 print 10 to 1 in descending order");
					for (int l=10; l>=1;l--)
					{
						
					    System.out.println(l);
					    
	}}	}
	
