package com.listexample;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample1 {
	public static void main(String[] args) {
		
		LinkedList<String>link = new LinkedList<String>();
		
		link.add("India");
		link.add("Australia");
	//	link.add(null);
		link.add("New zealand");
		link.add("Nepal");
		link.add("England");
		
		
		
		
	//	link.addFirst("Bhutan");
	//	link.addLast(null);
	//	System.out.println(link);
		
		link.offer("Bhutan");
		link.offerFirst("Canada");
		link.offerLast("Maynmar");
		
	//	System.out.println(link.get(4));
	//	System.out.println(link.getFirst());
	//	System.out.println(link.getLast());
		
	//	System.out.println(link.peek());	//if there is no any element in or list then
	//	System.out.println(link.peekFirst());
	//	System.out.println(link.peekLast());
		
	//	System.out.println(link.poll());		// it removes the data itself in the list
	//	System.out.println(link.pollFirst());
	//	System.out.println(link.pollLast());
	
	//	System.out.println(link);
	
		System.out.println(link.pop());
		link.push("japan");
		System.out.println(link);
		
	//	Iterator<String> itr = link.descendingIterator();
	//	while(itr.hasNext())
	//	{
	//		System.out.println(itr.next());
	//	}
}
}