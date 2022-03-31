package homework_week_7;

import java.util.Locale;
import java.util.Scanner;

/**
 * Input any alphabet from 'A to F' and print their city name accordingly (use if else) if any other alphabet should be invalid entry
 * using SWITCH statement
 */
public class Program_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any alphabet between A to F :");
        String city = scanner.next().toUpperCase();
        //create object and call instance method
        Program_9_PrintCityNameWithSwitch cityName = new Program_9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        //closing the scanner object
        scanner.close();
    }

    //ptinting city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            default:
                System.out.println("The alphabet you entered is not between A to F");
        }
    }
}
