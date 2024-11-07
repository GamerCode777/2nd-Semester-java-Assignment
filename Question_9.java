/*Compound interest:
 * Create a program that calculates compound interest, given the principal amount, time and rate of interest*/
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        double principal = input.nextDouble();
        System.out.println("Enter annual interest rate:");
        double annualRate = input.nextDouble();
        System.out.println("Enter number of times interest is compounded per year:");
        int n = input.nextInt();
        System.out.println("Enter time in years:");
        double years = input.nextDouble();
        input.close();

        double amount = principal * Math.pow(1 + (annualRate / (100 * n)), n * years);
        double compoundInterest = amount - principal;

        System.out.println("Compound interest after " + years + " years: " + compoundInterest);
        System.out.println("Amount after " + years + " years: " + amount);
    }
}

