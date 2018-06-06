package com.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack  stack = new Stack<>();
		stack.push("M");
		stack.push("A");
		stack.push("D");
		stack.push("H");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.capacity());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.search("M"));
	}

}
