import java.util.Scanner;
class BmiCalculator1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in pounds:");
		double WeiInPounds = sc.newDouble();
		System.out.println("Enter the height in inches:");
		double heiInInches = sc.newDouble();

		 double weightInKilogram = WeiInPounds * 0.453592237;
		 double heightInMeters = heiInInches * 0.0254;
		
		double bmi = weightInKilogram / (heightInMeters * heightInMeters);
		System.out.println("your Bmi is :-" + bmi);

	}
}
