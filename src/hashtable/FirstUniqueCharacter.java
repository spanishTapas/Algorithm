package hashtable;
import java.util.*;
/**
 * 
 * @author wanmingzhang
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

	Examples:

	s = "leetcode"
	return 0.

	s = "loveleetcode",
	return 2.
 */
public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int firstUniqChar(String s) {
		
        char[] sArr = s.toCharArray();
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (char charS : sArr) {
            if (map.containsKey(charS)) {
                map.put(charS, map.get(charS)+1);
            } else {
                map.put(charS,1);
            }
        }
        
        for (int i=0; i<sArr.length; i++) {
        	if (map.get(sArr[i]) == 1){
        		return i;
        	}
        }
        
        return -1;
        
    }
}
