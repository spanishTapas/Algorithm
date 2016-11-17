package tree;
/**
 * @author wanmingzhang
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

 * According to the definition of LCA on Wikipedia: ÒThe lowest common ancestor is defined between two nodes v and w 
 * as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant 
 * of itself).Ó
 * 
 *      _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
 */

public class LCABST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
        	return null;
        }
        if (root.val > p.val && root.val > q.val) {
        	return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
        	return lowestCommonAncestor(root.right, p, q);
        } else {
        	return root;
        }
        
    }

}
