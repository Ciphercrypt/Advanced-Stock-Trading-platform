public class NewBalance extends BuyandSell {
	
	private double newBalance;
	private double bitcoinBalance;
	private double litecoinBalance;
	private double rippleBalance;
	
	public NewBalance() 
	{
		super();
		
		
	}

	public void increaseBalance(double amount)
    {
        newBalance = newBalance + amount;
    }
	
	public void decreaseBalance(double amount)
    {
        newBalance = newBalance - amount;
    }
	
	public double getnewBalance() 
	{
		return newBalance;
	}
	
	public double bitcoinBalance(double amount) 
	{
		bitcoinBalance = amount + bitcoinBalance;
		return bitcoinBalance;
		
	}
	
	public double litecoinBalance(double amount) 
	{
		litecoinBalance = amount + litecoinBalance;
		return litecoinBalance;
	}
	
	public double rippleBalance(double amount) 
	{
		rippleBalance = amount + rippleBalance;
		return rippleBalance;
	}
}