/*Perimeter of Rectangle:
* Create a program that calculates the perimeter of rectangle given the lengths of its sides*/

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter Length of rectangle");
        float length = Input.nextFloat();
        System.out.println("Enter width of rectangle");
        float width = Input.nextFloat();
        Input.close();

        float peri = 2*length + 2*width;
        System.out.println("Perimeter of rectangle is "+peri);
    }
}