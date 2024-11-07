//Create a program to check if a number is an Armstrong number.
//An Armstrong number is a positive n-digit number that is equal to the sum of nth power of their digits.
import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int originalNumber = n;
        int sum = 0;
        int numberOfDigits = String.valueOf(n).length(); // Count the digits in the number

        for (; n != 0; n /= 10) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}