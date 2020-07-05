package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        boolean loop = true;
        int n;
        String c;

        // loop program
        while(loop) {
            // user input:
            n = sc.nextInt();
            c = sc.next();

            if (n == 0 && c.equals("0")) {
                loop = false;
            } else {

                int x = 0;
                int y = 1;

                // print the first part <-- increasing
                for (int i = 0; i < n - 1; i++) {
                    //System.out.println(" ".repeat(n - y) + c.repeat(n + x));
                    for (int j = 0; j < n - y; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < n + x; j++) {
                        System.out.print(c);
                    }
                    System.out.println();
                    y++;
                    x += 2;
                }

                // print the second part <-- decrease
                for (int i = 0; i < n; i++) {
                    //System.out.println(" ".repeat(n - y) + c.repeat(n + x));
                    for (int j = 0; j < n - y; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < n + x; j++) {
                        System.out.print(c);
                    }
                    System.out.println();
                    y--;
                    x -= 2;
                }

            }
        }

        sc.close();
    }
}
