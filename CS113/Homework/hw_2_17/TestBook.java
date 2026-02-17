package CS113.Homework.hw_2_17;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");

        Book book1 = new Book();
        Book book2 = new Book();

        System.out.print("Enter the title for Book 1: ");
        String userTitle1 = scanner.nextLine();
        book1.setTitle(userTitle1);

        System.out.print("Enter the number of pages for Book 1: ");
        int userPages1 = scanner.nextInt();
        book1.setPages(userPages1);
        scanner.nextLine(); 

        System.out.print("\nEnter the title for Book 2: ");
        String userTitle2 = scanner.nextLine();
        book2.setTitle(userTitle2);

        System.out.print("Enter the number of pages for Book 2: ");
        int userPages2 = scanner.nextInt();
        book2.setPages(userPages2);

        System.out.println("\n--- Library Info ---");
        System.out.println("Book 1 -> " + book1.toString());
        System.out.println("Book 2 -> " + book2.toString());

        double averagePages = (book1.getPages() + book2.getPages()) / 2.0;
        System.out.println("\nThe average number of pages is: " + averagePages);

        scanner.close();
    }
}