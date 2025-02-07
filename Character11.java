//Check whether the enter character is upper, lower , digit or a special character in a
//conditional operator:


import java.util.Scanner;
class Character11
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character:-");
		int ch = sc.next().charAt(0);
		String op = ((ch>='A'&& ch<='Z')?("Upper case"):(ch>='a' && ch<='z')?("lower case"):
					(ch>='0'&& ch<='9')?("Digit"):("Special character"));
			
		System.out.println(op);
		
		


	}
}
