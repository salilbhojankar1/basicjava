package com.coding_mafia;
import java.util.Scanner;
public class practice1 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("enter number");
		int n=ac.nextInt();
		
		int i,a=0,count=1;
		
		for(i=1;count<=n;i++)
		{
			a=3*i+2;
			
			if(a%4!=0) 
			{
				System.out.println(a);
				count++;
			}
		}

	}

}
