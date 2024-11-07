/*Simple interest:
* Create a program that calculates simple interest, given the principal amount, time and rate of interest*/
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        int p = Input.nextInt();
        System.out.println("Enter annual Interest rate:");
        float r = Input.nextFloat();
        System.out.println("Enter Time in years:");
        float t = Input.nextFloat();
        Input.close();

        double SI = p * r * t/100;

        System.out.println("Simple interest is "+SI);
    }
}