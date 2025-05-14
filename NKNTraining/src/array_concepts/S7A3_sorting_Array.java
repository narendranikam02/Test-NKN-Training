package array_concepts;

import java.util.Arrays;

public class S7A3_sorting_Array {

	public static void main(String[] args) {
		int numberarray[]= {1,3,54,25,20,90};
		System.out.println("Before Sorting");		
		System.out.println(Arrays.toString(numberarray));
		Arrays.sort(numberarray);
		System.out.println("After Sorting");	
		System.out.println(Arrays.toString(numberarray));
	}

}
