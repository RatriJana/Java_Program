//These program has the swapping Problem with third value:

class SwappingProblem
{
	public static void main(String[] args) 
	{
		int a = 4;
		int b = 5;
		System.out.println("Before Swapping");
		System.out.println("a: " +a);
		System.out.println("b:" +b);
		int temp = a;
		a = b;
		b = temp ;
		System.out.println("After Swapping:");
		System.out.println("a:  "+a);
		System.out.println("b: " +b);
	}
}
