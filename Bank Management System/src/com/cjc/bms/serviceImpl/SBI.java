package com.cjc.bms.serviceImpl;

import java.util.Scanner;

import com.cjc.bms.model.Account;
import com.cjc.bms.service.RBI;

public class SBI extends Account implements RBI
{
	  Account a = new Account();
	  
	public void createAccount() 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("If you are Create Your Account Fill the Below Details");
		System.out.println("Enter your Name");
		a.setName(sc.nextLine());
		System.out.println("Enter Your Mobile Number");
		a.setMobNo(sc.nextLine());
		System.out.println("Enter Your Age");
		a.setAge(sc.nextInt());
		System.out.println("Enter Your Aadhar Number");
		a.setAdharNo(sc.next());
		System.out.println("Enter Your PAN Number");
		a.setPanNo(sc.next());
		System.out.println("Enter Your Gender");
		a.setGender(sc.next());
		System.out.println("Your Account Created Sucessafully!!!!");
		System.out.println("Thank You For Giving Your Information");
	}

	
	public void displayAllDetails() 
	{
		
	    System.out.println("Display all the Details of Account Holder");
		System.out.println("Account Holder Name :-" + a.getName());
		System.out.println("Account Holder Mobile Number :-" + a.getMobNo());
		System.out.println("Account Holder Age :-" + a.getAge());
		System.out.println("Account Holder Adhar Number :-" + a.getAdharNo());
		System.out.println("Account Holder PAN Number :-" + a.getPanNo());
		System.out.println("Account Holder Gender :-" + a.getGender());
		
	}
	
	public void depositeMoney() 
	{  
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Deposite Amount");
		double deposite = sc.nextDouble();
		double s = getBalance()+ deposite;
	    System.out.println("Total Amount" + s);
	    setBalance(s);
	    //a.setBalance(getBalance()+deposite);
		System.out.println("Deposite Balance Sucessafully!!!!");
	}
	

	
	public void withdrawal() 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Withdrawal Amount");
		double withdrawal = sc.nextDouble();
		double s1 = getBalance()- withdrawal;
		System.out.println("Total Amount" + s1);
		setBalance(s1);
		//a.setBalance(getBalance()-withdrawal);
		System.out.println("Withdrawal Balance Sucessafully!!!!");
	}


	public void balanceCheck()
	{
		System.out.println("Balance in Your Account :-" + a.getBalance());
	}

}
