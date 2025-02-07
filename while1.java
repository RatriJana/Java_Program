/*class while1 
{
	public static void main(String[] args) 
	{
		int start = 0;
		while (start<5)
		{
			System.out.println("GOOD NIGHT");
			start++;
		}
	}
}
*/

/*class while1
{
	public static void main(String[] args)
	{
		int start = 1;
		while (start<=100)
		{
			System.out.println(start+" ");
			start++;
		}
	}
}
*/



class while1
{
	public static void main(String[] args)
	{
		char uppercase = 'A'; // Starting uppercase letter
        char lowercase = 'a'; // Starting lowercase letter

        // Printing A to Z
        System.out.println("Uppercase Letters (A to Z):");
        while (uppercase <= 'Z') 
		{
            System.out.print(uppercase + " ");
            uppercase++;
        }

        System.out.println("\n\nLowercase Letters (a to z):");
        // Printing a to z
        while (lowercase <= 'z')
		{
            System.out.print(lowercase + " ");
            lowercase++;/

		}

	}

}