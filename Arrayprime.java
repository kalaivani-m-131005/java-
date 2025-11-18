import java.util.Scanner;
public class Arrayprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            if (arr[i] > 1) {
                int flag = 0;
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    count++;
                    System.out.println(arr[i] + " is prime");
                } else {
                    System.out.println(arr[i] + " is not prime");
                }
            }
        }
        System.out.println("Total prime numbers = " + count);
    }
}
