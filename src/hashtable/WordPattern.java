package hashtable;
import java.util.*;
/**
 * 
 * @author wanmingzhang
 * Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.

Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */
public class WordPattern {

	public static void main(String[] args) {
		String pattern0 = "";
		String str0 = "";
		System.out.println(wordPattern(pattern0, str0));
		
		String pattern1 = "abba";
		String str1 = "dog cat cat dog";
		System.out.println(wordPattern(pattern1, str1));
		
		String pattern2 = "abba";
		String str2 = "dog cat cat fish";
		System.out.println(wordPattern(pattern2, str2));
		
		String pattern3 = "aaaa";
		String str3 = "dog cat cat dog";
		System.out.println(wordPattern(pattern3, str3));
		
		String pattern4 = "abba";
		String str4 = "dog dog dog dog";
		System.out.println(wordPattern(pattern4, str4));
	}

	public static boolean wordPattern(String pattern, String str) {
		if (pattern.isEmpty() && str.isEmpty()) {
			return true;
		}
		
		int len = pattern.length();
		String[] words = str.split("\\s+");
		
/** debug code
//		System.out.println("pattern length " + len);
//		System.out.println("words array length " + words.length);
//		for (String word : words) {
//			System.out.print(word + " ");
//		}
 * 
 */
		if (len != words.length) {
			return false;
		}
		
		Map<Character,String> map = new HashMap<Character,String>();
		for (int i=0; i<len; i++) {
			char charP = pattern.charAt(i);
			
			if (map.containsKey(charP)) {
				String value = map.get(charP);
				if (!value.equals(words[i])) { //charP has been mapped to sth else
					return false;
				}
			}
			else {
				if (map.containsValue(words[i])) { // word has already been mapped
					return false;
				} else {
					map.put(charP, words[i]); // map word to pattern
				}
			}
		}
		return true;
    }
	
}
