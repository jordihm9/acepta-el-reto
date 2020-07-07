package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        boolean loop = true;
        boolean isIdentidad = true;
        int n;

        // loop program
        while (loop) {
            n = sc.nextInt(); // n of rows and columns

            if (n == 0) {
                loop = false;
            } else {

                isIdentidad = true;

                int[][] array = new int[n][n]; // set array dimensions

                // fill the array
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < n; c++) {
                        array[r][c] = sc.nextInt();
                    }
                }

                // check diagonal
                for (int i = 0; i < n; i++) {
                    if (array[i][i] != 1) {
                        isIdentidad = false;
                        break;
                    }
                }

                if (isIdentidad) {
                    /*
                    // check half bottom right
                    for (int r = n - 1; r > 0 ; r--) {
                        for (int c = 0; c < r; c++) {
                            if (array[r][c] != 0) {
                                isIdentidad = false;
                                break;
                            }
                        }
                        if (!isIdentidad) {
                            break;
                        }
                    }

                    if (isIdentidad) {

                        // check half top left
                        for (int c = 1; c < n; c++) {
                            for (int r = 0; r < c; r++) {
                                if (array[r][c] != 0) {
                                    isIdentidad = false;
                                    break;
                                }
                            }
                            if (!isIdentidad) {
                                break;
                            }
                        }

                        if (isIdentidad) {
                            System.out.println("SI");
                        } else {
                            System.out.println("NO");
                        }

                    } else {
                        System.out.println("NO");
                    }
                    */
                    // replace all diagonal to 0
                    for (int i = 0; i < n; i++) {
                        array[i][i] = 0;
                    }

                    // check if all array is filled with 0's
                    for (int r = 0; r < n; r++) {
                        for (int c = 0; c < n; c++) {
                            if (array[r][c] != 0) {
                                isIdentidad = false;
                            }
                            if (!isIdentidad) {
                                break;
                            }
                        }
                        if (!isIdentidad) {
                            break;
                        }
                    }

                    if (isIdentidad) {
                        System.out.println("SI");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}
