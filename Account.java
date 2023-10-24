package task10;

import java.util.Scanner;

public class Account {
	int wdamt;
	double depamt,balance;
	

	public Account() {
		this.balance=balance;
	}
	
	public Account(double balance) {
		this.balance=balance;
	}
	public double getbal() {
		return balance;
	}
	public void setbal(double bal)
	{
		this.balance=bal;
	}
	public void withdrawamt(int wamt) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		wamt=s.nextInt();
		if (wamt<balance)
		{
			System.out.println("Witdrawn amount:"+wamt);
		}
		else
			System.out.println("Insufficient fund");
	}
	
	public void depositamout(double damt) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		 damt=s.nextDouble();
		balance=balance+damt;
		System.out.println("Deposited amount:" +balance);
		}
	public static void main(String[] args) {
		Account a1=new Account();
		a1.setbal(10000);
		System.out.println("Current balance:"+a1.getbal());
		a1.depositamout(0);
		a1.withdrawamt(0);
		
		Account a2=new Account(1000);
		System.out.println("Current balance:"+a2.getbal());
		a2.depositamout(0);
		a2.withdrawamt(0);
		
	}

}
