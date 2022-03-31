package homework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from "A toF" and print their city name accaordingly (use if else) if any alphabet should be Invalid
 * entry.
 */
public class Program_8_PrintCityName {
    public static void main(String[] args) {
        //scnner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        char city = scanner.next().charAt(0);
        //object creation
        Program_8_PrintCityName cityName = new Program_8_PrintCityName();
        cityName.printcityName(city);
        //closing the scanner object
        scanner.close();
    }

    //Printing city name
    public void printcityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belfast");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Derby");
        } else if (city == 'E' || city == 'e') {
            System.out.println();
        } else if (city == 'F' || city == 'f') {
            System.out.println("Feltham");
        } else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
