package ProgramaMe.e2013.Online;
import java.util.Scanner;

public class P158 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int nCases;
        int nWalls;
        int[] heights;
        int nUpJumps;
        int nDownJumps;

        nCases = sc.nextInt(); // user input number of test cases

        for (int i = 0; i < nCases; i++) {
            //reset number of jumps
            nUpJumps = 0;
            nDownJumps = 0;

            nWalls = sc.nextInt(); // user input number of walls

            heights = new int[nWalls]; // set vector length to save heights

            // user input all heights
            for (int e = 0; e < heights.length ; e++) {
                heights[e] = sc.nextInt();
            }

            // check every height if it's greater or minus than next and add +1 to jumps counter in which correspond
            for (int p = 0; p < heights.length  - 1 ; p++) {

                if (heights[p + 1] > heights[p]) {
                    nUpJumps++;
                } else if (heights[p + 1] < heights[p]){
                    nDownJumps++;
                }

            }

            System.out.println(nUpJumps + " " + nDownJumps); // print output
        }
    }
}
