package array_concepts;

public class S6A1_findTheLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {2,14,6,8,88,50,56};
        String day[]= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int largno=arr[0];//added first array number into largno
		String Higestsaleday= day[0]; //added the day 0 in it
		System.out.println("The day wise sales :");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+",");
		 if(arr[i]>largno) //comparing array element is larger than first element(largno) if yes
			{
			largno=arr[i];//added the largest value to largno
			Higestsaleday=day[i]; //set the day 
			}
		}
		
		System.out.println("");
		System.out.println("The Largest sales day : "+" "+Higestsaleday);
		System.out.println("Amount "+largno);
		}
		
	}	
      



