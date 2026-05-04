import java.util.Random;

public class TestMCoins {

    public static void main(String[] args) {
        final int rows = 3;
        final int cols = 5;

        MonetaryCoin[][] coins = new MonetaryCoin[rows][cols];
        Random random = new Random();
        int[] rowTotals = new int[rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int randomValue = random.nextInt(100) + 1;
                coins[row][col] = new MonetaryCoin(randomValue);
            }
        }

        for (int row = 0; row < rows; row++) {
            String rowDisplay = "";
            int rowHeadsTotal = 0;

            for (int col = 0; col < cols; col++) {
                coins[row][col].flip();
                rowDisplay += coins[row][col];
                if (col < cols - 1) {
                    rowDisplay += " ";
                }

                if (coins[row][col].isHeads()) {
                    rowHeadsTotal += coins[row][col].getMonetaryValue();
                }
            }

            rowTotals[row] = rowHeadsTotal;
            System.out.println(rowDisplay);
        }

        String totalsDisplay = "";
        for (int i = 0; i < rowTotals.length; i++) {
            totalsDisplay += rowTotals[i];
            if (i < rowTotals.length - 1) {
                totalsDisplay += ", ";
            }
        }

        System.out.println(totalsDisplay);
    }
}
