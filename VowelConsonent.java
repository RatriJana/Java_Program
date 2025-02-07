// Check weather the given character is a vowel or concsonent in a conditional Operator:

import java.util.Scanner;
class VowelConsonent
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character:");
		char ch = sc.next().charAt(0);
		System.out.println((ch== 'a'|| ch== 'e'|| ch== 'i'|| ch== 'o'|| ch=='u')?
			("The Character is vowel"):("The Chacracter is Concsonent"));
	}
}
