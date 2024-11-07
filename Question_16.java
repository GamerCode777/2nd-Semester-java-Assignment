//Write a program that calculates the factorial of a given number.
import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = input.nextInt();
        input.close();
        int fac = 1;

        for(int i=1;i<=n;i++){
            fac = fac *i;
        }
        System.out.print("Factorial of "+n+" is "+fac);
    }
}