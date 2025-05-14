package array_concepts;

import java.util.Scanner;

public class taking_Inpur_fromKeyboards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int b= sc.nextInt();//taking integer number
		System.out.println("You have entered " +b);
		System.out.println("Enter decimal value");
		double c= sc.nextDouble();//taking decimal value
		System.out.println("You have entered " +c);
		System.out.println("Enter your Name");
		String s1=sc.next();//taking string
		System.out.println("Hello..."+s1);
	}

}
