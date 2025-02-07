//Write a program the display the area and Perimeter of a circle that 
//has a radius of 5.5 using the following formula 

import java.util.Scanner;
class Area_of_Circle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final float pi = 22/7;
		System.out.println("Enter the valuve of Radius: ");
		float radius = sc.nextFloat();
		float area = pi*(radius*radius);
		float perimeter = 2*pi*radius;
		System.out.println("Area of the circle is : " + area + "cm^2");
		System.out.println("Perimeter of the Circle is: " + perimeter + "cm");
		
	}
}
