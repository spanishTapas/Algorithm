package tree;

/**
 * 
 * @author wanmingzhang
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

 * According to the definition of LCA on Wikipedia: ÒThe lowest common ancestor is defined between two nodes v and w 
 * as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).Ó
 
        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2       0       8
         /  \
         7   4
 */

public class LowestCommonAncester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	if (root == null) {
		return null;
	}
	if (root == p || root == q) {
		return root;
	}
	
	TreeNode l = lowestCommonAncestor(root.left, p, q);
	TreeNode r = lowestCommonAncestor(root.right, p, q);
	
	if (l != null && r != null) {
		return root;
	} else if (l == null && r == null) {
		return null;
	} else {
		return l == null ? r : l;
	}
	
}

}
