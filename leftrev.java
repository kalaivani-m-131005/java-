import java.util.Scanner;
public class leftrev
{
	public static void main(String args[]) {
		System.out.print("Enter the no:");
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();{
		 for(int row=n;row>=1;row--){
			for(int col=1;col<=row;col++) {
			 System.out.print("*");	
			}	
			System.out.println();	
			}
		}	
	}	
	}
	/*Enter the no:4
****
***
**
*
 */
