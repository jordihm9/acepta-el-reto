package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int num;
        int speed;
        int runnerSpeed;

        while(sc.hasNext()) {
            runnerSpeed = 0; // reset
            num = sc.nextInt(); // number of 'Toros'

            for (int i = 0; i < num; i++) {
                speed = sc.nextInt(); // input of speed
                if(speed> runnerSpeed) { // compare and check the max speed
                    runnerSpeed = speed; // save the max speed
                }
            }

            System.out.println(runnerSpeed); // print result
        }

        sc.close();
    }
}
