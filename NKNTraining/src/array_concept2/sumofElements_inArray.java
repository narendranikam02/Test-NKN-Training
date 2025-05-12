package array_concept2;

public class sumofElements_inArray {

	public static void main(String[] args) {
		// FInding the sum of elements in array
		
		int arr[]= {2,4,6,8};
		int sum = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			 sum = sum+arr[i];
			
		}
		System.out.println(sum);
		

	}

}
