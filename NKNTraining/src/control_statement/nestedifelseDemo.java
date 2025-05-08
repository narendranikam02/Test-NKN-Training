package control_statement;

public class nestedifelseDemo 
{

	public static void main(String[] args) 
	{
	/*	if(true)
		{
			if(true)
			{
				System.out.println("ABC");
			}
			else
			{
				System.out.println("XYZ");	
			}
		 
		}
			else
			{		
			System.out.println("nested else");		
		    }*/
		//Example Print weekday name based on weekday number
		int weekdayno=16;
		
		System.out.println("Example Print weekday name based on weekday number "+weekdayno);
		if(weekdayno==1)
		{
			System.out.println("Monday");
		}
		else if(weekdayno==2)
		{
			System.out.println("Tuesday");
		}
		else if(weekdayno==3)
		{
			System.out.println("Wednesday");
		}
		else if(weekdayno==4)
		{
			System.out.println("Thursday");
		}
		else if(weekdayno==5)
		{
			System.out.println("Friday");
			
		}
		else if(weekdayno==6)
		{
			System.out.println("Saturday");
		}
		else if(weekdayno==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid day");
		}
		}

}


