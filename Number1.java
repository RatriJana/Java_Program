import java.util.Scanner;
class Number1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int num = sc.nextInt();
		System.out.println((num%2==0 && num%5==0)?("HiTwo"):("HiFive"));
	}
}
