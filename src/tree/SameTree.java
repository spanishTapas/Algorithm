package tree;
/**
 * 
 * Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.


 *
 */
public class SameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) { // both empty
			return true;
		} else if (p != null && q != null) { // both non-empty
			return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		} else { // only one empty
			return false;
		}
	}
}
