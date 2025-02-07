//Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formula:

import java.util.Scanner;
class VolumeOfCylinder
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		float radius = sc.nextFloat();
		float pi = 22/7;
		float height = sc.nextFloat();
		System.out.println("Enter the value of height:");
		float area = pi*radius*radius;
		System.out.println("Area of the cylinder:" + area);
		float volume = area*height;
		System.out.println("The Volume is :"+volume);
		
		

	}
}
