import java.util.Vector;

public class Bank {
  Vector<Account> v = new Vector <Account>();
  
  public void update(int i)
  {
    v.get(i).deposit(0);
    v.get(i).withdraw(0);
    if(v.get(i) instanceof SavingsAccount)
    {
      SavingsAccount sa = (SavingsAccount)v.get(i);
      sa.addInterestRate(0);
      if(v.get(i) instanceof CheckingAccount)
      {
        CheckingAccount ca = (CheckingAccount)v.get(i);
        ca.deductFee();
      }
    }
  }
  public void openAccount(Account acc)
  {
    v.add(acc);
  }
  public void closeAccount(Account acc)
  {
    v.remove(acc);
  }
}