package Labs.lab_4_10;

//RECURSIVE PRACTICE

// ******************************************************************
//   DigitPlay.java
//
//   Finds the number of digits in a positive integer.
// ******************************************************************
import java.util.Scanner;

public class DigitPlay {

    public static void main(String[] args) {
        int num; //a number
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Please enter a positive integer: ");
        num = scan.nextInt();
        if (num <= 0) System.out.println(num + " isn't positive -- start over!!");
        else {
            // Call numDigits to find the number of digits in the number
            // Print the number returned from numDigits
            System.out.println("\nThe number " + num + " contains " + +numDigits(num) + " digits.");
            System.out.println();
        }
        System.out.println("12345 = " + sumDigits(12345));

        System.out.println(" ");
        System.out.println("--------------- ");
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("no"));
        System.out.println(isPalindrome("dont"));
        System.out.println("--------------- ");
    }

    // -----------------------------------------------------------
    //  Recursively counts the digits in a positive integer
    // -----------------------------------------------------------
    public static int numDigits(int num) {
        if (num < 10) return (1);
        else return (1 + numDigits(num / 10));
    }

    // add a recursisve method named sumdigits that finds
    //  the sum of the digits in a positive int

    public static int sumDigits(int num) {
        if (num < 10) return (num);
        else {
            return (num % 10) + sumDigits(num / 10);
            /*
         
         int sum = num%10;
         sum+=sumDigits(num/10);
         return sum;

         
         */
        }
    }

    // write a method called isPalindrome that takes a String paramater
    // method returns true if string is a palidrone, else false

    /*
    racecar = true 
    madam = true 
    level = true 
    course = false
    */

    // four calls, 2 true, 2 false

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            String newStr = word.substring(1, word.length() - 1);
            return isPalindrome(newStr);
        }
        return false;
    }
}
