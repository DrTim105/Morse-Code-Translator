
package gameofcraps;

import java.util.Random;
public class GameOfCraps
{
    private static final Random randomNumbers = new Random();
    
    private enum Status {CONTINUE, WON, LOST};
    
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    public static void main(String[] args)
    {
        int [] array1 = new int [22];
        int [] array2 = new int [22];
        double total = 0;
        double product = 0;
        double total1 = 0;
        double total2 = 0;
        double pass = 0;
        
        Status gameStatus;
        for (int counter = 1; counter <= 1000000; counter++)
        {
            int myPoint = 0;
            int count = 1;
            int sumOfDice = rollDice();
        
            switch (sumOfDice)
            {
                 case SEVEN:
                    case YO_LEVEN:
                        gameStatus = Status.WON;
                        ++array1[1];
                        ++pass;
                        break;

                    case SNAKE_EYES:
                    case TREY:
                    case BOX_CARS:
                        gameStatus = Status.LOST;
                        ++array2[1];
                        break;

                    default:
                        gameStatus = Status.CONTINUE;
                        myPoint = sumOfDice;
                        
                        break;
            }

            while (gameStatus == Status.CONTINUE)
            {
                ++count;
                sumOfDice = rollDice();

                if (sumOfDice == myPoint)
                    {
                        if(count > 20)
                            ++array1[21];
                        else
                            ++array1[count];
                        ++pass;
                        gameStatus = Status.WON;
                        break;
                    }
                else
                    if (sumOfDice == SEVEN)
                    {
                        if(count > 20)
                            ++array2[21];
                        else
                            ++array2[count];

                        gameStatus = Status.LOST;
                        break;
                    }
            }
        }
        
        System.out.printf("%s%10s%10s\n", "Roll", "Wins", "Loss");
        
        for(int roll = 1; roll <= 21; roll++)
        {
            System.out.printf("%4d%10d%10d\n", roll, array1[roll], array2[roll]);
            
            product += roll * (array1[roll] + array2[roll]);
            total1 += array1[roll];
            total2 += array2[roll];
        }
        
        System.out.printf("Average length of a game of craps(mean): %.1f\n", 
                    product / (total1 +total2));
        
        System.out.printf("Chances of winning: %.2f percent\n", (total1 / 1000000) * 100 );
    }
    
     public static int rollDice()
    {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        
        int sum = die1 + die2;
        
        
        return sum;
    }
}

