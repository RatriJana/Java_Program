import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in)
		System.out.println("Enter the  Alphabet:-");
		char ch = sc.next().CharAt(0);
		System.out.println((ch == 'a'||'e'||'i'||'o'||'u' )?("The Character is a vowel"):("The Character is a Consent"));
	}
}
