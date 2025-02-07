class FourNo_Product 
{
	public static void main(String[] args) 
	{
		int num = 5555;
		int product = 1;

		int rem = num%10;
		product = product*rem;

		num = num/10;
		rem = num%10;
		product = product*rem;

		num = num/10;
		rem = num%10;
		product = product*rem;

		num = num/10;
		rem = num%10;
		product = product*rem;

		System.out.println("prouduct of digits is:" + product);
		

	}
}
