package tree;
/**
	* Find the sum of all left leaves in a given binary tree.

    3
   / \
  9  20
    /  \
   15   7
   
   * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
**/

public class SumOfLeftLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public int sumOfLeftLeaves(TreeNode root) {
		int sum = 0;
		if (root == null) {
			return 0;
		}
		else if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				sum += root.left.val;
			}
		}
		sum = sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
		
		return sum;
	}

}
