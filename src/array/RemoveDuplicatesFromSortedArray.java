package array;
/**
 * @author wanmingzhang
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 * Do not allocate extra space for another array, you must do this in place with constant memory.

 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
		int[] arr1 = {};
		System.out.println(obj.removeDuplicates(arr1));
		int[] arr2 = {1,1};
		System.out.println(obj.removeDuplicates(arr2));
		int[] arr3 = {1,1,2};
		System.out.println(obj.removeDuplicates(arr3));
		int[] arr4 = {1,1,2,3,3};
		System.out.println(obj.removeDuplicates(arr4));
	}
	
	 private int removeDuplicates(int[] nums) {
		 if (nums == null || nums.length == 0) {
			 return 0;
		 }
		 // [1,1,2]
		 int i = 0;
		 for (int j=1; j<nums.length; j++) {
			 if (nums[i] != nums[j]) {
				 nums[++i] = nums[j];
			 }
		 }
		 return i+1;
	 }

}
