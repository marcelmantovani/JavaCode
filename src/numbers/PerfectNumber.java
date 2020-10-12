package numbers;
/**
 * 
 * @author Marcel
 * A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. 
 * A divisor of an integer x is an integer that can divide x evenly.
 * Given an integer n, return true if n is a perfect number, otherwise return false.
 * 
 * Explanation: 28 = 1 + 2 + 4 + 7 + 14 
 *  1, 2, 4, 7, and 14 are all divisors of 28.
 */
public class PerfectNumber {
	
	public boolean checkPerfectNumber(int num) {
		
		int i = 1;
		int sumOfDivisors = 0;
		
		while (i < num) {
			if (num % i == 0) {
				sumOfDivisors += i;
				if (sumOfDivisors > num) {
					return false;
				}
				
			}
			
			i ++;
		}
		if (sumOfDivisors == num) {
			return true;
		}else {
			return false;
		}
	}

}
