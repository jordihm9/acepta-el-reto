package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P162 {

    public static void topBottomLine() {
        System.out.print("|");
        for (int i = 0; i < 8 * cellSize; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }

    public static void cell(String character) {
        for (int i = 0; i < cellSize; i++) {
            System.out.print(character);
        }
    }

    public static int cellSize;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        boolean loop = true;
        String space = " "; // represents 'white'
        String userChar; // represents 'black' cells

        // loop program
        while (loop) {
            cellSize = sc.nextInt(); // user input the cell size

            if (cellSize == 0) {
                loop = false;
            } else {
                userChar = sc.next(); // user input the character to fill 'black' cells

                // print the top line
                topBottomLine();

                // print the table
                for (int i = 0; i < 8; i++) { // repeat for 8 rows
                    for (int r = 0; r < cellSize; r++) { // repeat row as many as cell size
                        if (i % 2 == 0) { // if row is even (parell) start with 'white' cell
                            System.out.print("|");
                            for (int j = 0; j < 8; j++) {
                                if (j % 2 == 0) {
                                    cell(space);
                                } else {
                                    cell(userChar);
                                }
                            }
                            System.out.println("|");
                        } else { // if row is odd (imparell) start with 'black' cell
                            System.out.print("|");
                            for (int j = 0; j < 8; j++) {
                                if (j % 2 != 0) {
                                    cell(space);
                                } else {
                                    cell(userChar);
                                }
                            }
                            System.out.println("|");
                        }
                    }

                }

                // print the bottom line
                topBottomLine();
            }
        }

        sc.close();
    }
}
