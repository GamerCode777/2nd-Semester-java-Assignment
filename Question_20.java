//Create a program to check whether a given number is prime.
import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();
        boolean prime = true;
        for(int i = 2; i < n; i++) {
            if (n % i == 0){
                prime = false;
                break;
            }
        }
        System.out.print(prime);
    }
}