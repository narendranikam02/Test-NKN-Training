package loops_statement;

public class reverse_Number_program {

	public static void main(String[] args) {
		//reverse number using stringbuffer class
		int i = 12345;
		
		StringBuffer sb = new StringBuffer(String.valueOf(i));//convert number to string
		StringBuffer reversei = sb.reverse();//stored reverse value of sb variable
		
		
		System.out.println(reversei);        //print the sb variable

		/*reverse number using string builder class
				int j = 112233;
				StringBuilder sb1 = new StringBuilder();//created object of SGTring builder class
				sb1.append(j);//appended the variable with object of class
				
				StringBuilder rev1=sb1.reverse();//reverse the variable value with reverse method
				System.out.println(rev1);        // print the rev1 variable
				*/
	
	}

}
