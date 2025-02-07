// Find the number of years 
// Write a Program that prompts the user to enter the minutes
//(eg., 1 billion), and displays the number of years and days for the minutes.
//For simplicity, assume a years has 365 days.

import java.util.Scanner;
class NumberOfYears 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no in minutes:-");
		long min = sc.nextLong();
		long minInYears = 365 * 24 * 60;
		long minInDays = 24 * 60;

		long years = min/minInYears;
		long remainingMin = min%minInYears;
		long days = remainingMin / minInDays;

		System.out.println("years" + years +  "Days" +days+ "Minutes" + min);
	}
}















 