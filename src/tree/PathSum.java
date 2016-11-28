package tree;

import java.util.*;

public class PathSum {
/**
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
**/
	public static void main(String[] args) {
		// Construct tree
		TreeNode node7 = newNode(7);
		TreeNode node2 = newNode(2);
		TreeNode node11 = newNode(11);
		
		TreeNode node4a = newNode(4);
		TreeNode node5 = newNode(5);
		
		TreeNode node1 = newNode(1);
		TreeNode node5a = newNode(5);
		TreeNode node4b = newNode(4);
		TreeNode node13 = newNode(13);
		TreeNode node8 = newNode(8);
		
		node5.left = node4a;
		node5.right = node8;
		
		node4a.left = node11;
		node8.left = node13;
		node8.right = node4b;
		
		node11.left = node7;
		node11.right = node2;
		node4b.left = node5a;
		node4b.right = node1;
		
		 printTree(node5);
		 System.out.println();
		 
		 List<List<Integer>> result = pathSumII(node5, 22); 
		 System.out.println("path sum II: " + result.size() + " paths.");
		 for (List<Integer> path : result) {
			 System.out.print("[");
			 for (int num : path) {
				 
				 System.out.print(num + ",");
			 }
			 System.out.print("]");
		 }
		 
	}
	
	// print inorder
	private static void printTree(TreeNode node) {
	 if (node == null) return;
	 // left, node itself, right
	 printTree(node.left);
	 System.out.print(node.val + "  ");
	 printTree(node.right);
	}
	

	/*
	 Helper function that allocates a new node
	 with the given data and NULL left and right
	 pointers.
	 */
	public static TreeNode newNode(int data) {
	  TreeNode node = new TreeNode(data);
	  node.left = null;
	  node.right = null;
	  return node;
	}
	
	/**
	 * PathSum
	 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

	 * For example:
	 * Given the below binary tree and sum = 22,
	 * 
	 *        5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
        
        return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
        
	 */
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		
		if (root.left == null && root.right == null) {
			return (root.val == sum);
		} else {
			return hasPathSum(root.left, (sum-root.val)) || hasPathSum(root.right, (sum-root.val));
		}
	}
	
	/**
	 * Path Sum III
	 * You are given a binary tree in which each node contains an integer value.

	 * Find the number of paths that sum to a given value.

	 * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

	 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
	 * 
	 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      	 10
     	/  \
    	5   -3
   	   / \    \
  	  3   2   11
 	 / \   \
	3  -2   1

	Return 3. The paths that sum to 8 are:

	1.  5 -> 3
	2.  5 -> 2 -> 1
	3. -3 -> 11
	 */
	
	public int pathSum(TreeNode root, int sum) {
		if (root == null) {
			return 0;
		}
		
		// Calculate path numbers using helper function
		int rootPaths = helper(root, 0, sum); 
		
		// Calculate left and right sub trees
		return rootPaths + pathSum(root.left, sum) + pathSum(root.right, sum); 
	}
	
	// helper function
	public int helper(TreeNode node, int preSum, int sum) {
		if (node == null) {
			return 0;
		}
		int rootPath = 0;
		int currSum = preSum + node.val;
		if (currSum == sum) {
			rootPath += 1;
		}
		
		return rootPath + helper(node.left, currSum, sum) + helper(node.right, currSum, sum); 
	}
	
	/**
	 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

	 * For example:
     * Given the below binary tree and sum = 22,
     *        5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
       
    return 
    [
   		[5,4,11,2],
   		[5,8,4,5]
	]
	 */
	
    public static List<List<Integer>> pathSumII(TreeNode root, int sum) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<Integer> path = new ArrayList<Integer>();
    	pathSumHelper(result, path, root, sum);
    	return result;
    }
	
    public static void pathSumHelper(List<List<Integer>> result, List<Integer> path, TreeNode root, int sum){
       
    	if (root == null) {
    		return;
    	}
    	sum = sum - root.val;
    	
    	if (root.left == null && root.right == null) {
    		if (sum == 0) {
    			path.add(root.val);
    			result.add(new ArrayList<Integer>(path));
    			path.remove(path.size()-1);
    		}
    	}
    	
    	path.add(root.val);
    	pathSumHelper(result, path, root.left, sum);
    	pathSumHelper(result, path, root.right, sum);
    	path.remove(path.size()-1);
    }
	
}
