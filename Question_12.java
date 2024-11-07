/*Euclidean Distance*/
import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter X1");
        float x1 = input.nextFloat();
        System.out.println("Enter Y1");
        float y1 = input.nextFloat();
        System.out.println("Enter X2");
        float x2 = input.nextFloat();
        System.out.println("Enter Y2");
        float y2 = input.nextFloat();

        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distance between points is "+d);
    }
}
