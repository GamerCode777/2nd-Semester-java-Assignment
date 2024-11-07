//Create a program to verify if a number is a palindrome.
//palindrome number is a number that is same after reverse, ex 545, 34543. it can also be string like madam, lol etc.
import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int originalNumber = n;
        int reverseNumber = 0;

        while(n > 0){
            int lastDigit = n % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            n = n / 10;
        }
        if(originalNumber==reverseNumber){
            System.out.print("number is palindrome");
        }else{
            System.out.print("number is not palindrome");
        }

    }
}