/*class Loops 
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(i+" ");
		}
	}
}
*/

/*class Loops 
{
	public static void main(String[] args) 
	{
		
		for (char i='a';i<='z' ;i++ )
		{
			System.out.println(i+" ");
		}
	}
}
*/

/*class Loops 
{
	public static void main(String[] args) 
	{
		
		for (char i='A';i<='Z' ;i++ )
		{
			System.out.println(i+" ");
		}
	}
}
*/

/*class Loops 
{
	public static void main(String[] args) 
	{
		
		for (char i='A';i>='Z' ;i-- )
		{
			System.out.println(i+" ");
		}
	}
}
*/

/*class Loops 
{
	public static void main(String[] args) 
	{
		
		for (char i='0';i<='9' ;i++ )
		{
			System.out.println(i+" ");
		}
	}
}
*/


/*class Loops 
{
	public static void main(String[] args) 
	{
		
		for (int i=0;i<=127 ;i++ )
		{
			System.out.println("The Ascii for:-"+i+" "+(char)i);
		}
	}
}
*/


import java.util.Scanner;
class Loops
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table:");
		int num = sc.nextInt();
		System.out.println("Enter the range:");
		int range  = sc.nextInt();

		for(int i = 1 ; i<=range ;i++)
		{
		System.out.println(num+"X"+i+"="+(num * i ));
		}
	}

}

