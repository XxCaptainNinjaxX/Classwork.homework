import java.util.*;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        int count;

        System.out.println("Enter name and salary");
        Employee entry = new Employee(scan.nextLine(), scan.nextInt());

        Employee temp = new Employee("Temp", gen.nextInt(40001) + 40000);
        count = 0;
        while (entry.equals(temp)) {
            temp = new Employee("Temp", gen.nextInt(40001) + 40000);
            count++;
        }
        System.out.println(count);
        System.out.println(temp);
        System.out.println(entry);

        scan.close();
    }
}
