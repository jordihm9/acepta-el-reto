package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int number;
        String userInput;
        int total;
        String operation;
        boolean loop = true;

        // loop program
        while (loop) {
            total = 0; // reset total
            operation = ""; // reset output
            number = sc.nextInt(); // user input

            if (number < 0) {
                loop = false;
            } else {
                userInput = String.valueOf(number);

                for (int i = 0; i < userInput.length(); i++) {
                    total += Integer.parseInt(String.valueOf(userInput.charAt(i))); // add the sum of previous numbers to next

                    // construct the output of the sum
                    if (i == userInput.length() - 1) {
                        operation += String.valueOf(userInput.charAt(i)) + " = ";
                    } else {
                        operation += String.valueOf(userInput.charAt(i)) + " + ";
                    }
                }

                System.out.println(operation + total); //print result
            }
        }
        sc.close();
    }
}
