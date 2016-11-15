package Math;
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
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('d', 4);
		map.put('e', 5);
		map.put('f', 6);
		map.put('g', 7);
		map.put('h', 8);
		map.put('i', 9);
		map.put('j', 10);
		map.put('k', 11);
		map.put('l', 12);
		map.put('m', 13);
		map.put('n', 14);
		map.put('o', 15);
		map.put('p', 16);
		map.put('q', 17);
		map.put('r', 18);
		map.put('s', 19);
		map.put('t', 20);
		map.put('u', 21);
		map.put('v', 22);
		map.put('w', 23);
		map.put('x', 24);
		map.put('y', 25);
		map.put('z', 26);
		return map;
	}
	

}
