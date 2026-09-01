/*Q19: Product of Digits [Easy]
- Input: 123
Output: 6
- Input: 405
Output: 0
 */

 import java.util.Scanner;

public class Q19_ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;

        if (n == 0) {
            product = 0; // Edge case: 0
        } else {
            while (n != 0) {
                int digit = n % 10;
                product *= digit;
                n = n / 10;
            }
        }

        System.out.println(product);

        sc.close();
    }
}
