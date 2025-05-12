package array_concept1;

public class evenodd_fromarray {

	public static void main(String[] args) {
		// find the given number is even /odd number and show no.of even and odd numbers from array
		int arr1[]= {1,2,3,4,5,6,7,8,9,11,10};
		int evenno= 0;
		int oddno= 0;

		System.out.println("Find the number is even /odd number and show no.of even and odd numbers from array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]%2==0)
			{
				System.out.println("This is even number "+arr1[i]);
				evenno++;
			}
			
			else
			{
				System.out.println("This is odd number "+arr1[i]);
				oddno++;
			}
			
			
		}
		System.out.println("no of Even numbers "+evenno);
		System.out.println("no of Odd numbers"+oddno);
	}

}
