package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program which input any number between 1 to 7 and it print the days
 * name MONDAY,TUESDAY....SUNDAY of the week accordingly by using switch.
 * NOTE: If number is out of selection print message "week contains 1 to 7 days"
 */
public class Program_13_FindTheDayName {
    public static void main(String[] args) {
        //Scanner declaratrion for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 to 7 :");
        int day = scanner.nextInt();
        findTheDaysName(day);
        //closing the scanner object
    }

    //Finding the name of the Day
    public static void findTheDaysName(int day) {
        switch (day) {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Ita Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
