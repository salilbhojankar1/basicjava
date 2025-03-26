package com.setexamples;

import java.util.TreeSet;

public class TreeSetExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(11);
		ts.add(22);
		ts.add(33);
		ts.add(44);
		ts.add(55);
		ts.add(66);
		ts.add(77);
		ts.add(88);
	//	ts.add(null);  //it gives exception it cant accept null values bcoz it sorted
		ts.add(99);
		
		System.out.println(ts);
			
	}

}
