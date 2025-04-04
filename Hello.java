import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        // Createe a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt user for second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Add the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
