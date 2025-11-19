
import java.util.Scanner;
public class homepat1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");}{
                    for(int k=0;k<(2*i+1);k++){
                        System.out.print("*");}
                    
                   
                 
                    System.out.println();
                }
       
   
        }
        for(int l=0;l<n;l++){
            for(int m=0;m<=n+5;m++){
                
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    
}/*5
     *
    ***
   *****
  *******
 *********
***********
***********
***********
***********
*********** */
