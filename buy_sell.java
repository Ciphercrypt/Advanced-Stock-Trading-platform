package stockMarketInvestor;

import java.util.Scanner;

public class buy_sell extends Stocks {
	
	public buy_sell() 
	{
		super();
	}

	
	public String askUser() 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to 'buy' or 'sell' stock?");
		String userChoice = scanner.nextLine();
		return userChoice;
		
	}
	
	public int buyORsellStock() 
	{	
		if (askUser().equals("buy")) 
		{	Scanner scanner = new Scanner(System.in);
			System.out.println("Would you like to buy bitcoin(1),litecoin(2) or ripple(3)");
			int userStockChoice = scanner.nextInt();
			return userStockChoice;
		}
		
		else if (askUser().equals("sell"))
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Would you like to sell bitcoin(1),litecoin(2) or ripple(3)");
			int userStockChoice = scanner.nextInt();
			return userStockChoice;
			
		}
		return 0;
			
		
	}

	
	public static double buybitcoin() 
	{
		if(userStockChoice == 1) 
		{
			balance = balance - bitcoin;
			return balance;
		}
		return userStockChoice;
	}
	
	public static double buylitecoin(int userStockChoice, double litecoin,double balance) 
	{
		if(userStockChoice == 2) 
		{
			balance = balance - litecoin;
			return balance;
		}
		return userStockChoice;
	}
	
	public static double buyripple(int userStockChoice, double ripple, double balance) 
	{
		if(userStockChoice == 3) 
		{
			balance = balance - ripple;
			return balance;
		}
		return userStockChoice;
	}
	
	
	
	
	
	
	
}
