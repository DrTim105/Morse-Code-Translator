
package cryptograph;

import java.util.Scanner;
public class Decryptor
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner( System.in );
        
        int number = 0, number2 = 0, decrypt = 0, d = 1, digit = 0;
        System.out.print("Enter number: ");
        number = input.nextInt();
        number2 = (number / 100) + ((number % 100) * 100);
        
        while (number2 != 0)
        {
            
            digit = number2 % 10;
            digit = (digit + 10) - 7;
            digit %= 10;
            decrypt += (d * digit);
            d *= 10;
            number2 /= 10;
        }
        
        System.out.printf("decryption of %d is %d\n", number, decrypt);
    }
         

}


