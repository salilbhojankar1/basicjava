package com.ExceptionHandling;

import java.util.Scanner;

public class throwExam1 {
	
	private static void checklimit(int speed) {
		if(speed<80)
		{
			throw new ArithmeticException("Speed badhao warna gabbar aajayega! ");
		}
		else if(speed>=80&&speed<=100)
		{
			System.out.println("bahut badiya gaadi chalate ho!");
		}
		else
		{
			throw new NumberFormatException("Aram se chalao warna yamraj aajayega!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed you are driving in!");
		int speed = sc.nextInt();
		try {													// we can also put this try&catch method in check-linmit methods after else method
		checklimit(speed);
		}
		catch(Exception e)
		{
//			System.out.println(e);
			e.printStackTrace();  	//it is use to find details of exceptions
		}
		System.out.println("SUDHAR JAO!!!");
	


		
	}

}
