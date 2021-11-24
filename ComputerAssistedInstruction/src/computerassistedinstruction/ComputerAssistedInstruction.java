package computerassistedinstruction;

import java.util.Scanner;
import java.util.Random;

public class ComputerAssistedInstruction
{
    public static final Random randomNumbers = new Random();
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int pass = 0;
        int result = 0;
        
        System.out.print("E N T E R  1  T O  B E G I N :  ");
        int user1 = input.nextInt();
        
        System.out.print("1- addition problems\n2- subtraction problems\n3- multiplication"
                + "problems\n4- division problems\n5- random mixture\nEnter type of question: ");
        int type = input.nextInt();
        int typee = type;
        
        System.out.print("Enter difficulty level: ");
        int difficulty = input.nextInt();
        
        while (user1 == 1)
        {
            if (type == 5)
                typee = 1 + randomNumbers.nextInt(4);
            
            switch(typee)
            {
                case 1:
                    result = additionQuestions(difficulty);
                    break;
                case 2:
                    result = subtractionQuestions(difficulty);
                    break;
                case 3:
                    result = multiplicationQuestions(difficulty);
                    break;
                case 4:
                    result = divisionQuestions(difficulty);
            }
            
            int user2 = input.nextInt();
            counter++;
            int number = 1 + randomNumbers.nextInt(4);
            
            while (user2 != result)
            {
                switch (number)
                {
                    case 1:
                        System.out.println("No. Please try again.");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No. Keep trying.");
                }
                
                System.out.print("Ans: ");
                user2 = input.nextInt();
                counter++;
                if (counter == 10)
                    break;
            }
            
            if (user2 == result )
            {
                pass++;
                switch (number)
                {
                    case 1:
                        System.out.println("Very good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice work!");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                }
            }
            
            if (counter == 10)
            {
                pass *= 10;
                if (pass >= 75)
                    System.out.println("Congratulations, you are ready to go to the next level!");
                else
                    System.out.println("Please ask your teacher for extra help.");
                pass = 0;
                counter = 0;
            }
            
            System.out.print("E N T E R  0  T O  Q U I T  A N D  1  T O  C O N T I N U E :  ");
            user1 = input.nextInt();
        }
        
    }
    
     public static int additionQuestions(int difficulty)
    {
        int number1 = 0;
        int number2 = 0;
        
        if  (difficulty == 1)
        {
            number1 = 1 + randomNumbers.nextInt(9);
            number2 = 1 + randomNumbers.nextInt(9);
        }
        if  (difficulty == 2)
        {
            number1 = 1 + randomNumbers.nextInt(99);
            number2 = 1 + randomNumbers.nextInt(99);
        }
        if  (difficulty == 3)
        {
            number1 = 1 + randomNumbers.nextInt(999);
            number2 = 1 + randomNumbers.nextInt(999);
        }
        
        int sum = number1 + number2;
        
        System.out.printf("How much is %d plus %d?\nAns: ", number1, number2);
        
        return sum;
    }
     
    public static int subtractionQuestions(int difficulty)
    {
        int number1 = 0;
        int number2 = 0;
        
        if  (difficulty == 1)
        {
            number1 = 1 + randomNumbers.nextInt(9);
            number2 = 1 + randomNumbers.nextInt(9);
        }
        if  (difficulty == 2)
        {
            number1 = 1 + randomNumbers.nextInt(99);
            number2 = 1 + randomNumbers.nextInt(99);
        }
        if  (difficulty == 3)
        {
            number1 = 1 + randomNumbers.nextInt(999);
            number2 = 1 + randomNumbers.nextInt(999);
        }
        
        int difference = number1 - number2;
        
        System.out.printf("How much is %d minus %d?\nAns: ", number1, number2);
        
        return difference;
    }  
    
    public static int multiplicationQuestions(int difficulty)
    {
        int number1 = 0;
        int number2 = 0;
        
        if  (difficulty == 1)
        {
            number1 = 1 + randomNumbers.nextInt(9);
            number2 = 1 + randomNumbers.nextInt(9);
        }
        if  (difficulty == 2)
        {
            number1 = 1 + randomNumbers.nextInt(99);
            number2 = 1 + randomNumbers.nextInt(99);
        }
        if  (difficulty == 3)
        {
            number1 = 1 + randomNumbers.nextInt(999);
            number2 = 1 + randomNumbers.nextInt(999);
        }
        
        int product = number1 * number2;
        
        System.out.printf("How much is %d times %d?\nAns: ", number1, number2);
        
        return product;
    }
    
    
    public static int divisionQuestions(int difficulty)
    {
        int number1 = 0;
        int number2 = 0;
        
        if  (difficulty == 1)
        {
            number1 = 1 + randomNumbers.nextInt(9);
            number2 = 1 + randomNumbers.nextInt(9);
        }
        if  (difficulty == 2)
        {
            number1 = 1 + randomNumbers.nextInt(99);
            number2 = 1 + randomNumbers.nextInt(99);
        }
        if  (difficulty == 3)
        {
            number1 = 1 + randomNumbers.nextInt(999);
            number2 = 1 + randomNumbers.nextInt(999);
        }
        
        int quotient = number1 / number2;
        
        System.out.printf("How much is %d divided by %d?\nAns: ", number1, number2);
        
        return quotient;
    }
    
}
