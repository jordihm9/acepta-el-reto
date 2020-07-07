package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        boolean loop = true;
        byte actualChannel, finalChannel;
        int nChannelsUp, nChannelsDown;

        // loop program
        do {

            actualChannel = sc.nextByte(); // user input channel where he is
            finalChannel = sc.nextByte(); // user input channel where he wants to change

            if (actualChannel == 0 && finalChannel == 0) {
                loop = false;
            } else {
                // calculate both possibilities: changing down or up
                if (actualChannel < finalChannel) {
                    nChannelsUp = finalChannel - actualChannel;
                    nChannelsDown = 99 - finalChannel + actualChannel;
                } else {
                    nChannelsUp = actualChannel - finalChannel;
                    nChannelsDown = 99 - actualChannel + finalChannel;
                }

                //compara quina de les dues possibilitats és més efectiva i printa-la
                if (nChannelsUp < nChannelsDown) {
                    System.out.println(nChannelsUp);
                } else {
                    System.out.println(nChannelsDown);
                }
            }

        } while (loop);

        sc.close();
    }
}
