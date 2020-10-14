import java.util.Scanner;

public class SquaresAndCubes
{
	public static void main(String[] args)
	{
		int userInt = 0;
		String userResponse = "";
		
		//Create a nested loop that will create spaces in between the Number, Squared, and Cubed values based on the length each integer.
		do
		{
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter an integer.\n");
			userInt = scnr.nextInt();
			System.out.println("Number   Squared   Cubed");
			System.out.println("======   =======   =====");
			
			for (int i = userInt; i > 0; i--)
				{
				int number = i;
				int square = i * i;
				int cube = square * i;
				int numberSpace = 9 - String.valueOf(number).length();
				int squareSpace = 10 - String.valueOf(square).length();
				String numberGap = String.format("%1$"+numberSpace+"s", "");
				String squareGap = String.format("%1$"+squareSpace+"s", "");
				System.out.println(number + numberGap + square + squareGap + cube);
			}	
			System.out.println("\n Would you like to be continue? (y/n)");
			userResponse = scnr.next();
	} while (userResponse.equals("y"));
		
		System.out.println("Goodbye.");
	}

}