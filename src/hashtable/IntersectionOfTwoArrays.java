package hashtable;

import java.util.*;

/**
 * 
 * Given two arrays, write a function to compute their intersection.

 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 */
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
		int[] result = intersection(nums1, nums2);
		for (int num : result) {
			System.out.println(num);
		}
		
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		
		Set<Integer> resultSet = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		for (int num : nums1) {
			set1.add(num);
		}
		
		for (int num : nums2) {
			if (set1.contains(num)) {
				resultSet.add(num);
			}
		}
		int[] result = new int[resultSet.size()];
		int i = 0;
		for (int num : resultSet) {
			result[i] = num;
			i++;
		}
		
		return result;
	}

}
