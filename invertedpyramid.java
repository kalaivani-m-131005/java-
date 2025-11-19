

import java.util.Scanner;
public class invertedpyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");}
                {for (int star =1; star <=
                    (2*row-1); star++) {
                    System.out.print("*");
                }
                
            System.out.println();
        }
    }}}
/*
 6
***********
 *********
  *******
   *****
    ***
     *
 */

