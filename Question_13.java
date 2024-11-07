//Write a program to swap two numbers without using a third variable.
import java.util.Scanner;
public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();

        System.out.println("Before Swap "+x+" "+y);

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After Swap "+x+" "+y);
    }
}