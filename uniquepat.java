

import java.util.Scanner;
public class uniquepat{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<n;row++){
            for(int col=1;col<row;col++){
                System.out.print(" *");}
                for(int col=row;col>1;col--){
                    System.out.println(" *");
                }
            System.out.println();
        }
    }
}/*

6
* *

 * * *
 *

 * * * *
 *
 *

 * * * * *
 *
 *
 *
              */
