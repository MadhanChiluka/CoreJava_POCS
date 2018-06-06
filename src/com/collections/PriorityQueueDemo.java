package com.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue<>();
		System.out.println(queue.peek());
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

		PriorityQueue queue2 = new PriorityQueue<>(new QueueComparator());
		queue2.offer("A");
		queue2.offer("Z");
		queue2.offer("L");
		queue2.offer("B");
		System.out.println(queue2);
		queue2.poll();
		System.out.println(queue2);
		queue2.poll();
		System.out.println(queue2);
		queue2.poll();
		System.out.println(queue2);
	}
}

class QueueComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String string1 = (String) o1;
		String string2 = o2.toString();
		return string2.compareTo(string2);
	}

}
