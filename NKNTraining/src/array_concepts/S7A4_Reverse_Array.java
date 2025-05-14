package array_concepts;

import java.util.Arrays;

public class S7A4_Reverse_Array {

	public static void main(String[] args) {
		//Print array in reverse order
		int numberarray[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The Given array "+Arrays.toString(numberarray));
		System.out.println("Reverse array:");
		for(int getarrayelement=numberarray.length-1;getarrayelement>=0;getarrayelement--)
		{
			
			System.out.println(numberarray[getarrayelement]);
		}
	}

}
