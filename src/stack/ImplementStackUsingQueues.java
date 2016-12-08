package stack;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author wanmingzhang
 * Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 *
 */
public class ImplementStackUsingQueues {
	private int top;
	private Queue<Integer> q1 = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		
	}
	
	// Push element x onto stack.
    /**
    Time complexity : O(n).
    Space complexity : O(1).
    **/
    public void push(int x) {
        q1.add(x);
        int size = q1.size();
        while (size > 1) {
        	q1.add(q1.remove()); // q1.remove() retrieves and removes the head of the queue
        	size--;
        }
    }

    // Removes the element on top of the stack.
    // The last inserted element is always stored at the front of q1 and we can pop it for constant time.
    /**Time complexity : O(1). Space complexity : O(1).**/
    public void pop() {
        q1.remove();
    }

    // Get the top element.
    /**Time complexity : O(1). Space complexity : O(1).**/
    public int top() {
        return q1.peek();
    }

    // Return whether the stack is empty.
    /**Time complexity : O(1). Space complexity : O(1).**/
    public boolean empty() {
        return q1.isEmpty();
    }
	
	
	

}
