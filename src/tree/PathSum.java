package tree;

public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	
	
}
