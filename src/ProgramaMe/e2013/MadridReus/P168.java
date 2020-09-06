package ProgramaMe.e2013.MadridReus;

import java.util.Scanner;

public class P168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int numPieces;
        int pieceNum;
        int missingPiece = 0;
        int[] pieces;
        boolean exit = false;

        do {

            numPieces = sc.nextInt(); // user input

            if (numPieces == 0) {
                exit = true;
            } else {

                pieces = new int[numPieces];

                for (int i = 0; i < numPieces - 1; i++) {
                    pieceNum = sc.nextInt(); // user input

                    // save the number entered in the correct position position, so no need to sort later
                    pieces[pieceNum - 1] = pieceNum;
                }

                // check for the missing number
                for (int i  = 0; i < pieces.length; i++) {
                    if (pieces[i] == 0) {
                        missingPiece = ++i;
                        break;
                    }
                }

                System.out.println(missingPiece);// output

            }

        } while (!exit);

        sc.close();
    }
}
