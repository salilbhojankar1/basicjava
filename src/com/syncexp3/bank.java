package com.syncexp3;
import java.util.Scanner;
public class bank{
	int balance;
	public bank(int banance)
	{
		this.balance=balance;
	}
	public synchronized void deposite() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to Deposite:");
		
		int dp_amount=sc.nextInt();
		
		System.out.println("the new balance is = "+(balance+dp_amount));
		
		balance=balance+dp_amount;
		
	}
	
	public synchronized void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw:");
		int wd_amount=sc.nextInt();
		
		System.out.println("the new balance is= "+(balance-wd_amount));
	}
	
}