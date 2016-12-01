package array;
import java.util.*;
/**
 * @author wanmingzhang
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

Try two pointers.
Did you use the property of "the order of elements can be changed"?
What happens when the elements to remove are rare?
 */
public class RemoveElement {

	public static void main(String[] args) {
		int[] nums1 = {2,2,2,3,1};
		int[] nums2 = {3,2,2,3};
		
		int res = removeElement(nums1, 3);
		for (int num : nums1) {
			System.out.print(num + " ");
		}
		System.out.println("result = " + res);
		
		int res2 = removeElement(nums2, 3);
		for (int num : nums2) {
			System.out.print(num + " ");
		}
		System.out.println("result = " + res2);
		
	}

	public static int removeElement(int[] nums, int val) {
		if (nums == null) {
			return 0;
		}
		int i = 0;
		// [3,2,2,3]
		for (int j=0; j<nums.length; j++) {
			if (nums[j] != val) { 
				nums[i] = nums[j];
				i++;
			}
		}
		
		int remaining = i;
		while (remaining < nums.length) {
			nums[remaining++] = 0;
		}
		
		return i;
	}
	
//	public static int removeElement(int[] nums, int val) {
//		if (nums == null) {
//			return 0;
//		}
//		int len = nums.length;
//		int i = 0;
//		while (i < len) {
//			if (nums[i] == val) {
//				nums[i] = nums[len-1]; // swap with last element in the array
//				len--; // decrease array size by 1
//			} else {
//				i++;
//			}
//		}
//		return len; // return the new length
//	}

}
