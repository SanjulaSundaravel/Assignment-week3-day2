package Assignment.week3;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		System.out.print(Arrays.toString(data));
		
		int size = data.length;
		int res = data[size-2];
	      System.out.println("2nd largest element is "+res);
	}

}
