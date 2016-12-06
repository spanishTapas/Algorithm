package stack;

import java.util.Stack;

/**
 * 
 * @author wanmingzhang
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class MinStack {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;
	
	public static void main (String[] args) {
		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		System.out.println(obj.getMin());
		obj.pop();
		int param_3 = obj.top();
		int param_4 = obj.getMin();
		System.out.println("param_3 = " + param_3);
		System.out.println("param_4 = " + param_4);
	}
	
	/** initialize your data structure here. */
	public MinStack() {
		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}
	
	public void push(int x) {
		stack.push(x);
		if (minStack.isEmpty()) {
			minStack.push(x);
		} else {
			int min = Math.min(x, minStack.peek());
			minStack.push(min);
		}
	}
	
	public void pop() {
		minStack.pop();
		stack.pop();
	}
	
	public int top() {
		return stack.peek();
	}
	
	public int getMin() {
		return minStack.peek();
	}

}
