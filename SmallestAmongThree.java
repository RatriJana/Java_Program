// Find the Smallest of three number by conditional Operator:


class SmallestAmongThree 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 8;
		int c = 3;
		// a>b = 5>1= True b>c 1>7 False  c>a= 7>5 true
		int ans = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));

		System.out.println("Smallest number amoung three is :" + ans);
	}
}
