package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        boolean loop = true;
        int h; // height
        int b; // base

        // loop program
        while (loop) {
            // user input
            b = sc.nextInt();
            h = sc.nextInt();

            if (h < 0 || b < 0) {
                loop = false;
            } else {
                System.out.println((b*2)+(h*2)); // calculate and print
            }
        }

        sc.close();
    }
}
