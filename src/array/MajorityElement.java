package array;
import java.util.*;
/**
 * 
 * @author wanmingzhang
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 *You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

	public static void main(String[] args) {
	   int[] nums = {1,2,2};
		int majority = majorityElement(nums);
		System.out.println(majority);
	}
	
	public static int majorityElement(int[] nums) {
		int result = nums[0];
		int n = nums.length;
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			} else {
				map.put(num, 1);
			}
		}
		
		for (int num : nums) {
			if (map.get(num) >= n/2) {
				result = num;
			}
		}
		return result;
	}

}
