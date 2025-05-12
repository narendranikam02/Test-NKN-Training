package array_concepts;

public class twodimensional_array {

	public static void main(String[] args) {
		/* two dimensional array
		 * 1) How to declare an array
		 * 2) Add values to an array
		 * 3) Read single value from an array
		 * 4) Read multiple values from an array
		 *  Int a[row][column] = new int[size of an array];
			a[0][0]=1;
			a[0][1]=2;
			a[1][0]=3;
			a[1][1]=4;
		*/
		//Approach 1 
		int a[][] = new int[3][2];
		a[0][0]=11;
		a[0][1]=12;
		
		a[1][0]=21;
		a[1][1]=22;
		
		a[2][0]=31;
		a[2][1]=32;
		
		System.out.println("No.of Rows in 'a' array : "+a.length);
		System.out.println("No.of Columns in'a' array : "+a[0].length);
		System.out.println(a[1][0]+" and "+a[1][1]);
		
		
		
		
		
		System.out.println("_______________Normal for loop_______________________");
		
		for(int row1=0;row1<=a.length-1;row1++)
		{
			for(int col1=0; col1<=a[row1].length-1;col1++)
			{
				//System.out.println("inner loop prints column");
				System.out.print(a[row1][col1]+"              ");
			}
			System.out.println();
			//System.out.println("outer loop prints row "+row1);
		}
		System.out.println("------------------Normal for loop print reverse---------------------------");
		for(int row1=a.length-1;row1>=0;row1--)
		{
			for(int col1=0; col1<=a[row1].length-1; col1++)
			{
				//System.out.println("inner loop prints column");
				System.out.print(a[row1][col1]+"               ");
				//System.out.print("Revese");
			}
			System.out.println();
			//System.out.println("outer loop prints row "+row1);
		}
		
		
		
		
		
		
		
			
		
		
		/*	for (int row=0; row<=2; row++) 
		{
			for (int clm=0; clm<=1; clm++) 
			{
				System.out.println(a[row][clm]);
			}
			
		}*/
		//Approach 2 
				int a1[][] = {
								{111,112},
								{211,212},
								{311,312},
						
				};
				
				System.out.println("_________Normal for loop_____________________________");


				for (int row=0; row<=2; row++) 
				{
					for (int clm=0; clm<=1; clm++) 
					{
						System.out.println(a1[row][clm]);
					}		
			}
				System.out.println("_________for each loop_____________________________");
				for(int arr[]:a) 
				{
					for(int x:arr)
					{
						System.out.print(x+"              ");
					}
					System.out.println();
				}
	
	}
	
}

