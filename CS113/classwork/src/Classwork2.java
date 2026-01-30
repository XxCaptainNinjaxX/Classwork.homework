import java.util.Scanner;

public class Classwork2{
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter your name and age: ");

      String userName=scan.nextLine(); 
      int userAge=scan.nextInt();
       userAge+=10;

       System.out.println(userName+", you will be "+userAge+" in 10 years");
      

      scan.close();


   }
}
