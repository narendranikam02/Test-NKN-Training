package array_concepts;

public class S7A1_findelement_inArray {

	public static void main(String[] args) {
		// search the element present in array (linear)
		
		int element=1;
		int numberarray[]= {1,3,54,20,23,90};
		boolean statusflag = false;
		/*//for each loop
		
		for(int x:numberarray)
		{
			if(element==x)
			{
				statusflag=true;
				System.out.println("Element found");
				break;
			}
		}*/
		
		
		
		
		for(int getarrayelement=0;getarrayelement<=numberarray.length-1;getarrayelement++)
		{
			if(element==numberarray[getarrayelement])
			{
				statusflag=true;
				System.out.println("Element found");
				break;
			}
		}
		if(statusflag==false) 
		{
		System.out.println("Element not found");
		
		}
	}

}
