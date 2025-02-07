// Write a Program that reads a celsius degree in a double value from the console, then converts it to fahrenheit and displays the result.

import java.util.Scanner;
class Celsius
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Celsius:");
		double celsius = sc.nextDouble();
		double fahrenhit = (9.0/5)*celsius+32;
		System.out.println("Fahrenhit is :" + fahrenhit);

	}
}
