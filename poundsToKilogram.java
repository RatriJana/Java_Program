// Convert Pounds intp kilogram
// Write a program that converts Pounds into Kilograms. The program prompts the user to enter a number in pounds,
// converts it to kilograms, and displays the result. one Pound is 0.454 kilograms.

import java.util.Scanner;
class poundsToKilogram
  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in pounds:");
		double pounds = sc.nextDouble();
		double kilograms = pounds*0.454;
		System.out.println("pounds to kilograms is :-" + kilograms);

	}
}
