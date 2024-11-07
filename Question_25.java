/*1) Basic Calculator
        The objective of this program is to create a basic calculator in Java. The program should
        be able to perform arithmetic operations such as addition, subtraction, multiplication, and
        division. And take the Expression like this (5 + 10).*/
import java.util.Scanner;
class Question_25 {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner sc = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter expression (e.g., 5 + 10): ");
        String input = sc.nextLine();

        // Split input by spaces
        String[] parts = input.split(" ");

        // Check if the input format is correct
        if (parts.length != 3) {
            System.out.println("Invalid format. Please enter in 'number operator number' format.");
            return;
        }
        // Attempt to parse the numbers
        int num1, num2;

        num1 = Integer.parseInt(parts[0]);
        num2 = Integer.parseInt(parts[2]);

        // Read operator
        String operator = parts[1];
        int result = 0;
        boolean validOperation = true;
        // Perform the operation based on the operator
        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
            }
            default -> {
                validOperation = false;
                System.out.println("Invalid operator. Please use +, -, *, or /.");
            }
        }
        // Display the result if the operation is valid
        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}