package hashtable;
import java.util.*;


/**
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class SingleNumber {

	public static void main(String[] args) {
		int[] arr1 = {0};
		int[] arr2 = {0,0,1};
		int[] arr3 = {0,0,1,1,2};
		System.out.println(singleNumber(arr1));
		System.out.println(singleNumber(arr2));
		System.out.println(singleNumber(arr3));
	}
	
    public static 
    int singleNumber(int[] nums) {
    	int result = 0;
    	Map<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
    	
    	for (int i : nums) {
    		//int occurrence = 0;
    		Integer key = i;
    		if (dictionary.containsKey(key)) {
    			//occurrence = dictionary.get(key);
    			//dictionary.put(key, occurrence + 1);
    			dictionary.remove(key);
    		} else {
    			dictionary.put(key,1);
    		}
    	}
    	
    	for (Integer key : dictionary.keySet()) {
    		if (dictionary.get(key) == 1) {
    			result = key;
    		}
    	}
    	return result;
    }
}
