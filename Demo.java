import java.util.Scanner;
class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number1:-");
		int num1 = sc.nextInt();
		System.out.print("enter the number2:-");
		int num2 = sc.nextInt();
		System.out.print("The answer is :-");
		int op = num1+num2;
		System.out.println(op);
	}
}
