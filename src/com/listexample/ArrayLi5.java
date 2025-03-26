package com.listexample;
import java.util.ArrayList;
public class ArrayLi5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
	
	/*	
			int arr[]  = new int[list.size()];
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]= list.get((i));
			}
			for(int num :arr)                           //arraylist to array 

			{
				System.out.println(num);
			}*/
			
			
			Object Objects[]= list.toArray();
			
			for(Object obj : Objects)						//arraylist to array by object method
			{
				System.out.println(obj);
			}
	}

}
