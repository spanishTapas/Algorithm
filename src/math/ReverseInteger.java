package math;
/**
 * 
 * @author wanmingzhang
 * Reverse digits of an integer.

 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

	public static void main(String[] args) {
		ReverseInteger aReversed = new ReverseInteger();
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 10;
		int num4 = 12;
		int num5 = 120;
		int num6 = 123;
		int num7 = -123;
		
		System.out.println("reversed num1 = " + aReversed.reverse(num1));
		System.out.println("reversed num2 = " + aReversed.reverse(num2));
		System.out.println("reversed num3 = " + aReversed.reverse(num3));
		System.out.println("reversed num4 = " + aReversed.reverse(num4));
		System.out.println("reversed num5 = " + aReversed.reverse(num5));
		System.out.println("reversed num6 = " + aReversed.reverse(num6));
		System.out.println("reversed num7 = " + aReversed.reverse(num7));
	}
	
	public int reverse(int x) {
		int reversed = 0;
		while (x != 0) {
			int tmp = reversed * 10 + (x % 10);
			x = x / 10;
			if (tmp / 10 != reversed) { // handles integer overflow
				reversed = 0;
				break;
			}
			reversed = tmp;
		}
        return reversed;
    }

}
