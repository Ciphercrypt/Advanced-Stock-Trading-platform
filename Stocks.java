
public class Stocks{
    

    private double bitcoin;
    private double litecoin;
    private double ripple;
    
    Stocks(double x, double y,double z) 
    {
        bitcoin = x;
        litecoin = y;
        ripple = z;
    }
    
        Stocks() 
    {
        
    }
    
    //getter method to get bitcoin price
    public double getBitcoin() 
    {
        return bitcoin;
    }
    
    //getter method to get litecoin price
    public double getLitecoin() 
    {
        return litecoin;
    }
    
    //getter method to get ripple price
    public double getRipple() 
    {
        return ripple;
    }
    
    //prints stocks with their name and price
    public void printStocks(double bitcoin,double litecoin, double ripple) 
    {
        System.out.println("The price of bitcoin is: " + bitcoin);
        System.out.println("The price of litecoin is: " + litecoin);
        System.out.println("The price of ripple is: " + ripple);
    }
}
    
