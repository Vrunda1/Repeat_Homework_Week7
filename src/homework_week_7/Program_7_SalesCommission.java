package homework_week_7;

import java.util.Scanner;

/**
 * Write a java program input seller id,seller name,sales amount and basic salary
 * then finds its sales
 * commission
 * sales amount &gt;= 50000 35%;
 * sales amount &gt;= 30000 20%;
 * &gt;= 20000 10%;
 * &gt;= 10000 5%;
 * &lt;= 10000 2%;
 */
public class Program_7_SalesCommission {
    public static void main(String[] args) {
        //scanner declaration for reading input from comsole
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seller's name :");
        String name = scanner.nextLine();
        System.out.println("Enter seller's ID :");
        int sellerId = scanner.nextInt();
        System.out.println("Enter Sales Amount: ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic salary:");
        int basicSalary = scanner.nextInt();
        //creating object to call instance method
        Program_7_SalesCommission salesCommission = new Program_7_SalesCommission();
        int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller's name                 :" + name);
        System.out.println("Seller's Id                   :" + sellerId);
        System.out.println("Sales Amount                  :" + salesAmount);
        System.out.println("Sellet's basic Salary         :" + basicSalary);
        System.out.println("Sellet's gross Salary         :" + grossSalary);
        //closing the scanner object
        scanner.close();
    }

    //calculating the sum commission
    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales commission is :" + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales commission is:" + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales commission is:" + commission);
        } else {
            commission = (salesAmount * 2) / 100;
        }
        return commission;
    }
}