/*Q16: GCD (Euclidean Algorithm) [Medium]
- Input: 48 18
Output: 6
- Input: 24 36
Output: 12
 */

 import java.util.Scanner;

public class Q16_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);  // GCD

        sc.close();
    }
}
