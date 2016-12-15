package linked_list;
/**
 * @author wanmingzhang
 * Given a singly linked list, determine if it is a palindrome.

 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */

public class PalindromeLinkedList {

	public static void main(String[] args) {
		PalindromeLinkedList obj = new PalindromeLinkedList();
		ListNode n1 = obj.testCase1();
		ListNode n2 = obj.testCase2();
		ListNode n3 = obj.testCase3();
		ListNode n4 = obj.testCase4();
		ListNode n5 = obj.testCase5();
		ListNode n6 = obj.testCase6();
		obj.printList(n1);
		obj.printList(n2);
		obj.printList(n3);
		obj.printList(n4);
		obj.printList(n5);
		obj.printList(n6);
		
		/* test case for reverse list method */
		//obj.printList(obj.reverseList(n4));
		
		/* test case for find middle node method */
		System.out.println(obj.findMiddle(n5).val);
		System.out.println(obj.findMiddle(n6).val);
		
		/* test case for palindrome list method */
		System.out.println(obj.isPalindrome(n1));
		System.out.println(obj.isPalindrome(n2));
		System.out.println(obj.isPalindrome(n3));
		System.out.println(obj.isPalindrome(n4));
		System.out.println(obj.isPalindrome(n5));
		System.out.println(obj.isPalindrome(n6));
	}
	private ListNode testCase1() {
		// 1
		ListNode head = new ListNode(1);
		return head;
	}
	
	private ListNode testCase2() {
		// 1->2
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		head.next = n1;
		return head;
	}
	
	private ListNode testCase3() {
		// 1->2->1
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(1);
		head.next = n1;
		n1.next = n2;
		return head;
	}
	
	private ListNode testCase4() {
		// 1->2->3
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		head.next = n1;
		n1.next = n2;
		return head;
	}
	private ListNode testCase5() {
		// 1->2->3->4->5
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(5);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return head;
	}
	private ListNode testCase6() {
		// 1->2->3->4->5->6
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(6);	
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		return head;
	}
	private void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	private ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode n1 = head;
		ListNode n2 = head.next;
		head.next = null;
		while (n2 != null) {
			ListNode tmp = n2.next;
			n2.next = n1;
			n1 = n2;
			n2 = tmp;
		}
		return n1;
	}
	
	private ListNode findMiddle(ListNode head) {
		//1->2->3->4->5
		//1->2->3->4->5->6
		if (head == null || head.next == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		
		while (fast != null && fast.next != null) { // 1,2; 2,4; 3,6
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	/* find middle node then reverse the 2nd half of the the list, compare 1st and 2nd half */
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode mid = this.findMiddle(head);
		ListNode end = mid.next;
		end = this.reverseList(end);
		while (end != null) {
			if (head.val != end.val) {
				return false;
			}
			head = head.next;
			end = end.next;
		}
		return end == null;
	}
}
