public class Driver {
  public static void main(String[] args){
    BankAccount a = new BankAccount( 100.00, 101, "pass");
    BankAccount b = new BankAccount ( 500.72, 201, "word");

    System.out.println( a.getAccount());
    System.out.println( a.getBalance());

    System.out.println(a.getPassword());
    a.setPassword( "I think that pineapple on pizza isn't the worst thing ever");
    System.out.println(a.getPassword());
    a.setPassword( "pass");


    System.out.println(a.deposit( 50.1 ));
    System.out.println(a.getBalance());
    System.out.println(a.withdraw( 500));
    System.out.println(a.getBalance());
    System.out.println(a.withdraw(70.5));
    System.out.println(a.getBalance());

    System.out.println( b.transferTo( a, 50.2, "pass"));
    System.out.println( a.getBalance());
    System.out.println( b.getBalance());
    System.out.println( a.transferTo( b, 50.2, "pass"));
    System.out.println( a.getBalance());
    System.out.println( b.getBalance());




  }
}
