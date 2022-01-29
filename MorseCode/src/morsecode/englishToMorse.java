package morsecode;

import java.util.Scanner;

public class englishToMorse {

    public static void main(String[] args) {

        // array of international morse code
        char[] letter = {'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0',};
        String[] code
                = {".-", "-...", "-.-.", "-..", ".", "..-.",
                    "--.", "....", "..", ".---", "-.-", ".-..",
                    "--", "-.", "---", ".--.", "--.-", ".-.",
                    "...", "-", "..-", "...-", ".--", "-..-",
                    "-.--", "--..", ".----", "..---", "...--", "....-",
                    ".....", "-....", "--...", "---..", "----.", "-----"};

        // get sentence from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter: ");
        String sentence = scanner.nextLine();

        // process user sentence
        String toUpperCase = sentence.toUpperCase();
        String[] tokens = toUpperCase.split("\\s+");

        for (String token : tokens) {
            char[] charArray = token.toCharArray();

            for (char character : charArray) {
                for (int i = 0; i < letter.length; i++) {
                    if (character == letter[i]) {
                        System.out.print(code[i] + " ");
                        break;
                    }
                }
            }

            System.out.print("  ");
        }
    }

}
