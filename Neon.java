import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int sq = n * n;   // square of number
        int sum = 0;

        while (sq > 0) {
            sum += sq % 10; // add last digit
            sq /= 10;       // remove last digit
        }

        if (sum == n)
            System.out.println(n + " is a Neon number");
        else
            System.out.println(n + " is not a Neon number");
    }
}
