package arrays;

/**
 * 
 * @author Marcel Given a fixed length array arr of integers, duplicate each
 *         occurrence of zero, shifting the remaining elements to the right.
 */
public class DuplicateZeroes {
	public void duplicateZeros(int[] arr) {

		/*
		 * Loop over the array and check if current pos == 0 if yes set swapping to true
		 * 
		 */
		int swap = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				if (i+1 >= arr.length)
                    continue;
				int temp = arr[i + 1];
				swap = 0;
				for (int j = i + 1; j < arr.length; j++) {
					temp = arr[j];
					arr[j] = swap;
					swap = temp;
				}
				i++;
			}
		}
	}
}
