package hashtable;
import java.util.*;
/**
 * 
 * @author wanmingzhang
 * Given a string which consists of lower case or upper case letters, find the length of the longest palindrome that can be built with those letters.

 * This is case sensitive, for example "Aa" is not considered a palindrome here.

 * Note:
 * Assume the length of given string will not exceed 1,010.

 * Example:
 * Input: "abccccdd"

   Output: 7

   Explanation:
   One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "abccccdd";
		System.out.println(longestPalindrome(s));
	}
	
	public static int longestPalindrome(String s) {
		int result = 0;
		char[] sArr = s.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (char charS : sArr) {
			if (map.containsKey(charS)){
				map.put(charS, map.get(charS)+1);
			} else {
				map.put(charS, 1);
			}
		}
		int additional = 0;
		for (char charS : map.keySet()) {
			if (map.get(charS) % 2 == 0) {
				result += map.get(charS);
			} else {
				result += map.get(charS) - 1;
				additional = 1;
			}
		}
		
		return result + additional;
	}

}
