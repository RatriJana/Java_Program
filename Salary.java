import java.util.Scanner;
class Salary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary:-");
		
		double salary = sc.nextDouble();

		if (salary>=0 && salary<=1200000)
		{
			System.out.println("No need to pay the tax");
		}
		else if (salary>=1200000 && salary<=1600000)
		{
			System.out.println("The amount of tax you need to pay:-" +(salary*0.15));
		}
		else if (salary>=1600000 && salary<=2000000)
		{
			System.out.println("The amount of tax you need to pay:-" +(salary*0.2));
		}
		else if (salary>=2000000 && salary<=2400000)
		{
			System.out.println("The amount of tax you need to pay:-" +(salary*0.25));
		}
		else if (salary>=2400000)
		{
			System.out.println("The amount of tax you need to pay:-" +(salary*0.3));
		}
		else
		{
			System.out.println("invalid Entery");
		}


	}
}
