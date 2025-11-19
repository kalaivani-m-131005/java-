import java.util.Scanner;
public class patnum{
	public static void main(String args[]) {
		System.out.print("Enter the no:");
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
        int num=1;{
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=row;col++) {
					System.out.print(num%10);
                     num++;}

                     System.out.println();
                        }	}
}
}
/*Enter the no:4
1
23
456
7890 */