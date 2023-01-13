package com.ATM;

import java.util.Scanner;

class ATM
{
	float balance;
	int PIN = 1234;
	
	public void checkpin()
	{
		System.out.println("Enter the pin number");
		Scanner scan = new Scanner(System.in);
		int enteredPin = scan.nextInt();
		
		if(enteredPin == PIN)
		{
			menu();
		}
		else 
		{
			System.out.println("enter a valid pin number");
		}
	}
	
	public void menu()
	{
		System.out.println("::::Enter your Choice::::");
		System.out.println("1.check Balance");
		System.out.println("2.withdrew money");
		System.out.println("3.depoist money");
		System.out.println("4.exit");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a==1)
		{
			checkBalance();
		}
		else if(a==2)
		{
			withdrawMoney();
		}
		else if(a==3) {
		
			depositMoney();
		}
		else if(a==4)
		{
			return;
		}
		else
		{
			System.out.println("enter a valid option");
		}
		
	}
	
	public void checkBalance()
	{
		System.out.println("your balance is "+ balance);
		menu();
	}
	
	public void withdrawMoney()
	{
	 System.out.println("enter the money you have to withdraw");	
	 Scanner sca = new Scanner(System.in);
	 float wd=sca.nextFloat();
	 
	 if(wd>balance)
	 {
		 System.out.println("insufficient balance");
	 }
	 else
	 {
		 balance = balance-wd;
		 System.out.println("money withdrawn successfully..!!");
	 }
	 menu();
	}
	public void depositMoney()
	{
		System.out.println("enter the money to be deposited");
		Scanner s = new Scanner(System.in);
		float dp=s.nextFloat();
		
		balance = dp+balance;
		System.out.println("your money deposited successfully");
		menu();
	}
}

public class ATMMachine {

	public static void main(String[] args) {
	  ATM a = new ATM();
	  a.checkpin();

	}

}
