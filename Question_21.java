//Create a program to reverse the digits of a number.
import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rev = 0;
        System.out.println("Enter number :");
        int n = sc.nextInt();
        sc.close();

        while(n > 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println("Reverse Number: "+rev);
    }
}