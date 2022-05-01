
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables - replace the example below with your own
    private double interestRate;
    private double balance;

    /**
     * Constructor for objects of class Account
     */
    public Account(double initialBalance)
    {
        // initialise instance variables
        balance = initialBalance;
    }
    
    public Account()
    {
        balance = 0;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
        
    }
    
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    
    public double getBalance()
    {
       return balance; 
    }
    
    public void setInterest(double rate)
    {
        interestRate = rate;
    }
    
    public void computeInterest(int n, double interestRate)
    {
        double newBalance = Math.pow((balance * (1+interestRate)),(n/12)); 
        System.out.println(newBalance);
    }
    
    public double getInterest()
    {   
        return interestRate;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
        
    }
}
