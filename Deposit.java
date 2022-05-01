import java.util.Scanner;
import java.util.Scanner;

public class Deposit extends NewBalance  {

    private double balance;
    
    //constructor to initialise balance
    public Deposit(double initialBalance)
    {
        balance = initialBalance;
    }
    //balance is initially 0
    public Deposit()
    {
       
    }
    
    //the users deposit is added to balance
    public void deposit(double amount)
    {
        balance = balance + amount;
        
    }
    
   
    //getter method to obtain balance
    public double getBalance() 
    {
        return balance;
    }
}
