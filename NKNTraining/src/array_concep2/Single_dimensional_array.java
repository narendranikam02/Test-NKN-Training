package array_concep2;

public class Single_dimensional_array {

	public static void main(String[] args) {
		/* Single dimensional array
		 * 1) How to declare an array
		 * 2) Add values to an array
		 * 3) Read single value from an array
		 * 4) Read multiple values from an array
		*/
		int a[]=new int[5]; //Approach 1 : Integer array declaration
		a[0]=1;             //Add values in array
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		System.out.println(a[0]); //print value from array
		
		String s[]=new String[5]; //String array declaration
		s[0]="One";
		s[1]="Two";
		s[2]="Three";
		s[3]="Four";
		s[4]="Five";
		System.out.println(s[3]);
		
		int a1[]= {10,20,30,40,50,60,70,80,90};//Approach 2 declare and add values in it
		System.out.println(a1[3]);
		String s1[]= {"One","Two","Three","Four"}; //Approach 2 declare and add values in it
		System.out.println(s1[3]);
		
	
		System.out.println("The length of an a1 array is "+a1.length);             	//find length of an array
		System.out.println("Printed a1 array data using for loop");
		
		for(int i=0; i<=a1.length-1; i++)
		{
			System.out.println(a1[i]);
		}
		
		
		System.out.println("Printed a1 array data in reverse manner using for loop");
		
		for(int j=a1.length-1; j>=0; j--)
		{
			 System.out.println(a1[j]);
		}
	}

}
