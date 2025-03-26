package com.otherCollections;
import java.util.Stack;

public class stackexam {

	public static void main(String[] args) {
		Stack<String>st = new Stack<String>();
		st.add("Amol");
		st.add("Rushikesh");
		st.add("Gaurav");
		st.add("Sunil");
		st.add("Tushar");
		
		System.out.println(st);
		
		st.push("Piyush");
		System.out.println(st);
		st.pop();
		System.out.println(st);
		

	}

}
