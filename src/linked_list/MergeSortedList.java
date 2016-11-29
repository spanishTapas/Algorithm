package linked_list;
/**
 * 
 * @author wanmingzhang
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeSortedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode node1 = new ListNode(3);
		l1.next = node1;
		
		ListNode l2 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(6);
		
		l2.next = node2;
		node2.next = node3;
		node3.next = node4;

		ListNode result = mergeSortedList(l1,l2);
		
		while (result != null) {
			System.out.print(result.val + ",");
			result = result.next;
		}
		
	}
	
	public static ListNode mergeSortedList(ListNode l1, ListNode l2) {
		
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				head.next = l1;
				l1 = l1.next;
			} else {
				head.next = l2;
				l2 = l2.next;
			}
			head = head.next;
		}
		
		if (l1 != null) {
			head.next = l1;
		} else {
			head.next = l2;
		}
		
		return dummy.next;
		
	}

}


