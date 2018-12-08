/**Rock Paper Scissors**/

import java.util.*;
import java.io.*;
public class RockPaperScissors {

    
    public static Scanner sc = new Scanner(System.in);
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static String options[] = {"r", "p", "s"};
    public static Random r = new Random();
    public static String compInput;
    public static String input;
    public static int sP, sC;
    public static int maxP = 0;

    public static void main(String[] args) throws Exception {
        initialise();
        while (!((sP >= maxP) || (sC >= maxP))) {
            gameTurn();
            computer();
            int ch = check();
            if (ch == 0) {
                System.out.print("Error 1\nWrong input given\n\n\n");
            }
            else if (ch == -1) {
                System.out.print("Error 2\nProcessing error\n\n\n");
            }
            System.out.print("\n\n\tCurrent Score\n\nYour score: " + sP + "\nComputer's Score: " + sC + "\n\n");
            System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
        }
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
        if (sP >= maxP) {           
            System.out.print("\n\n\tCongratulations!\n\t\tYou won\n");
        }
        else {
            System.out.print("\n\n\tSorry!\n\t\tYou lost!\n");
        }
    }

    public static void initialise() {
        System.out.print("\t\tROCK-PAPER-SCISSORS\n");
        System.out.print("By Joel Tony\n");
        System.out.println("__________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("\n\n");
        System.out.print("Points to win: ");
        maxP = sc.nextInt();
        System.out.println("\n");
        sP = 0;
        sC = 0;
    }

    public static void gameTurn() throws Exception {
        System.out.print("\nRock(R) OR Paper(P) OR Scissors(S): ");
        input = br.readLine().toLowerCase();
    }

    public static void computer() {
        compInput = options[r.nextInt(3)];
        System.out.print("Computer: " + compInput.toUpperCase() + "\n\n");
    }

    public static int check() {
        int ch = -1;
        if (input.equals("r")) {
            ch = 1;
            if (compInput.equals("p")) {
                sC++;
            }
            else if (compInput.equals("s")) {
                sP++;
            }
        }
        else if (input.equals("p")) {
            ch = 1;
            if (compInput.equals("r")) {
                sP++;
            }
            else if (compInput.equals("s")) {
                sC++;
            }
        }
        else if (input.equals("s")) {
            ch = 1;
            if (compInput.equals("r")) {
                sC++;
            }
            else if (compInput.equals("p")) {
                sP++;
            }
        }
        else {
            ch = 0;
        }
        return ch;
    } 
}