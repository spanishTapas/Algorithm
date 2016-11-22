package math;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 * For example:

 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * digital root
 * dr(n)= n-9\left\lfloor {\frac  {n-1}{9}}\right\rfloor .
 
 */
public class DigitalRoot {

	public int addDigits(int num) {
		int factor = (int) Math.floor((num-1)/9);
		
		return num - 9 * factor;
        
    }
	
}
