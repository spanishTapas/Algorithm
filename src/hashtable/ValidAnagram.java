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
		ValidAnagram obj = new ValidAnagram();
		
		System.out.println(obj.isAnagram("rat","car"));
		System.out.println(obj.isAnagram("anagram","nagaram"));

	}
	
	private boolean isAnagram(String s, String t) {
		if (s == null || t == null) 
			return false;
		if (s.length() != t.length()) 
			return false;
		
		int[] arr = new int[26];
		
		for (int i=0; i<s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
			arr[t.charAt(i) - 'a']--;
		}
		for (int element : arr) {
			System.out.print(element + " ");
		}
		for (int element : arr) {
			if (element != 0) 
				return false;
		}		
		return true;	
	}
	
	/* this works but runs slower */
//	private boolean isAnagram(String s, String t) {
//		
//        Map<Character,Integer> map = new HashMap<Character,Integer>();
//        
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//        
//        for (char charS : sArr) {
//            if (map.containsKey(charS)) {
//                map.put(charS, map.get(charS)+1);
//            } else {
//                map.put(charS,1);
//            }
//        }
//        
//        for (char charT : tArr) {
//            if (map.containsKey(charT)) {
//                map.put(charT, map.get(charT)-1);
//                if (map.get(charT) == 0) {
//                    map.remove(charT);
//                }
//                
//            } else {
//                return false;
//            }
//        }
//        return map.isEmpty();
//    }
	

}
