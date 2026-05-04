package Homework.hw_4_14;

public class TestRecursion {

    public static void main(String[] args) {
        System.out.println(" ");
        printDigits(123147);

        System.out.println(" ");
        System.out.println("------------- ");
        System.out.println(" ");

        int[] a = { 1, 3, 2, 5 };
        System.out.println(sumArray(a, 3));
        System.out.println(sumArray(a, 4));
    }

    public static void printDigits(int num) {
        if (num < 0) {
            printDigits(-num);
            return;
        }
        if (num < 10) {
            System.out.println(num);
            return;
        }

        printDigits(num / 10);
        System.out.println(num % 10);
    }

    public static int sumArray(int[] numArray, int count) {
        if (count <= 0) {
            return 0;
        }
        return sumArray(numArray, count - 1) + numArray[count - 1];
    }
}
