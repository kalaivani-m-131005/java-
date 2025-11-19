import java.util.Scanner;
public class patcros{
	public static void main(String args[]) {
		System.out.print("Enter the no:");
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
        int num=1;{
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if(col==row||col==n-row+1){	System.out.print(" *");}
				else{
					System.out.print("  ");
				}
			}
			        System.out.println();
                        }	}
}
}
/*Enter the no:5
 *       *
   *   *
     *
   *   *
 *       *   */