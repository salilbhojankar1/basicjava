package com.listexample;

import java.util.ArrayList;
public class ArrToArrLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,50,30,40,28,95,24,45};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}
		
		al.add(100);
		System.out.println(al);

	}

}
