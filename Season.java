import java.util.Scanner;
class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first three char of Season");
		string sea = sc.next().toUpperCase();
		System.out.println((sea.equals("oct") || sea.equals("nov") || sea.equals("dec") || sea.equals("jan")?("The season is Winter"):
							(sea.equals("feb") || sea.equals("mar") || sea.equals("apr") || sea.equals("may")?("The Season is Summer"):
							(sea.equals("jun") || sea.equals("jul") || sea.equals("aug")|| sea.equals("sep")?("The Season is Monsoon"):("Invalid"));
	}
}
