package CS113.Labs.lab_3_13;

// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;

public class practice_sales {

    public static void main(String[] args) {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;

        int max = 0;
        int maxid = 0;

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + i + ": $");
            sales[i] = scan.nextInt();

            if (sales[i] > max) {
                max = sales[i];
                maxid = i;
            }
        }

        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }

        double adv = sum / SALESPEOPLE;
        System.out.println("\nTotal sales: $" + sum);
        System.out.println("\nAdverage total sales : $" + adv);
        System.out.println("\nMax sale: " + max + " by employee " + maxid);

        int[] mind_and_id = min_sale_and_id(sales);
        System.out.println(mind_and_id);
        System.out.println();

        scan.close();
    }

    /*method min_sale_and_id, take an non-empty array of sales as paramater
    mthods return an array that contains 2 elements:
    - minSale
    - id
    call method in main to print minSale and id */

    public static int[] min_sale_and_id(int[] arr, int id) {
        int min = Integer.MAX_VALUE;
        int minid = 0;

        int[] returns = new int[2];

        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minid = i;
            }
        }
        returns[0] = min;
        returns[-1] = id;
        return returns;
    }
}
