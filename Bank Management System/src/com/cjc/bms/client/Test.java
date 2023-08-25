package com.cjc.bms.client;

import java.util.Scanner;

import com.cjc.bms.service.RBI;
import com.cjc.bms.serviceImpl.SBI;


public class Test 
{
	public static void main(String[] args)
	{
	 RBI bank=new SBI();
	 {
	while(true)	 
	{
	Scanner sc = new Scanner (System.in);
    System.out.println("------Select the Option------");
	System.out.println("1.If  you are create a Account in SBI then Press 1");
	System.out.println("2.If  you are Display the Account Holder Details then Press 2");
	System.out.println("3.If  you are Deposite a Money in the Bank then Press 3");
	System.out.println("4.If  you are  withdrawal a Money in the Bank then Press 4");
	System.out.println("5.If  you are Display the Balance in the Account then Press 5");
	System.out.println("6.Exit");
	int ch = sc.nextInt();
	if (ch==1)
	{
	bank.createAccount();
	}
	else if (ch==2)
	{
	bank.displayAllDetails();
	}
	else if (ch==3)
	{
	bank.depositeMoney();
	}
	else if (ch==4)
	{
	bank.withdrawal();
	}
	else if (ch==5)
	{
	bank.balanceCheck();
	}
	else if(ch==6)
	{
		break;
	}
	else 
	{
		System.out.println("Wrong Input");
	}
 }
}
}
}