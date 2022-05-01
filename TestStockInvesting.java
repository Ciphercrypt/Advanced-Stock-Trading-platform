import java.util.*;

public class TestStockInvesting {
    
    public static void main(String[] args) 
    {   
        //deposits 10000 into users account and prints it out to show them their balance
        Deposit d1 = new Deposit(10000);
        System.out.println("Your balance is: " + d1.getBalance());
        System.out.println("");
            
        //prints stocks
        Stocks s1 = new Stocks(5000,150,0.45);
        double bitcoinprice = s1.getBitcoin();
        double litecoinprice = s1.getLitecoin();
        double rippleprice = s1.getRipple();
        s1.printStocks(bitcoinprice,litecoinprice,rippleprice);
        System.out.println("");
        
   
       //this piece of code is responsible for asking user which stock they would like to purchase and calculates the transaction cost and their new balance 
        NewBalance nb = new Deposit();
        int userChoice = nb.askUser();
        
        if(userChoice == 1 | userChoice == 2 | userChoice == 3) {
        double balance_after_buy = (nb.getnewBalance() - nb.getuserBalance());
        nb.decreaseBalance(balance_after_buy);
       
        }
        
        else if (userChoice == 4 | userChoice == 5 | userChoice == 6) {
        double balance_after_sell = (nb.getnewBalance() + nb.getuserBalance());
        nb.increaseBalance(balance_after_sell);
        }
        
        ArrayList<Double> obj = new ArrayList<Double>();
        obj.add(nb.getuserBalance());
        obj.add(nb.getBitcoinBalance());
        obj.add(nb.getLitecoinBalance());
        obj.add(nb.getRippleBalance());
     
     System.out.println("Pound Balance: " + obj.get(0));
     System.out.println("Bitcoin Balance: " + obj.get(1));
     System.out.println("Litecoin Balance: " + obj.get(2));
     System.out.println("Ripple Balance: " + obj.get(3));
     
     
    
    
        
    }

}

