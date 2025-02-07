// (population Projection)
//The IndiaN Census Bureau projects Population based on the Following assumptions:
// One birth every 7 seconds 
//One death every 13 seconds 
//One new immigrant every 45 seconds
//Write a program to display the population for each of the next five years. Assume the current Population in
//312,032,486 and one year has 365 days.


class Census
{
	public static void main(String[] args) 
	{
		long currpop = 312032486;
		final long seconds = (365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long imm = seconds/45;
		long newpop = currpop+birth-death+imm;
		System.out.println("Current population is:" + currpop);
		System.out.println("New Population is :" + newpop);
	}
}
