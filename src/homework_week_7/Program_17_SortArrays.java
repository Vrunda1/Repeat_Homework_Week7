package homework_week_7;

import java.util.Arrays;

/**
 * Write a java program to sort a numeric array and a string array.
 */
public class Program_17_SortArrays {
    public static void main(String[] args) {
        //Numeric Array declaration
        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        //String Array declaration
        String[] strArray = {"Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual numeric Array was:  " + Arrays.toString(numArray));
        //sorting the Arrays
        Arrays.sort(numArray);
        System.out.println("Sorting the numeric Array is: " + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //sorting the Array
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));

    }
}
