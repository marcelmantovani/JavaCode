package numbers;

/**
 * 
 * @author Marcel
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
        if (x < 0) return false;
		
		int UPPERLIMIT = 31;
		long compareTo = 0;
		long tempX = x;
        long calc = 0;
        long newNumberPow = 0;
		
		for (int i = UPPERLIMIT; i >= 0 ; i --) {
			double power = Math.pow(10, i);
			if (tempX >= power || newNumberPow > 0 ) {
				calc = (int) (tempX / power);
                System.out.println("cacl :" + calc + " adding :" + calc * Math.pow(10, newNumberPow));
                
                compareTo += calc * Math.pow(10, newNumberPow)  ;
				tempX -= (calc * power);
                newNumberPow++;
                System.out.println("power :" + power +" compareTo :" + compareTo + " tempX :" + tempX + " i: " + i);
			}
		}
        
        return x == compareTo ? true : false;
    }
}
