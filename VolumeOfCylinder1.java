import java.util.Scanner;
class VolumeOfCylinder1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of radius");
		float radius = sc.nextFloat();
		float pi = 22/7;
		System.out.println("Enter the value of height:");
		float height = sc.nextFloat();
		float area = pi*radius*radius;
		System.out.println("Area of the cylinder:" + area);
		float volume = area*height;
		System.out.println("The Volume is :"+volume);
	}
}
