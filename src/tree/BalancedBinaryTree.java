package tree;
/**
 * @author wanmingzhang
 * Given a binary tree, determine if it is height-balanced.

 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *       3
      /     \
     9       20
   /   \    /  \
  2	    6   15   7
 */
public class BalancedBinaryTree {

	public static void main(String[] args) {
		// Test cases for height method

		// Construct tree
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		
		TreeNode node2 = new TreeNode(2);
		TreeNode node6 = new TreeNode(6);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);
		
		node3.left = node9;
		node3.right = node20;
		
		node20.left = node15;
		node20.right = node7;
		node9.left = node2;
		node9.right = node6;
		
		BalancedBinaryTree obj = new BalancedBinaryTree();
		
		System.out.println(obj.height(node3));
		System.out.println(obj.height(node9));
		System.out.println(obj.height(node2));
		
		System.out.println(obj.maxDepth(node3));
		System.out.println(obj.maxDepth(node9));
		System.out.println(obj.maxDepth(node2));
		
		System.out.println(obj.isBalanced(node3));
		System.out.println(obj.isBalanced(node9));
		System.out.println(obj.isBalanced(node2));
		
	}
	
//	public boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        if (root.left == null && root.right == null) {
//            return true;
//        }
//       
//        int leftSub = height(root.left);
//        int rightSub = height(root.right);
//        
//        if (Math.abs(leftSub - rightSub) > 1) {
//            return false;
//        }
//        if (!isBalanced(root.left) || !isBalanced(root.right)) {
//        	return false;
//        }
//        return true;
//    }
	
	/* Compute the "height" of a tree -- the number of nodes along the longest path from the root node
    down to the farthest leaf node.*/
	
	public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = height(root.left);
        int right = height(root.right);
        
        return (left > right) ? left + 1 : right + 1;
    }
	
	// Optimization
	public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        // if left or right subtree is not balanced, early return false (-1)
        if (left == -1 || right == -1 || Math.abs(left-right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }

}
