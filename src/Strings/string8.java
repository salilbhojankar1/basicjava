package Strings;
import java.util.Scanner;
public class  string8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String= ");

		String Str = scanner.nextLine();
		scanner.close();

		String words[] = Str.split(" ");
		String reversedString = "";

		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}

		// Displaying the string after reverse
		System.out.print("Reversed string : " + reversedString);
	}
}