package linked_list;
/**
 * @author wanmingzhang
 * Given a linked list, determine if it has a cycle in it.

 *Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle {

	public static void main(String[] args) {
		LinkedListCycle obj = new LinkedListCycle();
		
		ListNode n1 = obj.testCase1();
		ListNode n2 = obj.testCase2();
		ListNode n3 = obj.testCase3();
		ListNode n4 = obj.testCase4();
		
		System.out.println("n1 has cycle " + obj.hasCycle(n1));
		System.out.println("n2 has cycle " + obj.hasCycle(n2));
		System.out.println("n3 has cycle " + obj.hasCycle(n3));
		System.out.println("n4 has cycle " + obj.hasCycle(n4));
		
	}
	
	private ListNode testCase1() {
		ListNode head = new ListNode(1);
		return head;
	}
	
	private ListNode testCase2() {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		head.next = n1;
		return head;
	}
	
	private ListNode testCase3() {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		head.next = n1;
		n1.next = head;
		return head;
	}
	
	private ListNode testCase4() {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		head.next = n1;
		n1.next = n2;
		n2.next = head;
		return head;
	}
	
	/*two pointers, slow moves 1 node a time, fast moves 2 node a time. If cycle, eventually two will meet.*/
	private boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
}
