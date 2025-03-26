package com.setexamples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam2 {

	public static void main(String[] args) {
	
				TreeSet<String> ts = new TreeSet<String>();
				
				ts.add("Pune");
				ts.add("Satara");
				ts.add("Nashik");
				ts.add("Pune Camp");
				ts.add("Nagpur");
				ts.add("Pune Deccan Gymkhana");
				
//				Iterator<String> itr = ts.descendingIterator();
//				while(itr.hasNext())
//				{
//					System.out.println(itr.next());
//				}
				System.out.println(ts);
//				System.out.println(ts.descendingSet());
				System.out.println(ts.pollFirst());
				System.out.println(ts.pollLast());
				System.out.println(ts);
	}

}
