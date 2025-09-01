/*
 Q6. Max & Min of 2 Numbers (Easy)
Find the maximum and minimum of two numbers.
Input format :
Two integers separated by a space.
Output format :
Maximum and minimum value.
Sample test cases :
Input :
5 9
Output :
Max=9 Min=5
Input :
12 7
Output :
Max=12 Min=7

 */
import java.util.Scanner;
public class Q6_maxmin {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter Two Integer :");

        int i=src. nextInt();
        int j=src.nextInt();
        System.out.println("i = " + i + ", j = " + j);{
        if(i >= j) 
    System.out.println("Max=" + i + " Min=" + j);
else  
    System.out.println("Max=" + j + " Min=" + i);

    }
    }
}
