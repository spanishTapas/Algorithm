package array;
/**
 * @author wanmingzhang 
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. 
 * The time complexity must be in O(n).
 * 
 * Input: [2, 2, 3, 1]
 * Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 */
public class ThirdMaximumNumber {

	public static void main(String[] args) {
		ThirdMaximumNumber obj = new ThirdMaximumNumber();
		
		int[] arr1 = {3,2,Integer.MIN_VALUE};
		int[] arr2 = {1,2};
		int[] arr3 = {2,2,3,1,1};
		int[] arr4 = {3,2,1,5,4,6};
		
		System.out.println("Third max nums for arr1 is " + obj.thirdMax(arr1));
		System.out.println("Third max nums for arr2 is " + obj.thirdMax(arr2));
		System.out.println("Third max nums for arr3 is " + obj.thirdMax(arr3));
		System.out.println("Third max nums for arr4 is " + obj.thirdMax(arr4));
	}
	
	private int thirdMax(int[] nums) {
		long max = Long.MIN_VALUE;
		long second = max;
		long third = second;
		
		for (int num : nums) {
			if (num > max) {
				third = second;
				second = max;
				max = num;	
			} else if (second < num && num < max) {
				third = second;
				second = num;
			} else if (third < num && num < second) {
				third = num;
			}
			
		}
		
		if (third == Long.MIN_VALUE) {
			third = max;
		} 
		
		return (int)third;
	}

}
