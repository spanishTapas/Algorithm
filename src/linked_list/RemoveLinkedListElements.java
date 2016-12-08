package linked_list;
/**
 * @author wanmingzhang
 * Remove all elements from a linked list of integers that have value val.

 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveLinkedListElements {

	public static void main(String[] args) {
		RemoveLinkedListElements obj = new RemoveLinkedListElements();
		
		ListNode nullNode = obj.nullTest();
		System.out.println("Remove 0 from null node " + obj.remove(nullNode, 0));
		
		System.out.println("Remove 1 from test1");
		ListNode node1 = obj.test1();
		obj.printTestResultHelper(node1, 1);

		System.out.println("Remove 1 from test2");
		ListNode node2 = obj.test2();
		obj.printTestResultHelper(node2, 1);
		
		System.out.println("Remove 1 from test3");
		ListNode node3 = obj.test3();
		obj.printTestResultHelper(node3, 1);
		
		System.out.println("Remove 6 from test4");
		ListNode node4 = obj.test4();
		obj.printTestResultHelper(node4, 6);
	}
	
	/* helper method to print input and output linked list*/
	private void printTestResultHelper(ListNode head, int val) {
		System.out.print("Input list is: ");
		this.printListHelper(head);
		System.out.println();
		System.out.print("Output list is: ");
		this.printListHelper(this.remove(head, val));
		System.out.println();
	}
	
	/* helper method to print a linked list*/
	private void printListHelper(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	private ListNode nullTest() {
		ListNode node = null;
		return node;
	}
	
	private ListNode test1() {
		// 1 
		ListNode node = new ListNode(1);
		return node;
	}
	
	private ListNode test2() {
		// 1 --> 1
		ListNode node = new ListNode(1);
		node.next = new ListNode(1);
		return node;
	}
	
	private ListNode test3() {
		// 1 --> 1 --> 2
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		head.next = node1;
		node1.next = node2;
		return head;
	}
	private ListNode test4() {
		// 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(6);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		return head;
	}
	
	private ListNode remove(ListNode head, int val) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode tmp = dummy;
		
		while (head != null) { // tmp -> 2 -> 1
			if (head.val == val) {
				tmp.next = head.next;
			} else {
				tmp = head;
			}
			head = tmp.next;
		}
		
		return dummy.next;
	}
}
