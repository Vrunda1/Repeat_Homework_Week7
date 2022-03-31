package homework_week_7;
//1.Write a java program that tell us input number is odd or even?
//HINT: Use ternary operator

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program_1_OddEvenTernaryOperater {
    public static void main(String[] args) {
        //Scanner declaration for readding input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese Enter the number:");
        int number = scanner.nextInt();
        isItOddorEvenNumber(number);
        //closing the scanner object
        scanner.close();
    }

    public static void isItOddorEvenNumber(int number) {
        //ternary operator is used
        String evenorodd = ((number & 2) == 0) ? " Even" : " Odd";
        System.out.println("The " + number + "is " + evenorodd + " number ");
    }
}
