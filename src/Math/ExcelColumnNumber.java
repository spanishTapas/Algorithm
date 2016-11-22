package math;
import java.util.*;

/**
 * 
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 *
 */
public class ExcelColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("A"));
		System.out.println(titleToNumber("B"));
		System.out.println(titleToNumber("AA"));
		System.out.println(titleToNumber("AB"));
		System.out.println(titleToNumber("AAA"));
	}
	
	public static int titleToNumber(String s) {
		int result = 0;
		char[] sArr = s.toLowerCase().toCharArray();
		
		Map<Character,Integer> map = letterNumberMap();
		int i = sArr.length-1;
		int t = 0;
		
		System.out.println(sArr);
		
		while (i>=0) {
			if (map.containsKey(sArr[i])){
				int curr = map.get(sArr[i]);
				int factor = (int) Math.pow(26, t);	
				result = result + curr * factor ;
				i--;
				t++;
			}
		}
		
        return result;
    }
	
	public static Map<Character,Integer> letterNumberMap() {
		char c = 'a';
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for (int i=1; i<=26; i++) {
			map.put(c, i);
			c += 1;
		}

		return map;
	}
	

}
