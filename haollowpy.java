import java.util.Scanner;
public class haollowpy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<n;row++){
            for(int col=1;col<n-row;col++){
                System.out.print(" ");
            } {
                for (int star = 1; star <= (2 * row - 1); star++) {
                    if(row==n||star==1||star==(2*row-1)){
                System.out.print("*");
               }
                }
                System.out.println();
            }
        }
    }
}
/*

   5
   *
  ***
 *****
*******   */