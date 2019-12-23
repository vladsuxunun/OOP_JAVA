public class CheckingAccount extends Account{
  private double chargeForTran;
  public int cnt = 0;
  private final int FREE_TRANSACTIONS = 10;
  public CheckingAccount(int acc) {
    super(acc);
    chargeForTran = 0.02;
    // TODO Auto-generated constructor stub
  }
  public double deductFee()
  {
    if(cnt <= 10)
      return 0;
    double fee = ((cnt - FREE_TRANSACTIONS)) * chargeForTran;
    return fee;
  }
  public String toString()
  {
    return super.toString() + ", Charge For Each Transcation:" + chargeForTran; 
  }
  
}