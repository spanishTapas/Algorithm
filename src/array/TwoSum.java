package array;
import java.util.*;
/**
 * 
 * @author wanmingzhang
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 */

public class TwoSum {

	public static void main(String[] args) {
		int[] case1 = {2, 7, 11, 15};
		
		int[] result = twoSum(case1, 9);
		System.out.print("[");
		for (int i=0; i<result.length; i++) {
			if (i != result.length-1){
				System.out.print(result[i] + ",");
			} else {
				System.out.print(result[i]);
			}
		}
		System.out.print("]");
	}
	
    public static int[] twoSum(int[] nums, int target) {
        
    	int[] result = new int[2];
    	
    	// construct dictionary
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	
    	for (int i=0; i<nums.length; i++) {
    		int remaining = target - nums[i];
    		
    		if (map.containsKey(remaining)) {
    			result[0] = map.get(remaining);
    			result[1] = i;
    		} else {
    			map.put(nums[i], i);
    		}
    	}
    	
    	return result;    
    }
	
	

}
