package string;
/**
 * 
 * @author wanmingzhang
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. 
 * You may assume the given string consists of lower case English letters only and its length will not exceed 10000.
 
 * Examples1:
 *  Input: "abab"
	Output: True
	Explanation: It's the substring "ab" twice.
	
 * Examples2:
 * Input: "aba"
 * Output: False
 *
 * Examples3:
 * Input: "abcabcabcabc"
 * Output: True
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 * 
 */
public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		String s1 = "aaa";
		String s2 = "abab";
		String s3 = "aba";
		String s4 = "abcabcabcabc";
		//System.out.println(s1.substring(0, 2));
		System.out.println(repeatedSubstringPattern(s1));
		System.out.println(repeatedSubstringPattern(s2));
		System.out.println(repeatedSubstringPattern(s3));
		System.out.println(repeatedSubstringPattern(s4));
	}
	
	public static boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        
        for (int i=1; i<=n/2; i++) { // i= substring length; at most half of original string
            if (n % i == 0) {  
            	int c = n / i; // c copies of substring
            	StringBuilder t = new StringBuilder();
                for (int j = 0; j < c; j++) {
                     String sub = str.substring(0, i);
                     t.append(sub);
                }
               if (t.toString().equals(str)){
            	   System.out.println(t.toString());
            	   return true;
               }
     
            }
        }
        return false;
    }
	

	
}
