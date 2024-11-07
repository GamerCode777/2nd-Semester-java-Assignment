/*Fahrenheit To Celsius:
* Create a program that converts temperature form Fahrenheit to celsius*/
import java.util.Scanner;
public class Question_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature in Fahrenheit");
        float temp = input.nextFloat();
        input.close();

        float cels = (temp-32) * 5/9;

        System.out.println("Temperature is "+cels+" Celsius");
    }
}