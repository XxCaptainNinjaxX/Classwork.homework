// *******************************************************************
// RightTriangle.java
//
// Compute the length of the hypotenuse of a right triangle
// given the lengths of the sides
// *******************************************************************
import java.util.Scanner;
public class RightTriangle
{
   public static void main (String[] args)
   {
      double side1, side2; // lengths of the sides of a right triangle
      double hypotenuse; // length of the hypotenuse
      Scanner scan = new Scanner(System.in);

      System.out.print ("Please enter the lengths of the two sides of " +
      "a right triangle (separate by a blank space): ");

      side1=scan.nextDouble();
      side2=scan.nextDouble();

      scan.close();

      hypotenuse=Math.sqrt(Math.pow(side1, 2)+side2+side2);

      System.out.println ("Length of the hypotenuse: " + hypotenuse);
   }
}