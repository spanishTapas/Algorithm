package math;

import java.util.*;

/**
 * 
 * @author wanmingzhang
 * 
  Symbol	I	V	X	L	C	D	M
  Value	    1	5	10	50	100	500	1,000
  
  
	Number		4	9	40	90	400	900
	Notation	IV	IX	XL	XC	CD	CM


 */
public class RomanToInteger {

	public static void main(String[] args) {
		// VIII
		// IX
		
		String S1 = "VIII";
		String S2 = "IX";
		String S3 = "XIX";
		System.out.println(romanToInt(S1));
		System.out.println(romanToInt(S2));
		System.out.println(romanToInt(S3));
	}

	public static int romanToInt(String s) {
		
        String S = s.toUpperCase();
        char[] SArr = S.toCharArray();
        int len = SArr.length;

        int sum = 0;
        int pre = 0;
        
        for (int i=len-1; i>=0; i--) {
        	int curr = romanTable(SArr[i]);
        	if (pre <= curr) {
        		sum += curr;
        	} else {
        		sum -= curr;
        	}
        	pre = curr;
        }
        
      return sum;
        
    } 
	
	public static int romanTable(char c) {
		int num = 0;
		switch(c) {
		case 'I':
			num = 1;
			break;
		case 'V':
			num = 5;
			break;
		case 'X':
			num = 10;
			break;
		case 'L':
			num = 50;
			break;
		case 'C':
			num = 100;
			break;
		case 'D':
			num = 500;
			break;
		case 'M':
			num = 1000;
			break;
		default:
			num = 0;
			break;
		}
		return num;
 	}
	
}
