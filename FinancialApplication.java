//write a program that reads the subtotal and the gratuity rate, then computes the gratuity and tottal.
//for ecample, if the user enter 10 for subtotal and 15% for gratutity rate, the program displays $1.5 as 
//gratutiy and $11.5 as total.Here is a sample run:

import java.util.Scanner;
class TipCalculation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill:-");
		float bill = sc.nextFloat();
		System.out.println("Tip Rate :-");
		float tipRate = sc.nextFloat();

		float tipAmount = (tipRate*bill)/100;
		float totalBill = bill+tipAmount;
		System.out.println("totalBill is :"+totalBill);
		System.out.println("Tip Added is :"+tipAmount);


	}
}
