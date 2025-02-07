//Body Mass Index(bmi) is a measure of health on weight. It Can be calculated by taking your weight in Kilogram and dividing
//by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI
// one pound 0.45359237 kilogram, and one inch is 0.0254 meters.




import java.util.Scanner;
class BmiCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in pounds:");
		double WeiInPounds = sc.nextDouble();
		System.out.println("Enter the height in inches:");
		double heiInInches = sc.nextDouble();

		 double weightInKilogram = WeiInPounds * 0.453592237;
		 double heightInMeters = heiInInches * 0.0254;
		
		double bmi = weightInKilogram / (heightInMeters * heightInMeters);
		System.out.println("your Bmi is :-" + bmi);

	}
}
