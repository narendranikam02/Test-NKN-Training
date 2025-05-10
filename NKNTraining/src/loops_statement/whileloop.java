package loops_statement;

public class whileloop {

	public static void main(String[] args) {
		/*while loop
		sysntax
		while(condition)
		{
			stamenet;
			incr/dec;
		}
		*/
		//Example to print 1 to 10 numbers;
		int i=1; 
		System.out.println("Example 1 to print 1 to 10 numbers");         
		while(i<=10)                          //condition
		{
			System.out.println(+i);     //statement
			i++;                              //increment
		}
		//Example to print number from -10 to -1;
		System.out.println("Example 2 to print number from -10 to -1"); 
		int j=-10; 
				 
				while(j<=-1)                   //condition
				{
					System.out.println(j);     //statement
					j++;                       //increment
				}
				
		//Example to print number from 10 to 1;
				System.out.println("Example 3 to print number from 10 to 1"); 
				int k=10; 
				 
				while(k>=1)                   //condition
				{
					System.out.println(k);     //statement
					k--;                       //decrement
				}
				//approach 1 Example to print even number from 1 to 20;
				System.out.println("Example 4 Approach 1 to print even number from 1 to 20, used logical operators to check conditions in while "); 
				int h=2; 
				 
				while((h<=20) && (h%2==0))                   //condition
				{
					System.out.println(h);     //statement
					h+=2;                       //short hand expression to increment
				}
				//approach 2 Example to print even number from 1 to 20;
				System.out.println("Example 4 Approach 2 to print even number from 1 to 20, with shosrt hand expression"); 
				int l=2; 
				 
				while(l<=20)                   //condition
				{
					System.out.println(l);     //statement
					l+=2;                       //short hand expression to increment
				}
				//approach 3 Example to print even number from 1 to 20;
				System.out.println("Example 4 Approach 3 to print even number from 1 to 20, if loop inside while loop"); 
				int f=1; 
				 
				while(f<=20)                   //condition
				{
					if(f%2==0)
					{
						System.out.println(f); 
					}
					f++;
					
				}
				// Example to print even and odd number from 1 to 20, with specifying odd even number
				System.out.println(" Example 5 to print even and odd number from 1 to 20, with specifying odd even number"); 
				int w=1; 
				 
				while(w<=20)                   //condition
				{
					if(w%2==0)
					{
						System.out.println(w+" Even number"); 
					}
					else
					{
						System.out.println(w+" odd number"); 					
					}
					w++;
					
				}
	}

}
