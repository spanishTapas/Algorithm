package tree;

import java.util.*;
//import javax.swing.tree.TreeNode;
import javax.swing.tree.*;
/**
 *Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */



public class MaximumDepthOfBinaryTree {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	
	 public int maxDepth(TreeNode root) {
		 if (root == null) {
			 return 0;
		 }
		 if (root.left == null && root.right == null) {
			 return 1;
		 }
		
		 int leftDepth = maxDepth(root.left) + 1;
		 int rightDepth = maxDepth(root.right) + 1;
		 
		 return leftDepth > rightDepth ? leftDepth : rightDepth;
		 
		   
	 }
	

}
