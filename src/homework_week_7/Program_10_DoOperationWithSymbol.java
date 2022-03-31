package homework_week_7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+,-,/,*)
 * find addition,Subtraction,multiplication and division according to their symbol using if else
 */

public class Program_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number  :");
        int x = scanner.nextInt();
        System.out.println("Enter second number  :");
        int y = scanner.nextInt();
        System.out.println("Please select the calculaiton symbol +,-,/,* :");
        char symbol = scanner.next().charAt(0);
        doOperartionBySelecingSymbol(x, y, symbol);
        //closing the scanner object
        scanner.close();
    }

    //Calculation operation based on on symbol
    public static void doOperartionBySelecingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {
            System.out.println(x + " +" + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please enter correct symbol +,-,*./");
        }
    }
}
