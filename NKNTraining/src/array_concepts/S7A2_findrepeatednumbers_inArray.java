package array_concepts;

public class S7A2_findrepeatednumbers_inArray {

	public static void main(String[] args) {
		// find the no.of times the given no. is repeated in array
		int numberarray[]= {1,3,54,20,20,90};
		int count = 0;
		int number=20;
		
		
		for(int getarrayelement=0;getarrayelement<=numberarray.length-1;getarrayelement++)
		{
			if(number==numberarray[getarrayelement])
			{
				count++;
								
			}
		}
		System.out.println(number+" is repeated "+ count+" times");
		
	}

}
