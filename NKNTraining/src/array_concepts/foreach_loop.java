package array_concepts;

public class foreach_loop {

	public static void main(String[] args) {
		/* for each loop
		   for(Int variable : array)
			{
			statements;
			}
		 */
		
		int narendra[][]= {
				{1,11},
				{2,22},
				{3,33},
				{4,44},
				{5,55},
				{7,77},
				{7,73},
				};
		//int narendra =10;
		for (int[] rowvariablename : narendra) {
		    for (int columnvariablename : rowvariablename) {
		        System.out.print(columnvariablename+", ");
		        
		    }
		    System.out.println();
		}
		
		
		
		
	}
	}


