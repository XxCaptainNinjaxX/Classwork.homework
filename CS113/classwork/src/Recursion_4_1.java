public class Recursion_4_1 {

    public static int sumReg(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1;
        }

        return sum;
    }

    public static int factorialReg(int n) {
        int mult = 1;
        for (int i = n; i >= 1; i--) {
            mult += i;
        }
        return mult;
    }

    public static int factorialRec(int n) {
        int result;
        if (n == 1) result = 1;
        else result = n;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorialReg(5));
        System.out.println(sumReg(5));
    }
}
