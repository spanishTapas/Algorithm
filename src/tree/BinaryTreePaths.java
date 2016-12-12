package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanmingzhang
 * Given a binary tree, return all root-to-leaf paths.

 * For example, given the following binary tree:

   	   1
 	 /   \
    2     3
  /   \
 4 	   5
 * All root-to-leaf paths are:
 * ["1->2->5", "1->3"]
 
 */
public class BinaryTreePaths {

	public static void main(String[] args) {
		BinaryTreePaths obj = new BinaryTreePaths();
		
		TreeNode  n1 = obj.newNode(1);
		TreeNode  n2 = obj.newNode(2);
		TreeNode  n3 = obj.newNode(3);
		TreeNode  n4 = obj.newNode(4);
		TreeNode  n5 = obj.newNode(5);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		
		obj.printTree(n1);
		
		List<String> resultn1 = obj.binaryTreePaths(n1);
		System.out.println();
		for (String str : resultn1) {
			System.out.print(str + " ");
		}
		
	}

	/*
	 Helper function that allocates a new node
	 with the given data and NULL left and right
	 pointers.
	 */
	private TreeNode newNode(int data) {
	  TreeNode node = new TreeNode(data);
	  node.left = null;
	  node.right = null;
	  return node;
	}
	
	/*
	 Helper function to print a tree in order.
	 */
	private void printTree(TreeNode node) {
	 if (node == null) return;
	 // left, node itself, right
	 printTree(node.left);
	 System.out.print(node.val + "  ");
	 printTree(node.right);
	}
	
	private List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<String>();
		if (root == null) 
			return result;
		
		this.pathHelper(root, String.valueOf(root.val), result);
		
		return result;
	}
	
	private void pathHelper(TreeNode node, String path, List<String> result) {
		if (node == null)
			return;
		
		if (node.left == null && node.right == null) {
			result.add(path);
			return;
		}
		if (node.left != null) {
			pathHelper(node.left, path + "->" + (String.valueOf(node.left.val)), result);
		}
		if (node.right != null) {
			pathHelper(node.right, path + "->" + (String.valueOf(node.right.val)), result);
		}
		
	}
}
