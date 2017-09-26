import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name?");
		String s = input.next();
		System.out.println("Thanks, " + s);
		while(true)
		{
			try
			{
				System.out.println("How old are you?");
				int num = input.nextInt();
				System.out.print("You are ");
				if (num < 20)
				{
					System.out.println("young.");
				}
				else if (num < 60)
				{
					System.out.println("average aged.");
				}
				else
				{
					System.out.println("old.");
				}
				break;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Sorry, you typed an error: " + e);
			}
		}
	}

}
