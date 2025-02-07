// Find the largest of three number by conditional Operator:

class LargestAmongThree 
{
	public static void main(String[] args) 
	{
		
		int a = 6;
		int b = 4;
		int c = 9;
		
		int ans = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));

		System.out.println("largest number amoung three is :" + ans);
	}
}
