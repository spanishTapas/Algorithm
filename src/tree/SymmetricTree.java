package tree;
/**
 * @author wanmingzhang
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *     	    1
   	 	  /   \
  		 2     2
 		/ \   / \
	   3   4 4   3
 */
public class SymmetricTree {

	public static void main(String[] args) {
		// Construct tree
		TreeNode node1 = newNode(1);
		TreeNode node2a = newNode(2);
		TreeNode node2b = newNode(2);
		TreeNode node3a = newNode(3);
		TreeNode node3b = newNode(3);
		TreeNode node4a = newNode(4);
		TreeNode node4b = newNode(4);

		node1.left = node2a;
		node1.right = node2b;
		
		node2a.left = node3a;
		node2a.right = node4a;

		node2b.left = node4b;
		node2b.right = node3b;
		
		// test cases for same tree method
		System.out.println("3a and 3b are the same tree. " + sameTree(node3a,node3b));
		System.out.println("3a and 4a are not the same tree. " + sameTree(node3a,node4a));
		System.out.println("2a and 2b are not the same tree. " + sameTree(node2a,node2b));
		
		// test case for mirror tree
//		printTree(node1);
//		System.out.println();
//		TreeNode mirror1 = mirrorTree(node1);
//		printTree(mirror1);
//		System.out.println();
		
//		printTree(node2a);
//		System.out.println();
//		printTree(mirrorTree(node2a));

		// test cases for symmetric tree
		System.out.println(symmetricTree(node3a));
		System.out.println(symmetricTree(node4a));
		System.out.println(symmetricTree(node2a));
		System.out.println(symmetricTree(node1));
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
	
	/*
	 Helper function to print a tree in order.
	 */
	private static void printTree(TreeNode node) {
	 if (node == null) return;
	 // left, node itself, right
	 printTree(node.left);
	 System.out.print(node.val + "  ");
	 printTree(node.right);
	}
	
	public static boolean symmetricTree(TreeNode root) {
		if (root == null) {
			return true;
		}

		return isSymmetric(root.left, root.right);
	}
	
	// symmetric helper function 
	private static boolean isSymmetric(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		} else if (root1 == null || root2 == null) {
			return false;
		} else if (root1.val != root2.val) {
			return false;
		} else if (!isSymmetric(root1.left, root2.right)){
			return false;
		} else if (!isSymmetric(root1.right, root2.left)) {
			return false;
		}
		
		return true;
	}
	
	/*method to return the mirror image of a binary tree*/
	public static TreeNode mirrorTree(TreeNode root) {
		if (root == null) {
			return root;
		}
		if (root.left == null && root.right == null) {
			return root;
		}
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
		mirrorTree(root.left);
		mirrorTree(root.right);
		
		return root;
	}
	
	/*method to determine if two binary trees are the same.*/
	public static boolean sameTree(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		} else if (root1 == null || root2 == null) {
			return false;
		} else {
			return (root1.val == root2.val) 
					&& sameTree(root1.left, root2.left) 
					&& sameTree(root1.right, root2.right);
		}
	}

}
