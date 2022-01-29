package morsecode;

import java.util.Scanner;

public class morseToEnglish {
    public static void main(String[] args) {
        
        // array of international morse code
        char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F',
                          'G', 'H', 'I', 'J', 'K', 'L',
                          'M', 'N', 'O', 'P', 'Q', 'R',
                          'S', 'T', 'U', 'V', 'W', 'X',
                          'Y', 'Z', '1', '2', '3', '4',
                          '5', '6', '7', '8', '9', '0',
                      };
        String[] code
            = { ".-", "-...", "-.-.", "-..", ".", "..-.", 
                "--.", "....", "..", ".---", "-.-", ".-..", 
               "--", "-.", "---", ".--.", "--.-", ".-.", 
                "...", "-", "..-", "...-", ".--", "-..-", 
                "-.--", "--..", ".----", "..---", "...--", "....-", 
                ".....", "-....", "--...", "---..", "----.", "-----"};
        
        // get code from user
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter morse code and press Enter: ");
        String morseCode = scanner.nextLine();
        
        // process morse code
        String[] tokens = morseCode.split("\\s+");
        
        for (String token: tokens) {
            for (int i = 0; i < code.length; i++) {
                if (token.equals(code[i])){
                    System.out.print(letter[i] + " ");
                    break;
                }
            }
        }
    }
}
