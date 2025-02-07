import java.util.Scanner;
class UpperCase
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character:");
		char ch = sc.next().charAt(0);
		System.out.println(ch>='A' && ch<='Z')?("The Charater is upper case"):("The charater is lower case");
			
	}
}
