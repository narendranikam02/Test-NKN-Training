package array_concepts;

public class Object_array_example {

	public static void main(String[] args) {
		Object studentmarks[][] = {
		    	  {"Name","Maths","Science","English","History"},
		    	  {"Narendra",60,70,80,90},
		    	  {"Anita",80,90,80,90},
		    	  {"Jui",75,85,90,95},
		    	 
		      };
		for(int row1=0;row1<=studentmarks.length-1;row1++)
		  {
			  
			  for(int clm=0;clm<=studentmarks[row1].length-1;clm++) 
			  {
				  System.out.print(" "+studentmarks[row1][clm]);
				  
			  }
			  System.out.println(" ");
			}
		   int getarray = 0;
		   int totalmarks=0;
		  for(int row1=1;row1<=studentmarks.length-1;row1++)
		  {
			  
			  for(int clm=1;clm<=studentmarks[row1].length-1;clm++) 
			  {
				 // System.out.print(" "+studentmarks[row1][clm]);
				  getarray = (Integer) studentmarks[row1][clm];
				  totalmarks=totalmarks+getarray;
				  
			  }
			  
			  System.out.println(" Total Marks : "+studentmarks[row1][0]+totalmarks);
			  
			}
	}

}
