/*
 Q7. Max of 3 Numbers (Easy)
Find the maximum of three numbers.
Input format :
Three integers separated by spaces.
Output format :
The maximum number.
Sample test cases :
Input :
5 7 3
Output :
7
Input :
12 45 23
Output :
45

 */

import java.util.Scanner;

public class Q7_maxofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three interger:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));

        System.out.println("Max:" + max);
    }
}
