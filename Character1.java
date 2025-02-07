import java.util.Scanner;
class Character1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character:")'
		char ch = sc.next().charAt(0);
		System.out.println((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?
			((ch>='a' && ch<='z')?(ch+"The Charater is Lower case Alpahabet"):(ch+"The charater is Upper case Alphabet")):
			((ch>='0' && ch<='9')?(ch+"is a digit"):(ch+"is a special Character"));
			
	}
}