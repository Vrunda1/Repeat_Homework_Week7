package homework_week_7;

import java.util.Scanner;

/**
 * Write java program to check if enter number is positive or negative  or "ZERO"
 */
public class Program_16_FindPositiveNegative {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = scanner.nextInt();
        findNumberPositiveNegativeOrZero(number);
        //closing the scanner object
        scanner.close();
    }

    //finding the number is positive,negative or zero
    public static void findNumberPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + "is negative");
        } else {
            System.out.println(number + "is zero");
        }
    }
}
