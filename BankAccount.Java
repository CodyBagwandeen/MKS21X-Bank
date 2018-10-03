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
    return password;
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

}
