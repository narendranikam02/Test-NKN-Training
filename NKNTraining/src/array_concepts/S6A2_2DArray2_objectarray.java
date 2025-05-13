package array_concepts;

public class S6A2_2DArray2_objectarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Object studentmarks[][] = {
		    	  {"Name","Maths","Science","English","History"},
		    	  {"Narendra",60,70,80,90},
		    	  {"Anita",80,90,80,90},
		    	  {"Jui",75,85,90,95},
		    	 
		      };
		
		 for(int row1=0;row1<=studentmarks.length-1;row1++)
		 {
			 for(int col1=0;col1<=studentmarks[row1].length-1;col1++)
			 {
				 
				 System.out.print(studentmarks[row1][col1]+" ");
			 }
			 	 System.out.println("");
			 	 
		 }
		 System.out.println("------------------");
		 
		 int totalsum=0;
		 int sum =0;
		 for(int r1=1;r1<=studentmarks.length-1;r1++)
		 {
			 for(int c1=1;c1<=studentmarks[r1].length-1;c1++)
			 {
			 
			  totalsum = (Integer) studentmarks[r1][c1];
			  sum=sum+totalsum;
			 }
			 System.out.println("Total Marks of "+studentmarks[r1][0]+"= "+sum);
	}

}
}
