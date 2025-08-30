/*
 Q2. Positive / Negative (Easy)
Write a program to check whether a number is Positive, Negative, or Zero.
Input format :
The input consists of an integer.
Output format :
The output prints whether the number is "Positive", "Negative" or "Zero".
Sample test cases :
Input :
5
Output :
Positive
Input :
-3
Output :
Negative
Input :
0
Output :
Zero

 */


import java.util.Scanner;

public class Q2_posneg {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int i = src.nextInt();
        System.out.println("Enter any number:");

        if(i > 0){
            System.out.println("Positive");
        } else if(i == 0){
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}


