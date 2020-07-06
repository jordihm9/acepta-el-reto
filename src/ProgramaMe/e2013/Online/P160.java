package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        boolean loop = true;
        boolean isTriangular = true;
        int nSides;
        int[][] array;

        // loop program
        while (loop) {
            isTriangular = true; // reset to set by default
            nSides =  sc.nextInt(); // user input number of rows and columns in one

            if (nSides == 0) {
                loop = false;
            } else {
                array = new int[nSides][nSides]; // set array dimensions

                // fill array
                for (int r = 0; r < nSides; r++) {
                    for (int c = 0; c < nSides; c++) {
                        array[r][c] = sc.nextInt(); // user input
                    }
                }


                /* 5 nSides
                00 01 02 03 04
                10 11 12 13 14
                20 21 22 23 24
                30 31 32 33 34
                40 41 42 43 44
                 */
                // check half bottom left
                for (int r = nSides - 1; r > 0 ; r--) {
                    for (int c = 0; c < r; c++) {
                        if (array[r][c] != 0) {
                            isTriangular = false;
                            break;
                        }
                    }
                    if (!isTriangular) {
                        break;
                    }
                }

                if (isTriangular) {
                    System.out.println("SI"); // print output
                } else { // if the half bottom left haven't passed the test, check the half top right
                    isTriangular = true; // reset again to set default
                    // check half top right
                    for (int c = 1; c < nSides; c++) {
                        for (int r = 0; r < c; r++) {
                            if (array[r][c] != 0) {
                                isTriangular = false;
                                break;
                            }
                        }
                        if (!isTriangular) {
                            break;
                        }
                    }
                    if (isTriangular) {
                        System.out.println("SI"); // print output
                    } else {
                        System.out.println("NO"); // print output
                    }
                }

            }


        }

        sc.close();
    }
}
