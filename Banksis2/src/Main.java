public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Bank bank = new Bank();
    Account a1 = new Account(1);
    bank.v.add(a1);
    Account a2 = new SavingsAccount(2);
    bank.v.add(a2);
    Account a3 = new CheckingAccount(3);
    bank.v.add(a3);
    a1.deposit(10);
    a1.deposit(20);
    a1.withdraw(5);
    System.out.println(a1.getBalance());
  }

}