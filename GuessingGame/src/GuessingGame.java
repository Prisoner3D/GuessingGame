/*
 * Name: Thomas Zhou
 * Date : 9/26/2017
 * Description: Guessing game with numbers from 1 to 10.
*/

import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessingGame {
	
	public static void main(String[] args) {
		
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
				input.next();
			}
		}
		int min = 1;
		int max = 100;
		int guess = (int)(max * Math.random() + min);
		System.out.println("Great, now let's play a game. I have a number between " + min + " and " + max + " and I want you to guess the number.");
		System.out.println("I'll tell you if your guess is too high or too low.");
		System.out.println("What's your guess?");
		int attempt = 1;
		while (true)
		{
			try
			{
				int g = input.nextInt();
				if (g < min || g > max)
				{
					System.out.print(g + " is out of the range! ");
					System.out.println("What's your guess?");
					attempt++;
				}
				else if (g > guess)
				{
					System.out.print(g + " is too high! ");
					System.out.println("What's your guess?");
					attempt++;
				}
				else if (g < guess)
				{
					System.out.print(g + " is too low! ");
					System.out.println("What's your guess?");
					attempt++;
				}
				else
				{
					break;
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Sorry, you typed an error: " + e);
				System.out.println("What's your guess?");
				input.next();
			}
		}
		System.out.println("Correct! You took " + attempt + " attempts.");
		
	}

}
