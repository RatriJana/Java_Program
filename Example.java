// Month to year
// 12 months = 1 years 
//20? = how much 
class Example
{
	public static void main(String[] args) 
	{
		int months = 20;
		int year = months/12;
		int mnth = months%10;
		System.out.println(year + (mnth/10.0));
	}
}
