public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(); // Creates the new manager object

        while (true) {
            String choice = manager.Menu();
            try{
                int number = Integer.parseInt(choice);
                switch (number) {
                    case 1: // Add new employee
                        manager.AddEmployee();
                        break;
                    case 2: // Show all employees
                        manager.ShowEmployees();
                        break;
                    case 3: // Exit
                        System.exit(0);
                        break;
                    default: // Invalid choice
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

            }
            catch (NumberFormatException ex){
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}