
package cryptograph;

import java.util.Scanner;
public class Encryptor
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner( System.in );
        
        int number = 0, number2 = 0, crypt = 0, d = 1, digit = 0;
        System.out.print("Enter number: ");
        number = input.nextInt();
        number2 = number;
        
        while (number2 != 0)
        {
            
            digit = number2 % 10;
            digit = ( digit + 7) % 10;
            crypt += (d * digit);
            d *= 10;
            number2 /= 10;
        }
        
        crypt = (crypt / 100) + ((crypt % 100) * 100);
        
        System.out.printf("encryption of %d is %d\n", number, crypt);
    }
         

}
