package CS113.Homework.hw_3_10;

import java.util.Scanner;

public class DogTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of dogs in the kennel: ");
        int numDogs = scan.nextInt();
        scan.nextLine();
        double totalAge = 0;
        Dog oldestDog = null;

        for (int i = 0; i < numDogs; i++) {
            System.out.print("Enter Dog breed: ");
            String breed = scan.nextLine();

            System.out.print("Enter age: ");
            int age = scan.nextInt();
            scan.nextLine();

            Dog currentDog = new Dog(age, breed);

            totalAge += currentDog.GetAge();

            if (oldestDog == null || currentDog.compareTo(oldestDog) > 0) {
                oldestDog = currentDog;
            }
        }

        if (numDogs > 0) {
            double averageAge = totalAge / numDogs;
            System.out.println("\nAverage age: " + averageAge);
            System.out.println("Oldest Dog -> " + oldestDog.toString());
        } else {
            System.out.println("No dogs were entered.");
        }

        scan.close();
    }
}
