import java.util.Scanner;
import java.util.*;



public class BuyandSell extends Stocks {
    //constructor that get variable from superclass
    private double userBalance;
    private double bitcoinBought;
    private double litecoinBought;
    private double rippleBought;
    
    
    public BuyandSell() 
    {
        super(5000,150,0.45);
        userBalance = 10000;
        bitcoinBought = 0;
        litecoinBought = 0;
        rippleBought = 0;
        
    }


    public double getuserBalance() {
        
        return userBalance;
    }
    
    public double getBitcoinBalance() {
        
        return bitcoinBought;
    }
    
    
    public double getLitecoinBalance() {
        
        return litecoinBought;
    }
    
    public double getRippleBalance() {
        
        return rippleBought;
    }


    //asks user if they want to buy or sell stock
    public int askUser() 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bitcoin");
        names.add("Litecoin");
        names.add("Ripple");
        int userChoice=0;
        System.out.println("Enter 1 if you would like to buy " + names.get(0)+"?");
        System.out.println("Enter 2 if you would like to buy " + names.get(1)+"?");
        System.out.println("Enter 3 if you would like to buy " + names.get(2)+"?");
        System.out.println("Enter 4 if you would like to sell " + names.get(0)+"?");
        System.out.println("Enter 5 if you would like to sell " + names.get(1)+"?");
        System.out.println("Enter 6 if you would like to sell " + names.get(2)+"?");
       try{
        userChoice = scanner.nextInt();
       
        if(userChoice == 1) 
        {
            buyBitcoin();
        }
        
        else if(userChoice == 2) 
        {
            buyLitecoin();
        }
        
        else if(userChoice == 3) 
        {
            buyRipple();
    
        }
        
        else if(userChoice == 4) 
        {
            sellBitcoin();
    
        }
        
        
        else if(userChoice == 5) 
        {
            sellLitecoin();
    
        }
        
        else if(userChoice == 6) 
        {
            sellRipple();
    
        }
    
    return userChoice;
}
    
        catch(Exception e)
        {
        System.out.println("Exception occurred");
        System.out.println("You should not enter a string, only integer numbers accepted");
        askUser();
        
        }
    
return userChoice;   
    
}

    
    
    
    public double buyBitcoin() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many units of bitcoin you would like to purchase?");
        double bitcoinUnits = scanner.nextDouble();
        
        double bitcoinPurchase = (bitcoinUnits * super.getBitcoin());
        
        System.out.println("You bought "+ bitcoinUnits + " at " + super.getBitcoin() + " it cost you " + bitcoinPurchase);
        
        userBalance = userBalance + bitcoinPurchase;
        
        bitcoinBought = (bitcoinBought + bitcoinUnits);
        
        
        return userBalance;
    }
    
    

    public double buyLitecoin() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many units of litecoin you would like to purchase?");
        double litecoinUnits = scanner.nextDouble();
        double litecoinPurchase = (litecoinUnits * super.getLitecoin());
        
        System.out.println("You bought "+ litecoinUnits + " at " + super.getLitecoin() + " it cost you " + litecoinPurchase);
        
    
        userBalance = userBalance - litecoinPurchase;
        
        litecoinBought = (litecoinBought + litecoinUnits);
        
        
        return userBalance;
        
    }
    
    public double buyRipple() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many units of Ripple you would like to purchase?");
        double rippleUnits = scanner.nextDouble();
        double ripplePurchase = (rippleUnits * super.getRipple());
        
        System.out.println("You bought "+ rippleUnits + " at " + super.getRipple() + " it cost you " + ripplePurchase);
        

        userBalance = userBalance - ripplePurchase;
        
        rippleBought = (rippleBought + rippleUnits);
        
        
        return userBalance;
        
    }
    
    
    public double sellBitcoin() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many units of Bitcoin you would like to sell?");
        double bitcoinUnits = scanner.nextDouble();
        double bitcoinSold = (bitcoinUnits * super.getBitcoin());
        
        System.out.println("You sold "+ bitcoinUnits + " units of Bitcoin at " + super.getBitcoin() + "pounds" + " you gained " + bitcoinSold + "pounds.");
        

        userBalance = userBalance + bitcoinSold;
        
        
        return userBalance;
        
    }
    
    public double sellLitecoin() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many units of Litecoin you would like to sell?");
        double litecoinUnits = scanner.nextDouble();
        double litecoinSold = (litecoinUnits * super.getLitecoin());
        
        System.out.println("You sold "+ litecoinUnits + " units of Litecoin at " + super.getLitecoin() + "pounds" + " you gained " + litecoinSold + "pounds.");
        

        userBalance = userBalance + litecoinSold;
        
        
        return userBalance;
        
    }
    
    
    public double sellRipple() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many units of Ripple you would like to sell?");
        double rippleUnits = scanner.nextDouble();
        double rippleSold = (rippleUnits * super.getRipple());
        
        System.out.println("You sold "+ rippleUnits + " units of Ripple at " + super.getRipple() + "pounds" + " you gained " + rippleSold + "pounds.");
        

        userBalance = userBalance + rippleSold;
        
        
        return userBalance;
        
    }
    
    
    public void printStocks(double bitcoin,double litecoin, double ripple) 
    {   
        
        System.out.println("The price of bitcoin is: " + bitcoin);
        System.out.println("You currently have: " + bitcoinBought);
        System.out.println("The price of litecoin is: " + litecoin);
        System.out.println("The price of litecoin is: " + litecoinBought);
        System.out.println("The price of ripple is: " + ripple);
        System.out.println("The price of ripple is: " + rippleBought);
    }
   

    }
    
    

    
    
    
    


