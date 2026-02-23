import java.util.Scanner;

public class BoundryElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print((i == 0 || j == 0 || i == r - 1 || j == c - 1) ? a[i][j] + " " : " ");
            }
        System.out.println();
        }
    }
}
/*3
3
1 2 3 4 5 6 7 8 9
1 2 3 
4  6
7 8 9 */