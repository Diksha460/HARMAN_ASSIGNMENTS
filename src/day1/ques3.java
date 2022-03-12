package day1;

import java.util.Arrays;

class ArrayOp{
	
	public static int[] copyOf(int[] array) {
		return Arrays.copyOf(array, array.length);
	}
	
}

public class ques3 {
	
	public static void main(String[] args) {

			int arr[]= {4,5,6,7,67};
			
			int copyOfArr[]=ArrayOp.copyOf(arr);
			for(int i=0;i<5;i++)
				  System.out.println(copyOfArr[i]);
		}
	
}

