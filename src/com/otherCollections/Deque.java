package com.otherCollections;

import java.util.ArrayDeque;

public class Deque {

	public static void main(String[] args) {
		ArrayDeque<String> dq = new ArrayDeque<String>();
		dq.add("pune");
		dq.add("satara");
		dq.add("nagpur");
		dq.add("nashik");
		dq.add("mumbai");
		
		System.out.println(dq);
		dq.offerLast("Amravati");
		System.out.println(dq);
		System.out.println(dq.peekLast());
		System.out.println(dq.pollFirst());
		System.out.println(dq);
		
	}

}
