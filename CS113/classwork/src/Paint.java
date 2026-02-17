import java.util.Scanner;
public class Paint {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in) ;
    int COVERAGE = 350; 
   
   double totalSqFt;
   double paintNeeded;

   System.out.println("give me the length");
   int userLength = scan.nextInt();

   System.out.println("give me the width");
   int userWidth = scan.nextInt();

   System.out.println("give me the height");
   int userHeight = scan.nextInt();

   totalSqFt=( userHeight+userLength+userWidth)*2;

   paintNeeded=totalSqFt/COVERAGE;

   System.out.println("You are going to need roughly "+paintNeeded+" amount of paint for "+totalSqFt+" sq ft");
   //paint covers 350 sq ft/gal


   //Print the length, width, and height of the room and the
   //number of gallons of paint needed.
   scan.close();
   }
}