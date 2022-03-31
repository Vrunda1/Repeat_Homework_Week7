package homework_week_7;

/**
 * Number of days in month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameters needs to be greater than or equal to and less than or equals to
 * 9999.If the paremeters not in the range then return false.
 * Otherwise if it is in the valid range,calculate the year is leap year and return true if it is,
 * return false.
 * A year is a leap year if it is divisible by 4 but not 100 or it is divisible by 400.
 * Example of input/output:
 * isLeapYear(-1600);should return false since the parameters not in the range(1-9999)
 * isLeapYear(1600);should return true since the 1600 is leap year.
 * isLeapYear(2017);should return false since the 2017 is not a leap year.
 * isLeapYear(2000);should return true since the 2000 is a leap year.
 * Write another method getDaysInMonth with two parameters month and year.Both of type
 * int.
 * If parameter month is &lt:1 or &1gt;12 return -1.
 * If parameter year is &lt :1 or &gt:9999 return -1.
 * This method needs to return number of days in the month.Be careful about leap years.
 * they have about 29 days in month 2(February).
 * <p>
 * You should check if the year is a leap year using the isLeapYear described above.
 * Example of input/output:
 * getDaysInMonth(1,2020);should return 31 since January has 31 days
 * getDaysInMonth(2,2020);should rerurn 29 since February has 29 days in a year and 2020 is a leap
 * year.
 * getDaysInMonth(2,2018);should rerurn 28 since February has 28 days if its not a leap year  and
 * 2018 is not a leapyear.
 * getDaysInMonth(-1,2020);should return -1 since the parameterr month is Invalid.
 * getDaysInMonth(1,-2020);should return -1 since the parameter is out of range 1 to 9999.
 * HINT:Use the switch statement
 * NOTE:Methos is leap year and gerDaysInMonth needs to be public static
 */

public class Program_4_NumberOfDaysInMonth {
    public static void main(String[] args) {
        //leap year 4 outputs
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println("-------------------------------------------------");
        //5 outputs to getDaysInMonth
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2018));
        System.out.println(getDaysInMonth(1, 2018));
    }

    //cheking it is leap year
    public static boolean isLeapYear(int years) {
        boolean b;
        if (years <= 1 || years >= 9999) {
            b = false;
        } else {
            b = years % 4 == 0 && years % 100 != 0 || years == 0;
        }
        return b;
    }

    //calculating the days in month depending on year
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if (month < 1 || month > 12 || month < 1 || month > 9999) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        return days;
    }
}
