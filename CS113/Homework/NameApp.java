package CS113.Homework;
import java.util.Random;
import java.util.Scanner;

public class NameApp{
   public static void main(String[] args) {
/* 
---------------------------------------------------------------------------------
                                    Part uno
---------------------------------------------------------------------------------

*/
    Scanner scan = new Scanner(System.in);
    Random gen = new Random();

    System.out.println("Please enter your first name: ");
    String userFirst=scan.nextLine();
    System.out.println("Please enter your last name: ");
    String userLast=scan.nextLine();
scan.close();
    char firstChar=userFirst.charAt(0);
    char secondChar=userLast.charAt(0);

    String intials=""+firstChar+secondChar;
    double adv=(userFirst.length()+userLast.length())/2;

    System.out.println(" ");
    System.out.println("Intials: "+intials);
    System.out.println("Adverage: "+adv);

/* 
---------------------------------------------------------------------------------
                                    Part dos
---------------------------------------------------------------------------------

*/

    String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char let1=upper.charAt(gen.nextInt(upper.length()));
    char let2=upper.charAt(gen.nextInt(upper.length()));
    char let3=upper.charAt(gen.nextInt(upper.length()));
    char let4=upper.charAt(gen.nextInt(upper.length()));
    char let5=upper.charAt(gen.nextInt(upper.length()));

    int let6=Math.abs(gen.nextInt(9));
    int let7=Math.abs(gen.nextInt(9));

    String licsencePlate=""+let1+let2+let3+let4+let5+let6+let7;

    System.out.println(" ");
    System.out.println("Licence Plate is: "+licsencePlate);
    System.out.println(" ");
    
   }
}