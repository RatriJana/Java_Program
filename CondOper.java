class CondOperExample 
{
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 5;
		int c = 6;
		// a>b 1 5 b>c 5  6 a>c 1  c
		int larg = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
	}
}
