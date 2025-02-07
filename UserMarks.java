import java.util.Scanner;
class UserMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks:-");
		double marks = sc.nextDouble();
		double per = (marks/600)*100;
		System.out.println("The Percentage marks is:-" + per);
		System.out.println((per>=75)?("GardeA:-"+per+"%"):
							(per>=60)?("GradeB:-"+per+"%"):
							(per>=35)?("GradeC:-"+per+"%"):("Failed"));


	}
}
