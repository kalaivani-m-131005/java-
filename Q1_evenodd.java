/*
 Q1. Even / Odd (Easy)
Write a program to check whether a number is Even or Odd.
Input format :
The input consists of an integer.
Output format :
The output prints "Even" or "Odd".
Sample test cases :
Input :
4
Output :
Even
Input :
7
Output :
Odd

 */



import java.util.Scanner;
class Q1_evenodd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
