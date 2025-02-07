// Check wheather given Character is a digit or not using conditionl Operator:



import java.util.Scanner;
class DigitCase
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character:");
		char ch = sc.next().charAt(0);
		System.out.println((ch>='0' && ch<='9')?("The Charater is a Digit"):("The charater is not a Digit"));
			
	}
}
