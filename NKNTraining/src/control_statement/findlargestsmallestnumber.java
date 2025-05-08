package control_statement;

public class findlargestsmallestnumber {

	public static void main(String[] args) {
		/*// Example finding largest number amongst 3 numbers
		int a =7,b=18,c=9;
		System.out.println("Example finding largest number amongst 3 numbers");
		System.out.println("a="+a+" b= "+b+" c= "+c);
		if(a>b && b>c)
		{
			System.out.println("a is larget");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is larget");
		}
		else{
			System.out.println("c is largest");
		}
		System.out.println("End of Example******************************");
		*/
		System.out.println("Finding largest numbers from 2 given numbers using ternery operators");
		int a =87,b=18;
		System.out.println("First No:"+a);
		System.out.println("Second No:"+b);
		int largestno = (a>b)? a:b;
		
		System.out.println(largestno+" is the largest number");
		System.out.println("******************************************");			
		
					
		
	}

}
