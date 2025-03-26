package com.setexamples;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class setExam1 {

	public static void main(String[] args) {
	HashSet<String> al = new HashSet<String>();
		
		al.add("India");
		al.add("Australia");
		al.add("England");
		al.add("New England");
		al.add("India");
		al.add("Australia");
		al.add("Nepal");
		al.add("Bhutan");
		
		
		System.out.println(al);
		
		
		/* LinkedHashSet<String> al = new LinkedHashSet<String>();
		
		al.add("India");
		al.add("Australia");
		al.add("England");
		al.add("New England");
		al.add("India");
		al.add("Australia");
		al.add("Nepal");
		al.add("Bhutan");
		
		
		System.out.println(al); */
		
		/* ArrayList<String> list = new ArrayList<String>(al);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list); */
		

	}

}
