package array;
import java.util.*;
/**
 * 
 * @author wanmingzhang
 * Given two arrays, write a function to compute their intersection.

 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 */
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = {2, 2, 3};
		int[] nums2 = {1, 2, 2, 1, 3, 3};
		
		int[] result = intersectionOfTwoArrays(nums1,nums2);
		for (int num : result) {
			System.out.println(num);
		}
	}
	
	public static int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
		if (nums1 == null && nums2 == null) {
			return null;
		}
		
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		
		for (int num1 : nums1) {
			if (map1.containsKey(num1)){
				map1.put(num1, map1.get(num1)+1);
			} else {
				map1.put(num1, 1);
			}
		}
		
		List<Integer> resultList = new ArrayList<Integer>();
		
		for (int num2 : nums2) {
			if (map1.containsKey(num2)) {
				map1.put(num2,map1.get(num2)-1);
				resultList.add(num2);
				if (map1.get(num2) <= 0) {
					map1.remove(num2);
				}
			}
		}
		int size = resultList.size();
		int[] resultArr = new int[size];
		int index = 0;
		for (int num : resultList) {
			resultArr[index++] = num;
		}
		
		return resultArr;
		
	}
	

}
