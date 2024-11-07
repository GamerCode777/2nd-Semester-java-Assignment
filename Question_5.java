/*Product_of_floating_points:
* Create a program that calculates the product of two floating point numbers*/

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter your 1st float");
        float num1 = Input.nextFloat();
        System.out.println("Enter your 2nd float");
        float num2 = Input.nextFloat();
        Input.close();

        float Prod = num1*num2;
        System.out.println("Product is "+Prod);
    }
}
