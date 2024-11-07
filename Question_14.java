//Develop a program that prints the multiplication table for a given number.
import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number for Table: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number+" * "+i+" = "+(i*number));
        }
    }
}