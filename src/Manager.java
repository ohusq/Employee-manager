import java.util.Scanner;

public class Manager {
    private String[] employees; // Array to store the employees
    // The ID is the index of the employee in the array

    public String Menu() { // Method to display the menu, returns the user's choice
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("Employee Management System");
        System.out.println("1. Add new employee");
        System.out.println("2. Show all employees");
        System.out.println("3. Exit");
        System.out.println("----------------------------");
        System.out.print("Enter your choice: ");
        return scanner.nextLine(); // Return the user's choice
    }

    public void AddEmployee() { // Method to add a new employee
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee's name: ");
        try {
            String name = scanner.nextLine();
            if (employees == null) {
                employees = new String[1];
                employees[0] = name;
            } else {
                String[] temp = new String[employees.length + 1];
                for (int i = 0; i < employees.length; i++) {
                    temp[i] = employees[i];
                }
                temp[employees.length] = name;
                employees = temp;
            }
            System.out.println("Employee added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ShowEmployees() { // Method to show all employees

        if (employees == null) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("Employees:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i + ". " + employees[i]);
        }
    }
}
