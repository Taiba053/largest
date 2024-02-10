import java.util.Scanner;

public class emp {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for employee details
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Date of Joining (YYYY-MM-DD): ");
        String dateOfJoining = scanner.nextLine();

        System.out.print("Enter Department ID: ");
        int departmentId = scanner.nextInt();

        // Display the entered details
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + empName);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Department ID: " + departmentId);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
