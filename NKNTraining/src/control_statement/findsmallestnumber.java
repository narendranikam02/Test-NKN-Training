package control_statement;

public class findsmallestnumber {

	public static void main(String[] args) {
		// Find smallest number from given 3 numbers with if else statement
		int a=1110, b=311,c=500;
		System.out.println("Find smallest number from given 3 numbers with if else statement");	
		System.out.println("a= "+a + ", b= "+b+", c="+c);		
		if(a<b && a<c)// if statement
		{
			System.out.println("A is smallest number");
		}
		else if(b<a && b<c)// else if statement
		{
			System.out.println("b is smallest number");
		}
		else //if(a<b && b<c)// else statement
		{
			System.out.println("c is smalest number");
		}
		

	}

}
