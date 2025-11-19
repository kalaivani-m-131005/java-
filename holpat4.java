import java.util.Scanner;
public class holpat4 {
	public static void main(String args[]) {
		System.out.print("Enter the no:");
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		for(int row=1; row<=n; row++){
				 for(int col=1;col<=n;col++){
			if(row == 1 ||row== n  ||col ==1||col== n ){
		  	System.out.print(" *");/*single space */
		}
				else
				{
					System.out.print("  ");/* double space */
				}}
				
				System.out.println();
			
		  }	
		  src.close();
		 }
}
	/* output
	 Enter the no:4
 * * * *
 *     *
 *     *
 * * * *
	 */