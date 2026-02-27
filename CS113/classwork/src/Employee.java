/*
Practice Set 1
Question 11 (20 points)
Define a class named Employee that represents an employee and contains:
• A String data field named name
• An int data field named salary

• A constructor that accepts name and salary
• A getter method for each data field
• A setter method for salary (only)
• A toString() method that returns name and salary, e.g. :
"Name: John, Salary: 55000"
• A method isHighEarner() that returns true if salary is at least 60000, false otherwise
• A method equals() that returns true if two employees are either both high earners or both not high earners


Question 12 (20 points)
Write an application EmployeeTest that:
1. Prompts the user to enter a name and salary.
2. Creates an Employee object named entry.
3. Repeatedly generates random salaries between 40000 and 80000 (inclusive) and creates new Employee objects named "Temp".
4. Continue generating while the random employee is “equal” to entry.
5. Count how many random employees have salary greater than entry.
6. Print the total count.
Practice Set 2
*/

public class Employee {

    private String name;
    private int salary;

    public Employee(String n, int sal) {
        name = n;
        salary = sal;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }

    public boolean isHigherEarner() {
        if (salary >= 60000) return true;
        else return false;
    }

    public boolean equals(Employee other) {
        if (isHigherEarner() && other.isHigherEarner()) return true;
        else return false;
    }
}
