
public class SavingsAccount extends Account{
  private double interestRate;
  
  public SavingsAccount(int acc) {
    super(acc);
    // TODO Auto-generated constructor stub
    interestRate = 0.0;
  }
  public void addInterestRate(double rate)
  {
    interestRate += rate;
  }
  public String toString()
  {
    return super.toString() + ", Interest Rate:" + interestRate; 
  }
}