//Write a program that display the area and perimeter of a rectangle with the wideth of 4.5 and height of 7.9 using the following formula: 

import java.util.Scanner; 
class  AreaOfRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of height:");
		float height =sc.nextFloat();
		System.out.println("Enter the value of width:");
		float width =sc.nextFloat();
		float areaofrec = width*height;
		System.out.println("Area 0f Rectangle:" + areaofrec + "cm^2");
		float periofrec = 2*(height+width);
		System.out.println("Permeter of Rectangle:" + periofrec + "cm");

	}
}
