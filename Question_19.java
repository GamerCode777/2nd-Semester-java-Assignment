//Create a program to find the Greatest Common Divisor (GCD) of two integers.
import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter First Number :");
        n1 = sc.nextInt();
        System.out.print("Enter Second Number :");
        n2 = sc.nextInt();
        sc.close();

        while(n1 != n2){
            if(n1 > n2)
                n1 = n1 - n2;
            if(n2 > n1)
                n2 = n2 - n1;
        }
        System.out.println("GCD = "+ n1);
    }
}