package CS113.TestingCases;

import java.util.*;

public class TestBrassPlayer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();

        System.out.println("Please enter player 1's name: ");
        String name1 = scan.nextLine();

        System.out.println("Please enter player 1's instrument: ");
        String instrument1 = scan.nextLine();

        System.out.println("Please enter player1's years of expirence: ");
        int exp1 = scan.nextInt();

        scan.nextLine();

        String name2 = "Josiah";
        String instrument2 = "Mellophone";
        int exp2 = Math.abs(gen.nextInt(6));

        BrassPlayer player1 = new BrassPlayer(name1, instrument1, exp1);
        BrassPlayer player2 = new BrassPlayer(name2, instrument2, exp2);

        scan.close();

        int compares = player1.compareTo(player2);

        if (compares == 1) {
            System.out.println(player1.getName() + " has the most experience.");
        } else if (compares == -1) {
            System.out.println(player2.getName() + " has the most experience.");
        } else {
            System.out.println("Both players have equal experience.");
        }

        boolean vet = player1.isVeteran(exp2);

        if (vet == true) {
            System.out.println("Player 1 is a vet member");
        } else {
            System.out.println("Player 1 is a rookie");
        }
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
