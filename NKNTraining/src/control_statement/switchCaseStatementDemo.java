package control_statement;

public class switchCaseStatementDemo {

	public static void main(String[] args) {
		/* Switch case statement
		switch(variable)
		{
		case value1 : statement;
		case value2 : statement;
		case value3 : statement;
		case value4 : statement;
		default : statement;
		}
		////Find the day based on number
		int weekdayno=3;
		switch(weekdayno)
		{
		case 1 : System.out.println("Monday");
				 break;
		case 2 : System.out.println("Tuesday");
				 break;
		case 3 : System.out.println("Wednesday");
				 break;
		case 4 : System.out.println("Thursday");
				 break;
		case 5 : System.out.println("Friday");
		         break;	
		case 6 : System.out.println("Saturday");
		         break;
		case 7 : System.out.println("Sunday");
				 break;
		default : System.out.println("Invalid day");;
		}
		
*/
		//Find the day number based on Day
		String weekdayno="Friday";
		switch(weekdayno)
		{
		case "Monday" : System.out.println("1");
				 break;
		case "Tuesday" : System.out.println("2");
				 break;
		case "Wednesday" : System.out.println("3");
				 break;
		case "Thursday" : System.out.println("4");
				 break;
		case "Friday" : System.out.println("5");
		         break;	
		case "Saturday" : System.out.println("6");
		         break;
		case "Sunday" : System.out.println("7");
				 break;
		default : System.out.println("Invalid name");;
		}
	}

}
