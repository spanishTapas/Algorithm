package array;
import java.util.*;
public class ContainsDuplicate {

	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(containsDuplicate(arr));
	}
	

	public static boolean containsDuplicate(int[] nums) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num)+1);
				return true;
			} else {
				map.put(num,1);
			}
		}
		return false;
	}
}
