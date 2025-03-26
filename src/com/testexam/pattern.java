package com.testexam;

public class pattern {

	public static void main(String[] args) {
		int row=5;
		int count = 1;
		int alph = 65;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row ; j>i; j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print((char)alph+" ");
				alph++;
			}
		
		}
		for( int i=row -1;i>=1;i--)
		{
			for(int j = row - 1; j>=i; j--) 
			{
				System.out.println(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)alph+" ");
				alph++;
			}
		}

	}

}
