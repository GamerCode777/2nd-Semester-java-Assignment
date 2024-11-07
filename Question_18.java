//Create a program to find the Least Common Multiple (LCM) of two numbers.
import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter First Number :");
        n1 = sc.nextInt();
        System.out.print("Enter Second Number :");
        n2 = sc.nextInt();
        sc.close();

        int lcm = (n1 < n2) ? n1 : n2;
        while(true){
            if(lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("LCM of entered numbers : " + lcm);
                break;
            }
            ++lcm;
        }
    }
}