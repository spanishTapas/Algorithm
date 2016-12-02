package hashtable;
import java.util.*;
/**
 * @author wanmingzhang
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */

public class IsomorphicStrings {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("aa", "ab"));
		System.out.println(isIsomorphic("ab", "aa"));
		
		System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("foo", "bar"));
		System.out.println(isIsomorphic("paper", "title"));
	}
	
	public static boolean isIsomorphic(String s, String t) {
        if (s==null & t==null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character,Character> map = new HashMap<Character,Character>();
        
        for (int i=0; i<s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            }
            else {
                if (map.containsValue(charT)) {
                    return false;
                }
                map.put(charS,charT);
            }
        }
        return true;
    }


}
