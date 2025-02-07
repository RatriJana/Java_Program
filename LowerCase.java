// Check wheather the given Character is a lower case or not using Conditional Operation:



import java.util.Scanner;
class LowerCase
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lower Case Character:");
		char ch = sc.next().charAt(0);
		System.out.println((ch>='a' && ch<='z')?("The Charater is Lower case"):("The charater is not a lower case"));
			
	}
}
