//Create a program to print the Fibonacci series up to a certain number.
//The Fibonacci series is where the next term is the sum of previous two terms. The First Two of Fibonacci series are
// 1 and 0
import java.util.Scanner;

class Question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to print Fibonacci series: ");
        int n = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);
        int nextNum = firstTerm + secondTerm;

        while (nextNum <= n) {
            System.out.print(", " + nextNum);
            firstTerm = secondTerm;
            secondTerm = nextNum;
            nextNum = firstTerm + secondTerm;
        }
    }
}