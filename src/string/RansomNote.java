package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, 
 * write a function that will return true if the ransom note can be constructed from the magazines ; 
 * otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.

 * You may assume that both strings contain only lowercase letters.
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 
 */
public class RansomNote {

	public static void main(String[] args) {
		String ransom1 = "a", magazine1 = "b";
		Boolean canConstruct1 = canConstruct(ransom1, magazine1);
		
		String ransom2 = "aa", magazine2 = "ab";
		Boolean canConstruct2 = canConstruct(ransom2, magazine2);
		
		String ransom3 = "aa", magazine3 = "aab";
		Boolean canConstruct3 = canConstruct(ransom3, magazine3);
		
		System.out.println(canConstruct1);
		System.out.println(canConstruct2);
		System.out.println(canConstruct3);
	}
	
	public static Boolean canConstruct(String ransom, String magazine) {
		Map<Character, Integer> mapM = new HashMap<Character, Integer>();
		
		for (char charM : magazine.toCharArray()) {
			if (mapM.containsKey(charM)) {
				mapM.put(charM, mapM.get(charM)+1);
			} else {
				mapM.put(charM, 1);
			}
		}
		
		for (char charR : ransom.toCharArray()) {
			if (mapM.containsKey(charR)) {
				mapM.put(charR, mapM.get(charR)-1);
				if (mapM.get(charR) < 0) {
					return false;
				}
			} else {
				return false;
			}
		}
		
		return true;
	}

}
