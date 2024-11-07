/*Arithmetic operators:
* Create a program that takes two number as Input and performs all basic arithmetic operations
* (Addition, Subtraction, Multiplication, Division and Modulus) on them.*/

import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter your 1st number");
        int num1 = Input.nextInt();
        System.out.println("Enter your 2nd number");
        int num2 = Input.nextInt();
        Input.close();

        int Add = num1+num2;
        int Sub = num1-num2;
        int Mul = num1*num2;
        int Div = num1/num2;
        int Mod = num1%num2;

        System.out.println("Addition "+Add);
        System.out.println("Subtraction "+Sub);
        System.out.println("Multiplication "+Mul);
        System.out.println("Division "+Div);
        System.out.println("Modulus "+Mod);
    }
}