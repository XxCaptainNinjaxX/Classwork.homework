import java.util.Random;
import java.util.Scanner;
public class Problem1 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Random gen = new Random();

      int COVERAGE = 350; 

      System.out.println("Please enter the height of the tank: ");
      int height=scan.nextInt();

      int radius = Math.abs(gen.nextInt(20))+10;

      double surfaceArea=2*radius*height*Math.PI;

      double paint=surfaceArea/COVERAGE;

   System.out.println("You are going to need roughly "+paint+" amount of paint for "+surfaceArea+" sq ft");
//--------------------------------------------------------------

      scan.nextLine();
      System.out.println("Please enter a sentence: ");
      String userInput=scan.nextLine();

      char char1,char2,char3;

      char1=userInput.charAt(Math.abs(gen.nextInt(userInput.length())));
      char2=userInput.charAt(Math.abs(gen.nextInt(userInput.length())));
      char3=userInput.charAt(Math.abs(gen.nextInt(userInput.length())));

System.out.println(""+char1+char2+char3);



      scan.close();
      }
}
