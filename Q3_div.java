/*
  Q3. Divisible by 3 and 5 (Easy)
Check whether the given number is divisible by both 3 and 5.
Input format :
The input consists of an integer.
Output format :
The output prints "Yes" if divisible, otherwise "No".
Sample test cases :
Input :
15
Output :
Yes
Input :
7
Output :
No

 */


import java.util.Scanner;
public class Q3_div {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int i=src.nextInt();
         System.out.println("");
         if(i/3==0 && i/5==0)
         System.out.println("Yes");
         else{
            System.out.println("No");
         }
    }
    
}
