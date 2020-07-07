package ProgramaMe.e2013.Online;

import java.util.Scanner;

public class P164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        boolean loop = true;
        int aWidth, aHeight;
        int bWidth, bHeight;
        int base, height;

        // loop program
        while (loop) {
            // user input 4 numbers
            aWidth = sc.nextInt();
            aHeight = sc.nextInt();
            bWidth = sc.nextInt();
            bHeight = sc.nextInt();

            if (aWidth > bWidth || aHeight > bHeight) { // condition to terminate program
                loop = false;
            } else {
                // calculate
                base = bWidth - aWidth;
                height = bHeight - aHeight;

                System.out.println(base * height); // print result
            }
        }

        sc.close();
    }
}
