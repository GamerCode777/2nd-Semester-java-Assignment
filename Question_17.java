//Create a program that computes the sum of the digits of an integer.
import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer");
        int i = input.nextInt();
        input.close();
        int sum = 0;

        i = Math.abs(i);
        while (i != 0) {
            int digit = i % 10;
            sum += digit;
            i /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}