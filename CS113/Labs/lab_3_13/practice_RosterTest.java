package CS113.Labs.lab_3_13;

import java.util.*;

public class practice_RosterTest {

    static practice_Roster list = new practice_Roster(10);
    static Scanner scan = new Scanner(System.in);

    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args) {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0) {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }

    //-------------------------------------
    // Do what the menu item calls for
    //-------------------------------------
    public static void dispatch(int choice) {
        int loc;
        switch (choice) {
            case 0:
                System.out.println("Bye! ");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new practice_Roster(size);
                list.randomize();
                break;
            case 2:
                list.print();
                break;
            case 3:
                int numAs = list.findNomOfAs();
                System.out.println("Num A Scores: " + numAs);
            default:
                System.out.println("Sorry, invalid choice");
        }
    }

    //----------------------------
    // Print the user's choices
    //----------------------------
    public static void printMenu() {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new roster (** do this first!! **)");
        System.out.println("2: Print the roster");
        System.out.println("3: Find number of A scores");
        /*  hard option, add a score
        hint, double the array to ifit extra
        use another instace date: numberOfElems to keep track
        how many items in menu
        */
        System.out.print("\nEnter your choice: ");
    }
}
