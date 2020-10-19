package numbers;

import java.util.Arrays;

/**
 * 
 * @author Marcel
 * Given an array of numbers arr. A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 * Return true if the array can be rearranged to form an arithmetic progression, otherwise, return false.
 */
public class CanMakeArithmeticProgression {
	public boolean canMakeArithmeticProgression(int[] arr) {
		
		if (arr.length == 2) {
			return true;
		}
		Arrays.sort(arr);
		int diff = arr[1] - arr[0] ;
		for (int i = 1; i < arr.length -1 ; i++) {
			if (arr[i+1] - arr[i] != diff)
				return false;
		}
		
		return true;
	}
}
