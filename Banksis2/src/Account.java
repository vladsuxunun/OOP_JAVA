public class Account {
  private double balance;
  private int accNumber;
  
  public Account(int a)
  {
    balance = 0.0;
    accNumber = a;
  }
  public void deposit(double sum)
  {
    balance += sum;
  }
  
  public void withdraw(double sum) 
  {
    balance -= sum;
  }
  public double getBalance()
  {
    return balance;
  }
  public double getAccountNumber()
  {
    return accNumber;  
  }
  public void transfer(double amount, Account other)
  {
    other.balance += amount;
    balance -= amount;
  }
  
  public String toString() {
    return "AccNumber: " + accNumber + ", Balance: " + balance;
  }
  public final void print()
  {
    //Don't override this,override the toString method
    System.out.println( toString() );
  }
}