package control_statement;

public class IfelsestatementDemo {

	public static void main(String[] args) {
		//Example 1
		int person_age=28;
		System.out.println("The Person's age ="+person_age);			
		if(person_age>=18)// if statement
		{
			System.out.println("Person is eligible for vote");
		}
		else // else statement
		{
			System.out.println("Person is not eligible for vote");
		}
		System.out.println("End of Example 1*************");
		System.out.println("");
		//Example 2
				int number=21;
				System.out.println("The given number ="+number);		
				if(number%2==0)// if statement
				{
					System.out.println("This is even number");
				}
				else // else statement
				{
					System.out.println("This is odd number");
				}
				System.out.println("End of Example 2*************");
				System.out.println("");
				
				//Example 3
				int a=110, b=311,c=500;
				System.out.println("a= "+a + ", b= "+b+", c="+c);		
				if(a>b && a>c)// if statement
				{
					System.out.println("A is largest number");
				}
				else if(a<b && b>c)// else if statement
				{
					System.out.println("b is largest number");
				}
				else //if(a<b && b<c)// else statement
				{
					System.out.println("c is largest number");
				}
				
				System.out.println("End of Example 3*************");
				//Example 4
				System.out.println("Example 4 executes if statement when boolean value provided in if expression directly");	
				if(true)// boolean value 
					
				{
					System.out.println("if statemment");
				}
				else 
				{
					System.out.println("else statement");
				}
				}
				
	}


