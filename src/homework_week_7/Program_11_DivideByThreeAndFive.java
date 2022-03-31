package homework_week_7;

/**
 * write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 seperately.
 */
public class Program_11_DivideByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are: ");
        for (int i = 1; i <= 100; i++) {
            divideByThree(i);
        }
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("Numbers are visible by 5 are: ");
        for (int x = 1; x <= 100; x++) {
            divisibleByFive(x);
        }
    }

    //Divide By three method
    public static void divideByThree(int number) {
        if (number % 3 == 0) {
            System.out.println(number + ",");
        }
    }

    //Divide by five method
    public static void divisibleByFive(int number) {
        if (number % 5 == 0) {
            System.out.println(number + ",");
        }
    }
}
