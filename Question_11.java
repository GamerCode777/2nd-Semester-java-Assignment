import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter initial velocity:");
        float vi = Input.nextFloat();
        System.out.println("Enter initial position:");
        float xi = Input.nextFloat();
        System.out.println("Enter constant acceleration:");
        float a = Input.nextFloat();
        System.out.println("Enter time in seconds:");
        float t = Input.nextFloat();
        Input.close();

        double xf = 0.5 * a * t * t + vi * t + xi;

        System.out.println("Distance travelled by object in "+t+ " seconds is "+xf+" meter");
    }
}