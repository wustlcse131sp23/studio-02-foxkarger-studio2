package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("start amount: ");
		double startAmount= in.nextDouble();

		System.out.print("win chance: ");
		double winChance = in.nextDouble();

		System.out.print("win limit: ");
		double winLimit= in.nextDouble();

		System.out.print("How many days do you want to gamble?");
		int totalSimulations = in.nextInt();

		double x= startAmount;
		int  count =0;
		int countDays=0;
		
		for ( countDays=0; countDays < totalSimulations; countDays ++)
		{
			x= startAmount;
			while (x>0 && x<winLimit) 
			{
				double y = Math.random();
				if (y<= winChance)
				{
					x++;
					count++;
			//		System.out.println( count +" won");
				}
				else 
				{
					x--;
					count++;
				//	System.out.println(count +" lost");
				}
			}
			
			count++;
			if (x>0)
				System.out.println("Simulation " +countDays+": Won in " +count+ " games");
			else
				System.out.println("Simulation "+countDays+" Lost in " +count+ " games");

		}
		
		
		System.out.println("final amount: " + x);
		System.out.println("days: " + countDays);













	}

}
