package array_concepts;

public class S6A1_findTheLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,14,6,8,88,50,56,60};
		int largno=arr[0];//added first array number into largno
		System.out.println("The list of array elements :");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+", ");
		 if(arr[i]>largno) //comparing array element is larger than first element(largno) if yes
			{
			largno=arr[i];//added the largest value to largno
			}
		}
		
		System.out.println("");
		System.out.println(largno);
		}
		
	}	
      



