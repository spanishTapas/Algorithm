package tree;
import java.util.*;
/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * 
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *       3
      /     \
     9       20
   /   \    /  \
  2	    6   15   7
 * 
 *
 */
public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
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
		
		// Test cases for height method
		int height_node3 = height(node3);
		System.out.println("node3 height = " + height_node3);
		
		int height_node20 = height(node20);
		System.out.println("node20 height = " + height_node20);
		
		int height_node15 = height(node15);
		System.out.println("node15 height = " + height_node15);
		
		// test for printLevelOrder method
		printLevelOrder(node3);
		
		System.out.println();
		// test for nodesAtGivenLevel method
		List<Integer> level3 = nodesAtGivenLevel(node3, 3);
		List<Integer> level2 = nodesAtGivenLevel(node3, 2);
		List<Integer> level1 = nodesAtGivenLevel(node3, 1);
		
		System.out.print("[");
		for (int value : level3) {
			System.out.print(value + " ");
		}
		System.out.print("]");
		
		System.out.print("[");
		for (int value : level2) {
			System.out.print(value + " ");
		}
		System.out.print("]");
		
		System.out.print("[");
		for (int value : level1) {
			System.out.print(value + " ");
		}
		System.out.print("]");
		
//		List<List<Integer>> result = levelOrderBottom(node20);
//		for (List<Integer> level : result) {
//			System.out.print("[");
//			for (int value : level) {
//				System.out.print(value + " ");
//			}
//			System.out.print("]");
//		}

	}
	
	/* Compute the "height" of a tree -- the number of nodes along the longest path from the root node
    down to the farthest leaf node.*/
	public static int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		/* compute  height of each subtree */
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return (leftHeight <= rightHeight) ? rightHeight + 1 : leftHeight + 1;
	}
	
	/* Print nodes at the given level */
	public static void printGivenLevel(TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.val + " ");
		} else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}
	
	/* function to print level order traversal of tree*/
    static void printLevelOrder(TreeNode root)
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
    
	public static List<Integer> nodesAtGivenLevel(TreeNode root, int level) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		if (level == 1) {
			result.add(root.val);
		} else if (level > 1) {
			result.addAll(nodesAtGivenLevel(root.left, level - 1));
			result.addAll(nodesAtGivenLevel(root.right, level - 1));
		}
		return result;
	}
	
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	int h = height(root);
    	for (int i=h; i>=1; i--) {
    		List<Integer> level = nodesAtGivenLevel(root,i);
    		result.add(level);
    	}
    	return result;
    }
    
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//       if (root == null) {
//           return result;
//       }
//       Queue<TreeNode> queue = new LinkedList<TreeNode>();
//       queue.offer(root);
//       
//       while (!queue.isEmpty()) {
//           int size = queue.size();
//           ArrayList<Integer> level = new ArrayList<>();
//           for (int i = 0; i < size; i++) {
//               TreeNode head = queue.poll();
//               level.add(head.val);
//               if (head.left != null) {
//                   queue.offer(head.left);
//               }
//               if (head.right != null) {
//                   queue.offer(head.right);
//               }
//           }
//           result.add(level);
//       }
//       
//       Collections.reverse(result);
//       return result;
//   }
	
}
