package homework_week_7;

import java.util.Scanner;

/**
 * WAP to input employee ID,name,basic salary then find HRA,TA,DA,PF and gross.
 * Salary
 * HRA=basic salary 10%
 * DA=basic salary 8%
 * TA=basic salary 9%
 * PF=basic salary 20%
 * Gross salary=basic salary+HRA+TA+DA-PF
 * print in following format
 * ---------------------------------------------------
 * Salary Slip  |                                |
 * ---------------------------------------------------
 * Employee ID |        2564                     |
 * Employee Name |       Jay                     |
 * ---------------------------------------------------
 * Basic Salary   |     25000.00                  |
 * HRA 10%     |        2500.0                  |
 * DA  8%      |        2250.0                  |
 * TA  9%     |        2000.0                   |
 * PF-20%     |       5000.0                    |
 * --------------------------------------------------
 * Gross salary:      26750.0                      |
 */
public class Program_5_SalarySlip {
    public static void main(String[] args) {
        //scanner declarartion for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();

        System.out.println("Enter your Employee ID:");
        int employeeid = scanner.nextInt();

        System.out.println("Enter your Basic Salary");
        double basicSalary = scanner.nextDouble();

        //calculating HRA,TA,DA,PF
        double hRA = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA(basicSalary);
        double pf = calculatePF(basicSalary);

        //calculating gross salary
        double grossSalary = basicSalary + hRA + da + ta - pf;

        System.out.println("-------------------------------------");
        System.out.println("|Salary Slip                         |");
        System.out.println("-------------------------------------");
        System.out.println("|Employee ID:    " + employeeid + "        |");
        System.out.println("|Employee Nmane: " + name + "        |");
        System.out.println("-------------------------------------");
        System.out.println("|Basic Salary   :  " + basicSalary + "  |");
        System.out.println("|HRA 10% :  " + hRA + "                     |");
        System.out.println("|TA 9%   " + ta + "                     |");
        System.out.println("|DA 8%:  " + da + "                      |");
        System.out.println("|PF-20% :  " + pf + "                    |");
        System.out.println("-------------------------------------");
        System.out.println("|Gross Salary  " + grossSalary + "                    |");

        //closing scanner object
        scanner.close();
    }

    //calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    //calculate DA
    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8) / 100;
    }

    //calculate TA
    public static double calculateTA(double basicSalary) {
        return (basicSalary * 9) / 100;
    }

    //calculate PF
    public static double calculatePF(double basicSalary) {
        return (basicSalary * 20) / 100;
    }
}

