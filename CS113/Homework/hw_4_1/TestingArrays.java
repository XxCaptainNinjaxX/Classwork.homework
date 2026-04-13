package Homework.hw_4_1;

import java.util.Arrays;

public class TestingArrays {

    public static void main(String[] args) {
        System.out.println("--- Sales Range ---");
        int[][] salesData = { { 200, 350, 400 }, { 150, 375, 225 } };

        int[] salesResult = salesRange(salesData);
        System.out.println("Expected output: [150, 400, 250]");
        System.out.println("Actual output:   " + Arrays.toString(salesResult));

        System.out.println(" ");
        System.out.println("---Die Stats ---");

        Die[][] diceArray = new Die[2][3];

        for (int r = 0; r < diceArray.length; r++) {
            for (int c = 0; c < diceArray[r].length; c++) {
                diceArray[r][c] = new Die();
            }
        }

        int[] diceResult = dieStats(diceArray);
        System.out.println("Odd rolls per row: " + Arrays.toString(diceResult));
    }

    public static int[] salesRange(int[][] sales) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                if (sales[row][col] < min) {
                    min = sales[row][col];
                }
                if (sales[row][col] > max) {
                    max = sales[row][col];
                }
            }
        }

        int range = max - min;

        return new int[] { min, max, range };
    }

    public static int[] dieStats(Die[][] dice) {
        int[] oddCounts = new int[dice.length];

        for (int row = 0; row < dice.length; row++) {
            int count = 0;
            for (int col = 0; col < dice[row].length; col++) {
                int result = dice[row][col].roll();

                if (result % 2 != 0) {
                    count++;
                }
            }
            oddCounts[row] = count;
        }

        return oddCounts;
    }
}

class Die {

    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }
}
