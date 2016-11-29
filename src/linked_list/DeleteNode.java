package linked_list;
/**
 * 
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, 
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 */
public class DeleteNode {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2a = new ListNode(2);
		ListNode node2b = new ListNode(2);
		ListNode node3a = new ListNode(3);
		ListNode node3b = new ListNode(3);
		
		head.next = node1;
		node1.next = node2a;
		node2a.next = node2b;
		node2b.next = node3a;
		node3a.next = node3b;
		
		ListNode result = deleteDuplicateNode(head);
		
		while (result != null) {
			System.out.print(result.val + ",");
			result = result.next;
		}

	}
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
	
	/**
	 * Given a sorted linked list, delete all duplicates such that each element appear only once.

	For example,
	Given 1->1->2, return 1->2.
	Given 1->1->2->3->3, return 1->2->3.
	 **/

	public static ListNode deleteDuplicateNode(ListNode head) {
		if (head == null) {
			return head;
		}
		
		ListNode tmp = head;
		
		while (tmp.next != null) {
			if (tmp.val == tmp.next.val) {
				tmp.next = tmp.next.next;
			} else {
				tmp = tmp.next;
			}
		}
		return head;
	}
	
}
