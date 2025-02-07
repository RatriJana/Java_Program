class  SwappingWithoutThirdValue
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 4;
		System.out.println("Befor Swapping the value:");
		System.out.println("a:" +a);
		System.out.println("b:" + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping the value:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
