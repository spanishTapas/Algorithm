package linked_list;
/**
 * @author wanmingzhang
 * Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class SwapNodesInPairs {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		printList(n1);
		System.out.println();
	    ListNode swap = swapInPairs(n1);
        printList(swap);
	}
	
	/* helper function to print a list*/
	 public static void printList(ListNode head) {

		 while (head != null) {
			 System.out.print(head.val + " ");
			 head = head.next;
		 }
	 }
	
	public static ListNode swapInPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        while (head.next != null && head.next.next != null) {
            ListNode n1 = head.next;
            ListNode n2 = head.next.next;
            
            // dummy -> n1 -> n2
            // dummy -> n2 -> n1
            n1.next = n2.next;
            head.next = n2;
            n2.next = n1;
            
            head = n1;
        }
        
        return dummy.next;
	}
}
