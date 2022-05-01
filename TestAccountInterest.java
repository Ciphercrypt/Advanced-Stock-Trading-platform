
/**
 * Write a description of class TestAccountInterest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestAccountInterest
{
      public static void main(String[]args)
     {
        Account account1 = new Account(500);
        Account account2 = new Account(100);
        
        account1.setInterest(0.1);
        account2.setInterest(0.2);
        
        
        account1.computeInterest(12,account1.getInterest());
        account1.computeInterest(24,account1.getInterest());
        
        account2.computeInterest(12,account2.getInterest());
        account2.computeInterest(24,account2.getInterest());
        
        account1.withdraw(100);
        account2.deposit(1000);
        
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        
        
        
    }

}
