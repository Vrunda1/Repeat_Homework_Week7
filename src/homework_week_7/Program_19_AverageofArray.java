package homework_week_7;

import java.util.Arrays;

/**
 * Write a java program to calculate the average value of array
 */
public class Program_19_AverageofArray {
    public static void main(String[] args) {
        //Numeric Array declaration
        int[] numArrray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;
        //Calculating the sum of Array value
        for (int i = 0; i < numArrray.length; i++) {
            sum = sum + numArrray[i];
        }
        //finding the average of an array
        int average = sum / numArrray.length;
        System.out.println("Values of the elements of array are: " + Arrays.toString(numArrray));
        System.out.println("Average of all the values of the Array are: " + average);
    }
}
