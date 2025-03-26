package com.ExceptionHandling;
import java.io.*;
public class Data {

	public static void main(String[] args) throws IOException{ // throws cannot handle exception
		// TODO Auto-generated method stub
		int age;
		String name;
		String address;
		double balance;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		name = (br.readLine());
		
		System.out.println("Enter your age: ");
		age = Integer.parseInt(br.readLine());
		
		System.out.println("Enter your address: ");
		address = (br.readLine());
		
		System.out.println("Enter your balance: ");
		balance = Double.parseDouble(br.readLine());
		
		
		System.out.println(name+" "+age+" "+address+" "+balance);
		
		
		
		
	}

}
