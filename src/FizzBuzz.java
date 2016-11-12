import java.util.*;

public class FizzBuzz {
/**
Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. 
For numbers which are multiples of both three and five output “FizzBuzz”.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> results = fizzBuzz(15);
				
		for (String result : results) {
			System.out.println(result);
		}
	}
	
	public static List<String> fizzBuzz(int n) {
		List<String> results = new ArrayList<String>();
		
		for (int i=1; i<=n; i++) {
			String s = Integer.toString(i);
			
			if (i % 15 == 0) {
				s = "FizzBuzz";
			} else if (i % 3 == 0) {
				s = "Buzz";
			} else if (i % 5 == 0) {
				s = "Fizz";
			}
			
			results.add(s);
		}
		return results;
	}

	
	

}
