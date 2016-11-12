package string;

public class ReverseString {
	
	/**
	Write a function that takes a string as input and returns the string reversed.

	Example:
	Given s = "hello", return "olleh".
	**/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = reverseString("Hello");
		System.out.println(result);
	}
	
    public static String reverseString(String s) {
    	String result = "";
    	
    	char[] charArr = s.toCharArray();
    	int count = charArr.length;
    	
    	int lhs = 0;
    	int rhs = count-1;
    	
    	while (lhs < rhs) {
    		char temp = charArr[lhs];
    		charArr[lhs] = charArr[rhs];
    		charArr[rhs] = temp;
    		lhs++;
    		rhs--;
    	}
    	
    	result = new String(charArr);
    	
    	return result;		
    }

}
