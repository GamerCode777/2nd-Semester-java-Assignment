//Create a program to sum all odd numbers from 1 to a specified number N.
import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();
        int sum = 0;

        for(int i=1;i<=n;i++)
            if((i%2) !=0){
                sum = sum + i;
            }
        System.out.print("Sum of odd numbers is "+sum);
    }
}