package com.otherCollections;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		
		que.add(202);
		que.add(101);
		que.add(404);
		que.add(303);
		que.add(505);
		
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.poll());
		System.out.println(que.element());
		System.out.println(que);

	}

}
