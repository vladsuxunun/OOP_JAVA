package sis2_2;

public class Account {

	private double balance; //The current balance
	private int accNumber; //The account number
	public Account(int a)
	{
	 balance=0.0;
	 accNumber=a;
	}
	public void deposit(double sum) { ,,, }
	public void withdraw(double sum) { ,,,}
	public double getBalance(){,,,}
	public double getAccountNumber(){,,,}
	 public void transfer(double amount, Account other){}
	public String toString() {
	 ,,,
	}
	public final void print()
	{
	 //Don't override this,override the toString method
	 System.out.println( toString() );
	} }
