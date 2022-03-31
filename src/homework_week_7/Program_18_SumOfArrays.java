package homework_week_7;

import java.util.Arrays;

/*write a java program to sum of an Arrays.

 */
public class Program_18_SumOfArrays {
    public static void main(String[] args) {
        //Numeric Array declaration
        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;
        //Calculating the Sum of Arrays value using for loop
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println("Values of the elements of the Array are: " + Arrays.toString(numArray));
        System.out.println("Sum of all the values of Arrays:  " + sum);
    }
}
