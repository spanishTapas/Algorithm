package linked_list;

/**
 * 
 * @author wanmingzhang
 * Reverse a singly linked list.

 * Hint:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// iterative
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode p1 = head;
		ListNode p2 = p1.next;
		
		head.next = null;
		while (p1 != null && p2 != null) {
			ListNode t = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = t;
		}
        return p1;
    }
	
	// recursive
//	public ListNode reverseList(ListNode head) {
//		if (head == null || head.next == null) {
//			return head;
//		}
//		
//		ListNode second = head.next;
//		head.next = null;
//		
//		ListNode rest = reverseList(second);
//		second.next = head;
//		
//		return rest;
//	}
	

}
