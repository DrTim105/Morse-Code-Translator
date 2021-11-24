package guessthenumber;


import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String [] args)
    {
        Random randomNumbers = new Random();
        Scanner input = new Scanner(System.in);
        
        int choice = 1;
        while (choice == 1)
        {
            int number = 1 + randomNumbers.nextInt(100);
            int count = 1;
            System.out.print("Guess the number : ");
            int guess = input.nextInt();
            guessNumbers(guess,number);

            while (guess != number)
            {
                System.out.print("Guess the number : ");
                guess = input.nextInt();
                guessNumbers(guess,number);
                count++;
            }
            
            if (count <= 5)
                System.out.println("Ah! You know the secret!");
            else
                System.out.println("You should be able to do better");
            
            
            System.out.print("Enter 1 to continue and 0 to quit");
            choice = input.nextInt();

        }
    }
    
    public static void guessNumbers(int guess, int number)
    {
        if (guess > number)
            System.out.println("Too high. Try again");
        
        if (guess < number)
            System.out.println("Too low. Try again");

        if (guess == number)
            System.out.println("Congratulations. You guessed the number!");
    }
    
}            

