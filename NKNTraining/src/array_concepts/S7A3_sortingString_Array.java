package array_concepts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class S7A3_sortingString_Array {

	public static void main(String[] args) {
		//sort string array
		String Stringarray[]= {"One","Two","Four","Five"};
		System.out.println("Before Sorting");		
		System.out.println(Arrays.toString(Stringarray));
		Arrays.sort(Stringarray);
		System.out.println("After Sorting");	
		System.out.println(Arrays.toString(Stringarray));
	}


}
