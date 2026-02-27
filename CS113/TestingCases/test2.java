package CS113.TestingCases;

// next() -  until whitespace (tab, space, etc)
// nextLine - string
// nextInt - int
// next Double

public class test2 {

    public static void main(String[] args) {
        int i = -2,
            j = 3,
            k = 4;
        if (i > 0) if (j > 0) i++;
        else if (k > 0) i--;
        else i = 0;
        System.out.println(i);
    }
}
