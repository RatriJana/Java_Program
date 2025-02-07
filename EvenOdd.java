// Print even and odd with moduleus % and without moduleus %

//1)Logic:
//num/2 == num/2.0
//2)Logic:
//(num/2)*2 == num
//3)logic:
//(num%2==0)

import java.util.Scanner;
class EvenOdd
  {
	public static void main(String[] args) 
	{
		System.out.println("Enter the number1:-");
		int num = new Scanner(System.in).nextInt();
		System.out.println(num%2==0);
		System.out.println((num/2)==(num/2.0));
		System.out.println((num/2)*2==num);

		
	}
}
