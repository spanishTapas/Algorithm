package string;

import java.util.*;

public class ReverseVowelsOfAString {
/**
 * 
 * Write a function that takes a string as input and reverse only the vowels of a string.

 * Example 1:
 * Given s = "hello", return "holle".

 * Example 2:
 * Given s = "leetcode", return "leotcede".

 * Note:
 * The vowels does not include the letter "y".
 */
	public static void main(String[] args) {
		// test case for isVowel method
		System.out.println(isVowel('a'));
		System.out.println(isVowel('e'));
		System.out.println(isVowel('i'));
		System.out.println(isVowel('o'));
		System.out.println(isVowel('u'));
		
		String res = reverseVowels("hEllo");
		System.out.println(res);
		
	}
	
    public static String reverseVowels(String s) {
    	if (s == null) {
    		return s;
    	}
    	
    	char[] sArr = s.toCharArray();
    	
    	int n = s.length();
    	int i = 0;
    	int j = n-1;
    	
    	while (i < j) {
    	
    		if (isVowel(sArr[i]) && isVowel(sArr[j])) {
    			char tmp = sArr[i]; 
            	sArr[i] = sArr[j];
            	sArr[j] = tmp;
            	i++;
            	j--;
    		}
    		else if (!isVowel(sArr[i])) { 
    			i++; 
    		} 
    		else if (!isVowel(sArr[j])){ 
    			j--;
    		}
    		
    	}

    	String result = new String(sArr);
    	return result;
    }
    
    public static boolean isVowel(char c) {
    	ArrayList<Character> vowels = new ArrayList<Character>();
    	vowels.add('A');
    	vowels.add('a');
    	vowels.add('E');
    	vowels.add('e');
    	vowels.add('I');
    	vowels.add('i');
    	vowels.add('O');
    	vowels.add('o');
    	vowels.add('U');
    	vowels.add('u');
    	
    	if (vowels.contains(c)) {
    		return true;
    	}
    		
    	return false;
    }
//    public static boolean isVowel(char c) {
//    	boolean result;
//    	switch(c) {
//    	case 'A':
//			result = true;
//			break;
//		case 'E':
//			result = true;
//			break;
//		case 'I':
//			result = true;
//			break;
//		case 'O':
//			result = true;
//			break;
//		case 'U':
//			result = true;
//			break;
//		case 'a':
//			result = true;
//			break;
//		case 'e':
//			result = true;
//			break;
//		case 'i':
//			result = true;
//			break;
//		case 'o':
//			result = true;
//			break;
//		case 'u':
//			result = true;
//			break;
//		default:
//			result = false;
//			break;
//		}
//		return result;
// 	}
	

}
