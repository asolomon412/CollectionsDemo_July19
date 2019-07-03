package co.gccollections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// Stacks for LIFO -- think making pancakes, or washing dishes
		Stack<String> stack = new Stack<>();
		
		stack.push("Java");
		stack.push("is");
		stack.push("cool");
		System.out.println(stack);
		
		System.out.println(stack.pop()); // removes the last item added to the stack (the top)
		System.out.println(stack);
		System.out.println(stack.peek()); // just shows what's there but doesn't remove
		System.out.println(stack);

	}

}
