package ProgramaMe.e2013.MadridReus;

import java.util.Scanner;

public class P172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables
        int seatsNumber;
        String tableState, emptySeats;
        char firstSittingSide = ' ';
        boolean everyoneEats = false;

        do {
            seatsNumber = sc.nextInt(); // user entry

            if (seatsNumber != 0) {
                tableState = sc.next(); // user entry

                // check all the table if there is empty or none ate bread
                for (int i = 0; i < seatsNumber; i++) {
                    if (tableState.charAt(i) != '.') {
                        everyoneEats = false;
                        break; // stop checking
                    } else {
                        everyoneEats = true;
                    }
                }

                if (!everyoneEats) {
                    // check if people sitting ate the bread on the same side

                    // save the bread side of the first person who ate
                    for (int i = 0; i < seatsNumber; i++) {
                        if (tableState.charAt(i) != '.') {
                            firstSittingSide = tableState.charAt(i);
                            break;
                        }
                    }

                    // check if others ate from the same side
                    for (int i = 0; i < seatsNumber; i++) {
                        char actualPos = tableState.charAt(i);
                        if (actualPos != '.') {
                            if (actualPos == firstSittingSide) {
                                everyoneEats = true;
                            } else {
                                everyoneEats = false;
                                break;
                            }
                        }
                    }
                }

                System.out.println(everyoneEats ? "TODOS COMEN" : "ALGUNO NO COME"); // output
                everyoneEats = false; // reset
            }

        } while (seatsNumber != 0);

        sc.close();
    }
}
