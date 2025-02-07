import java.util.Scanner;
class Season1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first three char of Season");
		String sea = sc.next().toUpperCase();
		String op = (sea.equals("OCT")) || (sea.equals("NOV")) || (sea.equals("DEC")) || (sea.equals("JAN"))?sea + ":- The season is Winter":
					(sea.equals("FEB")) || (sea.equals("MAR")) || (sea.equals("APR")) || (sea.equals("MAY"))?sea + ":- The Season is Summer":
					(sea.equals("JUN")) || (sea.equals("JUL")) || (sea.equals("AUG")) || (sea.equals("SEP"))?sea + ":- The Season is Monsoon":"Invalid";
		System.out.println(op);
	}
}