package math;
// Determine whether an integer is a palindrome. Do this without extra space.
// Negative number is not palindrome.

public class PalindromeNumber {

	public static void main(String[] args) {
		PalindromeNumber obj = new PalindromeNumber();
		System.out.println(obj.isPalindrome(-12345));
		System.out.println(obj.isPalindrome(0));
		System.out.println(obj.isPalindrome(11));
		System.out.println(obj.isPalindrome(12));
		System.out.println(obj.isPalindrome(121));
		System.out.println(obj.isPalindrome(122));
		System.out.println(obj.isPalindrome(12321));
	}
	
	private boolean isPalindrome(int x) {
		if (x < 0) 
			return false;
		if (x == 0)
			return true;
		//121
		int tmp = x;
		int y = 0;
		while (x != 0) {
			y = y*10 + (x % 10);
			x = x/10;
		}
		if (y != tmp) {
			return false;
		}
		return true;
	}

}
