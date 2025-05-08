package control_statement;

public class ifelseAssignment {

	public static void main(String[] args) {
		int studentAtime = 57;
		int studentBtime = 59;
		System.out.println("Student A completed race is :"+studentAtime);
		System.out.println("Student B completed race is :"+studentBtime);
		if(studentAtime>studentBtime)
		    {
			 System .out.println("Student B is winner");
			}
			else if(studentAtime==studentBtime)
			{
			 System .out.println("It's tie");
			}
			else
			{
			 System .out.println("Student A is A *****WINNER****");
			}		
		}



}
