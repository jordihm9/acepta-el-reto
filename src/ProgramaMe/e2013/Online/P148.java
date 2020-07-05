package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        boolean loop = true;
        String currentTime;
        int timeLeft; // output in minutes
        String[] clock;
        int hours, min;

        // loop the program
        while(loop) {
            timeLeft = 0; //reset
            currentTime = sc.next(); // user input

            if (currentTime.equals("00:00")) {
                loop = false;
            } else {
                clock = currentTime.split(":"); // separate hours and minutes
                hours = Integer.parseInt(clock[0]);
                min = Integer.parseInt(clock[1]);

                timeLeft += 60 - min; // calculate min first
                timeLeft += (23 - hours) * 60;

                System.out.println(timeLeft);
            }
        }

        sc.close();
    }
}

