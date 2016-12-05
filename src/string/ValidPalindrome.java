package string;
/**
 * @author wanmingzhang
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */

public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome palindrome = new ValidPalindrome();
		String s0 = "";
		System.out.println("An empty string is palindrome is " + palindrome.isPalindrome(s0));
		
		String s1 = "race a car";
		System.out.println("s1 is palindrome is " + palindrome.isPalindrome(s1));

		String s2 = "Hannah";
		System.out.println("s2 is palindrome is " + palindrome.isPalindrome(s2));
		
		String s3 = "A man, a plan, a canal: Panama";
		System.out.println("s3 is palindrome is " + palindrome.isPalindrome(s3));
	}
	
	public boolean isPalindrome(String s) {
		if (s == null || s.isEmpty()) return true;
		
		int n = s.length();
		int i = 0;
		int j = n-1;
		
		while (i < j) {
			char start = s.charAt(i);
			char end = s.charAt(j);
			
			if (isAlphanumeric(start) && isAlphanumeric(end)) {
				if (start != end) {
					return false;
				}
			} 
			else if (!isAlphanumeric(start)) {
				i++;
			} 
			else if (!isAlphanumeric(end)) {
				j--;
			} 	
			i++;
			j--;
		
		}
		return true;
	}
	
//	public boolean isPalindrome(String s) {
//		if (s == null || s.isEmpty()) return true;
//		
//		int n = s.length();
//		int i = 0; 
//		int j = n-1;
//		
//		while (i < j) {
//			char ci = s.charAt(i);
//			char cj = s.charAt(j);
//			
//			if (!isAlphanumeric(ci)) {
//				i++;
//				continue;
//			}
//			if (!isAlphanumeric(cj)) {
//				j--;
//				continue;
//			}
//			
//			if (Character.toLowerCase(ci) != Character.toLowerCase(cj)) {
//				return false;
//			}
//			i++;
//			j--;
//			
//		}	
//		return true;
//	}
	
	public boolean isAlphanumeric(char c) {
		/**
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			return true;
		}
		if (c >= '0' && c <= '9') {
			return true;
		}
		**/
		if (Character.isLetter(c) || Character.isDigit(c)) {
			return true;
		}
		return false;
	}

}
