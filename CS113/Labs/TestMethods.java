package CS113.Labs;

public class TestMethods {

    public static int factorial(int n) {
        int num = 1;
        for (int i = 0; i <= n; i++) {
            num *= n;
            n--;
            System.out.println(num);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Factoral = " + factorial(5));
    }
}
