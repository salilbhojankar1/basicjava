package com.setexamples;
import java.util.TreeSet;
public class treeset12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(101);
		set.add(303);
		set.add(505);
		set.add(404);
		set.add(202);
		
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		System.out.println(set.headSet(303));
		System.out.println(set.tailSet(303));
		System.out.println(set.subSet(202,true, 404,true));
	}

}
