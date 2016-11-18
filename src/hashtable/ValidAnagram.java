package hashtable;
import java.util.*;
/**
 * @author wanmingzhang
 * Given two strings s and t, write a function to determine if t is an anagram of s.

	For example,
	s = "anagram", t = "nagaram", return true.
	s = "rat", t = "car", return false.
	
	Note:
	You may assume the string contains only lower case alphabets.
 */


public class ValidAnagram {

	public static void main(String[] args) {
		//String s = "anagram", t = "nagaram";
		String s = "rat", t = "car";
		System.out.println(isAnagram(s,t));

	}
	public static boolean isAnagram(String s, String t) {
		
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        for (char charS : sArr) {
            if (map.containsKey(charS)) {
                map.put(charS, map.get(charS)+1);
            } else {
                map.put(charS,1);
            }
        }
        
        for (char charT : tArr) {
            if (map.containsKey(charT)) {
                map.put(charT, map.get(charT)-1);
                if (map.get(charT) == 0) {
                    map.remove(charT);
                }
                
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }
	

}
