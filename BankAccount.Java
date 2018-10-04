public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount( double startbalance, int accountname, String startpassword) {
    balance = startbalance;
    accountID = accountname;
    password = startpassword;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccount() {
    return accountID;
  }

  public String getPassword() {
    return password;   //wrote this just to make sure that set password works,
  }

  public void setPassword( String newpass) {
    password = newpass;
  }

  public String toString() {
    return( accountID + "\t" + balance);
  }

  public Boolean deposit( double depo) {
    if ( depo >= 0) {
      balance+= depo;
      return true;
    } else {
      return false;
    }
  }

  public Boolean withdraw ( double with){
    if ( balance - with  >= 0 ) {
      balance -= with;
      return true;
    } else {
      return false;
    }
  }

public boolean transferTo(BankAccount other, double amount, String password){
  if (authenticate(password) && withdraw(amount)) {
    other.deposit(amount);
    return true;
} else {return false;
  }
}

  private boolean authenticate(String password){
    if (this.password.equals(password))
    return true;
    else { return false;
    }
  }

}
