import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = src.nextInt();
        src.close();

        int originalNumber = n;
        int result = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            result += Math.pow(digit, digits); // add powered digit
            n /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}
