import java.util.Scanner;
class CurrencyConverter
 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println(" CURRENCY CONVERTER");
		System.out.println();
		System.out.println("Enter the amount(INR) :");
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println("LIST OF CURRENCY");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println();
		System.out.println("ENTER THE CURRENCY");
		String curr = sc.next().toUpperCase();

		float conCurrency = 0;

		if (curr.equals("USD"))
		{
			conCurrency  = inr/86.56f;
			System.out.println(inr + " INR " + conCurrency + "USD");
		}
		else if (curr.equals("EUR"))
		{
			conCurrency  = inr/90.25f;
			System.out.println(inr + " INR " + conCurrency + "EUR");
		}
		else if (curr.equals("GBP"))
		{
			conCurrency  = inr/107.66f;
			System.out.println(inr + " INR " + conCurrency + "GBP");
		}
		else if (curr.equals("PKR"))
		{
			conCurrency  = inr/0.31f;
			System.out.println(inr + " INR " + conCurrency + "PRK");
		}
		else
		{
			System.out.println("INVALID OPTION:");
		}
	}
}
