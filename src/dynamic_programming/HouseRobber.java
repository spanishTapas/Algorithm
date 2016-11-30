package dynamic_programming;
import java.math.*;
/**
 * @author wanmingzhang
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected 
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.

 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */

public class HouseRobber {

	public static void main(String[] args) {
		int[] a0 = {};
		int[] a1 = {0};
		int[] a2 = {0,1};
		int[] a3 = {0,1,2};
		int[] a4 = {2,1,1,2};
		int[] a5 = {1,3,5,4,6};
		
		System.out.println("a0 = " + rob(a0));
		System.out.println("a1 = " + rob(a1));
		System.out.println("a2 = " + rob(a2));
		System.out.println("a3 = " + rob(a3));
		System.out.println("a4 = " + rob(a4));
		System.out.println("a5 = " + rob(a5));
	}

	public static int rob(int[] nums) {
		int n = nums.length;
		
		if (nums == null || n == 0) {
			return 0;
		}
		
		int rob1 = 0, rob2 = nums[0], max = nums[0];
		
		for (int i=1; i<n; i++) {
			max = Math.max((rob1 + nums[i]), rob2);
			rob1 = rob2;
			rob2 = max;
		}
		
		return max;
	}

	
	
}
