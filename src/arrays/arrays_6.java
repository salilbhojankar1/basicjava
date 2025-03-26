//search a number(linear search)find the position
package arrays;

import java.util.Scanner;

public class arrays_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int i;
			int search, pos=0;
			System.out.println("Enter the value:");
			int arr[]=new int[5];
			for(i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
		System.out.println("Enter the search number: ");
		search=sc.nextInt();
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]==search)
				{
					pos=i;
					System.out.println("the position is= "+(pos+1));
					break;
				}
				
			}
			int count=0;
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]!=search)
				{
					count++;
				}
			}
			if (count==arr.length)
			{
				System.out.println("search number not found");
			}
}
}