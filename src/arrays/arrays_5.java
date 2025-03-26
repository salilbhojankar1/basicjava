//sum of the numbers arrays
package arrays;
import java.util.*;
public class arrays_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		int sum=0;
		System.out.println("Enter rhe values: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of the arrays= "+sum);
	}

}
