// Check %2 it print "HiTwo", %5 it print "HiFive", %2and%5 print "HiTwoHiFive" ,or else blank;  


import java.util.Scanner;
class HiTFBlank  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println((num%2==0 && num%5==0)?("HiTwoHiFive"):(num%2==0)?("HiTwo"):(num%5==0)?("HiFive"):(""));
	}
}
