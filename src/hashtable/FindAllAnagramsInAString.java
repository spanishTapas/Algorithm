package hashtable;
import java.util.*;
/**
 * @author wanmingzhang
 * 
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

 * The order of output does not matter.
 * 
 * Input:
   	s: "cbaebabacd" p: "abc"

   Output:
    [0, 6]

 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * 
 */
public class FindAllAnagramsInAString {

	public static void main(String[] args) {
		FindAllAnagramsInAString obj = new FindAllAnagramsInAString();
		
		/* test cases for isAnagram method */
		System.out.println(obj.isAnagram("cba", "ab"));
		System.out.println(obj.isAnagram("cba", "abc"));
		System.out.println(obj.isAnagram("bac", "abc"));
		System.out.println(obj.isAnagram("cba", "aba"));
		
		List<Integer> result = obj.findAnagrams("cbaebabacd", "abc");
		obj.printList(result);
	}
	
	private void printList(List<Integer> list) {
		System.out.print("[");
		for (int ele : list) {
			System.out.print(ele + ",");
		}
		System.out.print("]");
	}
	
    private List<Integer> findAnagrams(String s, String p) {
    	List<Integer> result = new ArrayList<Integer>();
    	if (s.isEmpty() || p.isEmpty())
    		return result;
    	if (s.length() < p.length())
    		return result;
    	
    	int len = p.length();
    	for (int i = 0; i+len-1 < s.length(); i++){
    		String sub = s.substring(i,i+len);
    		System.out.println("sub = " + sub);
    		if (this.isAnagram(sub, p)){
    			result.add(i);
    		}
    	}
    	
    	return result;

    }

    private boolean isAnagram(String s, String t) {
    	if (s.length() != t.length()) 
    		return false;
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
