package array_concepts;

public class Anita_array_forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {11,2,3,64,5,6,47,88,9,11};
		
		int biggerNum=311;
		
		int a=10;
		int b=56;
		int c=88;
		int d=50;
		if(a<b && b>c && b>d) //b 
		{
			System.out.println("b is greator no");
		}
		else if(a>b && a>c && a>d)
		{
			System.out.println("a is greator no");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("c is greator no");
		}
		else 
		{
			System.out.println("d is greator no");
		}
		
					
		for(int i=0;i<=number.length-1;i++)
		{		
		   if(number[i]==biggerNum)
		   {
			   System.out.println(biggerNum+" is present is array"); 
			   break;
		   }
		       
		  }
		System.out.println("not present");//System.out.println("This is bigger no "+biggerNum); 
	}

}
