/*Area of triangle:
* create a program that calculates the area of triangle given its base and height*/

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter base of triangle:");
        float base = Input.nextFloat();
        System.out.println("Enter height of triangle:");
        float height = Input.nextFloat();
        Input.close();

        double area = 0.5 * base * height;

        System.out.println("Area of triangle is "+area);
    }
}
