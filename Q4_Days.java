/*
 * Q4. Convert Days into Years, Months, Days (Medium)
Convert the given number of days into completed years, months, and remaining days. Assume 1
year = 365 days, 1 month = 30 days.
Input format :
The input consists of an integer (days).
Output format :
The output prints completed years, months, and days.
Sample test cases :
Input :
400
Output :
Years: 1
Months: 1
Days: 5

 */


import java.util.Scanner;

public class Q4_Days {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the days: ");
        int i = scr.nextInt();

        int year, rdays, month, days;
        year = i / 365;     
        rdays = i % 365;     
        month = rdays / 30;      
        days = rdays % 30;      

        System.out.println("Years: " + year);
        System.out.println("Months: " + month);
        System.out.println("Days: " + days);
    }
}